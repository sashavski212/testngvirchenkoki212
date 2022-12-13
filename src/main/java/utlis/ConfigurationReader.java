package utlis;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ConfigurationReader {
    private static final Properties properties = new Properties();
    private static ConfigurationReader instance;

    private ConfigurationReader(){}

    public static ConfigurationReader get(){
        if(instance == null){
            instance = new ConfigurationReader();
            try{
                properties.load(new FileInputStream("src/main/resources/testData.properties"));
            } catch (IOException ioException){
                ioException.printStackTrace();
            }
        }
        return instance;
    }
    public String getUserName(){
        return properties.getProperty("testdata.user_name");
    }
    public String getUserLastName(){ return properties.getProperty("testdata.user_last_name");}
    public String getPassword(){return  properties.getProperty("testdata.userPassword");}

}

package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomePage extends BasePage{
    private WebElement myAccountMenu = driver.findElement(By.xpath("//span[@type='accountUnfilled']"));

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickOnMyAccountButton(){
        myAccountMenu.click();
        return new LoginPage(driver);
    }


}

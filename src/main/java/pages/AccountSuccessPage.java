package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountSuccessPage extends BasePage {
    private WebElement actualMessage = driver.findElement(By.xpath("//h1"));

    public AccountSuccessPage(WebDriver driver) {
        super(driver);
    }
    public String getActualMessage(){
        waitForElementToAppear(actualMessage);
        return actualMessage.getText();
    }

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {
    private WebElement continueButton = driver.findElement(By.xpath("//a[@data-testid='signup-link']"));

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public CreateAccountPage clickOnContinueButton(){
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        continueButton.click();
        return new CreateAccountPage(driver);
    }

}

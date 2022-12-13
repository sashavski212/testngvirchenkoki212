package example;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;

public class CreateAccountTest extends BaseTest {
    private static final String MESSAGE = "Access Denied";

    @Test
    public void createAccountTest() {
        String actualMessage = new HomePage(driver)
                .clickOnMyAccountButton()
                .clickOnContinueButton()
                .enterFirstName()
                .enterLastName()
                .enterUserEmail()
                .createPassword()
                .selectBirthDay()
                .selectBirthMonth()
                .selectBirthYear()
                .submitEnteredInformation()
                .getActualMessage();
        Assert.assertTrue(actualMessage.contains(MESSAGE));
    }

}
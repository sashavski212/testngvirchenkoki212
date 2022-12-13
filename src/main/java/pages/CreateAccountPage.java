package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utlis.ConfigurationReader;
import utlis.StringUtils;
public class CreateAccountPage extends BasePage {
    private final String USER_NAME = ConfigurationReader.get().getUserName();
    private final String USER_LAST_NAME = ConfigurationReader.get().getUserLastName();
    private final int FIX_LENGTH = 8;
    private final String USER_EMAIL = StringUtils.generateRandomEmail(FIX_LENGTH);
    private final String PASSWORD = ConfigurationReader.get().getPassword();

    private WebElement birthDay = driver.findElement(By.xpath("//select[@name='BirthDay']"));
    private WebElement birthDayDate = driver.findElement(By.xpath("//option[@value='1' and contains(text(), '1')]"));
    private WebElement birthMonth = driver.findElement(By.xpath("//select[@name='BirthMonth']"));
    private WebElement birthMonthDate = driver.findElement(By.xpath("//option[@value='1' and contains(text(), 'January')]"));
    private WebElement birthYear = driver.findElement(By.xpath("//select[@name='BirthDay']"));
    private WebElement birthYearDate = driver.findElement(By.xpath("//option[@value='2000']"));
    private WebElement firstNameField = driver.findElement(By.xpath("//input[@class='qa-firstname-textbox']"));
    private WebElement lastNameField = driver.findElement(By.xpath("//input[@class='qa-lastname-textbox']"));
    private WebElement emailField = driver.findElement(By.xpath("//input[@alt='Email']"));
    private WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
    private WebElement passwordField = driver.findElement(By.xpath("//input[@name='Password']"));

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public CreateAccountPage enterFirstName() {
        firstNameField.sendKeys(USER_NAME);
        return this;
    }

    public CreateAccountPage enterLastName() {
        lastNameField.sendKeys(USER_LAST_NAME);
        return this;
    }

    public CreateAccountPage enterUserEmail() {
        emailField.sendKeys(USER_EMAIL);
        return this;
    }

    public CreateAccountPage selectBirthDay() {
        birthDay.click();
        birthDayDate.click();
        return this;
    }

    public CreateAccountPage selectBirthMonth() {
        birthMonth.click();
        birthMonthDate.click();
        return this;
    }
    public CreateAccountPage selectBirthYear() {
        birthYear.click();
        birthYearDate.click();
        return this;
    }

    public CreateAccountPage createPassword() {
        passwordField.sendKeys(PASSWORD);
        return this;
    }

    public AccountSuccessPage submitEnteredInformation() {
        submitButton.click();
        return new AccountSuccessPage(driver);
    }

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    public By textHeadingLabel = By.id("login-page--heading");
    public By inputEmailField = By.cssSelector("input[type = email]");
    public By buttonLogin = By.cssSelector("input[type = submit");
    public By alertIncorrectPassword = By.cssSelector("div.alert.fade.in.alert-danger");



    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickButtonLogin () {
        driver.findElement(buttonLogin).click();
        return new LoginPage(driver);
    }

    public LoginPage enterTextEmailField (String email) {
        driver.findElement(inputEmailField).sendKeys(email);
        return new LoginPage(driver);
    }

    public String getHeadingText () {
        return  driver.findElement(textHeadingLabel).getText();
    }

    public String getEmailFieldText () {
        return  driver.findElement(inputEmailField).getText();
    }

    public Boolean isAlertVisible () {
        return driver.findElement(alertIncorrectPassword).isDisplayed();
    }


}

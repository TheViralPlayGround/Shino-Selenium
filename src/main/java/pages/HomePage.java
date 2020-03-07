package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage (WebDriver driver) {
        this.driver = driver;
    }

    public By buttonLogin = By.linkText("Log In");

    public LoginPage clickButtonLogin () {
        driver.findElement(buttonLogin).click();
        return new LoginPage(driver);
    }
}

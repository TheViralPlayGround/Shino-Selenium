package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

    LoginPage loginPage;
    String testEmail = "jvargas12@gmail.com";

    @Test
    public void verifyLoginPageOpensFromHomeAndShowsHeading() {

        loginPage = homePage.clickButtonLogin();

        assertEquals(loginPage.getHeadingText(), "Log in");
    }

    @Test
    public void verifyLoginWithoutPasswordShowsAlert() {

        loginPage = homePage.clickButtonLogin()
        .enterTextEmailField(testEmail)
        .clickButtonLogin();

        assertTrue(loginPage.isAlertVisible());
    }
}

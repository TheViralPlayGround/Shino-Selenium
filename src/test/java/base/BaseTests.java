package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    public void waitTimeout(int seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    @BeforeClass
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.sayrhino.com/");
        homePage = new HomePage(driver);
        Thread.sleep(5000);
    }
//    public void logIn() throws InterruptedException {
//        loginPage.clickLoginButton();
//        loginPage.setEmail(email);
//        loginPage.setPassword(password);
//        loginPage.clickSuccessfulSubmitButton();
////        Thread.sleep(5000);
////        driver.navigate().to("https://www.instagram.com/explore/");
//        Thread.sleep(5000);
//        loginPage.clickFirstPic();
//        Thread.sleep(5000);
//
//        for (int i = 0; i<40; i++){
//            loginPage.clickLike();
//            Thread.sleep(2000);
//            loginPage.clickNext();
//            Thread.sleep(2000);
//        }
//        driver.close();
//    }
}

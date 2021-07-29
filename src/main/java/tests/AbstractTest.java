package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class AbstractTest {
    protected static WebDriver driver;
    @BeforeSuite
    public void setUpSuite() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://google.com");
    }

    @AfterSuite
    public void tearDownSuite() {
        driver.quit();
    }
}

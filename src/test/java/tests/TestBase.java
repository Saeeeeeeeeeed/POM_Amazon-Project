package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class TestBase {

    //this page used to use the setup and teardown function for all the suite

    public static WebDriver driver;

    @BeforeSuite
    public void setup(){



        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.navigate().to("https://www.amazon.eg/");
    }

   @AfterSuite
    public void teardown()
    {
        driver.quit();
    }
}

package utils;

import pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTests {

    private static WebDriver driver;
    public static MainPage mainPage;

    @BeforeClass
    public static void launchApplication(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vlad\\Documents\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        mainPage = new MainPage();
    }
    @AfterClass
    public static void closeBroweser(){
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}

package tests;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DemoQATests {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(description = "Verify the title of demoqa.com")
    @Description("Open https://demoqa.com and verify title contains 'DEMOQA'")
    public void verifyHomePageTitle() {
        driver.get("https://demoqa.com");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("DEMOQA"), "Title is not correct!");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

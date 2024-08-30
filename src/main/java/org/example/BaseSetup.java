package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSetup {

    public WebDriver driver;

    @Before
    public void setup() {
        // Automatically setup ChromeDriver
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

}

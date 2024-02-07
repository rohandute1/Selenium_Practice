package com.bridgelabz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser_Navigation {
    public WebDriver driver;
    @Test
    public void navigate() throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().to("https://www.flipkart.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.close();
    }
}

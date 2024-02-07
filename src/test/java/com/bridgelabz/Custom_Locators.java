package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Custom_Locators {
public WebDriver driver;
@Test
    public void custom_Locators() throws InterruptedException {
     driver = new ChromeDriver();
     driver.get("https://www.facebook.com");
     driver.manage().window().maximize();
     Thread.sleep(2000);
     driver.findElement(By.cssSelector("input.inputtext")).sendKeys("rohan");
     Thread.sleep(1000);
     driver.findElement(By.cssSelector("#pass")).sendKeys("Rohan@1");
    }
}

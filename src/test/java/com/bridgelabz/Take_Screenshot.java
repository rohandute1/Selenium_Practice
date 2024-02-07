package com.bridgelabz;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;


public class Take_Screenshot {
    public WebDriver driver;
    @Test
    public void take_Screenshot() throws IOException {
        driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
        File SFile = takeScreenshot.getScreenshotAs(OutputType.FILE);
        File DFile = new File("C:\\Users\\hp\\OneDrive\\Desktop\\Testing\\" + "fbSC.png");
        FileHandler.copy(SFile, DFile);
    }
}

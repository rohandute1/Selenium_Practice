package com.bridgelabz;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class IFrames {
    public WebDriver driver;
    @Test
    public void iframe() throws InterruptedException, IOException {
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@id='runbtn']")).click();

        driver.switchTo().frame("iframeResult");   // switch to ifram by the iframe id name
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
    }


}

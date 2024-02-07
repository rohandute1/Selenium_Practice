package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import java.awt.*;
import java.io.IOException;

public class Facebook_Register_And_Login {
    public WebDriver driver;
    @Test
    public void facebookRegister() throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Rohan");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Dute");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("rohandute10@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("rohandute10@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("15499@FB");
        Thread.sleep(2000);
        driver.findElement(By.name("birthday_day")).sendKeys("15");
        Thread.sleep(2000);
        driver.findElement(By.name("birthday_month")).sendKeys("Apr");
        Thread.sleep(2000);
        driver.findElement(By.name("birthday_year")).sendKeys("1999");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
    }
    @Test (priority = 1)
    public void facebookLogin() throws InterruptedException, IOException, AWTException {

        driver = new ChromeDriver();
        ChromeOptions removeNotification=new ChromeOptions();
        removeNotification.addArguments("--disable-notifications");

        driver=new ChromeDriver(removeNotification);

        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("rohandute10@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("15499@FB");
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(3000);
    }
}

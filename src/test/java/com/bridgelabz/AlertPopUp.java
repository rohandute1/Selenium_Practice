package com.bridgelabz;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class AlertPopUp {

    public WebDriver driver;

    @Test
    public void alert() throws InterruptedException, IOException {
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='runbtn']")).click();
        driver.switchTo().frame("iframeResult");   // switch to ifram by the iframe id name
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        Thread.sleep(1000);


        Alert alert= driver.switchTo().alert();
        System.out.println(alert.getText());

        alert.accept();
        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());
    }
    @Test
    public void alertname() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@id='runbtn']")).click();

        driver.switchTo().frame("iframeResult");   // switch to ifram by the iframe id name

        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        Thread.sleep(1000);

        Alert alert= driver.switchTo().alert();

        alert.sendKeys("Sanket");
        Thread.sleep(1000);
        alert.accept();
    }
    @Test
    public void demo1() throws InterruptedException {
        driver= new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@id='alertButton']")).click();
        Thread.sleep(1000);

        Alert alert=driver.switchTo().alert();
        alert.accept();
    }
}
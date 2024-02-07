package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Action_Class {
    public WebDriver driver;

    @Test
    public void action() throws InterruptedException, AWTException {

        driver= new ChromeDriver();
        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        Actions actions = new Actions(driver);
        Robot r = new Robot();

        r.mouseMove(500, 150);

        WebElement element=driver.findElement(By.xpath("//*[@name='search_query']"));
        actions.click(element).perform();

        r.keyPress(KeyEvent.VK_SHIFT);
        r.keyPress(KeyEvent.VK_J);
        r.keyRelease(KeyEvent.VK_J);
        r.keyRelease(KeyEvent.VK_SHIFT);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_A);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        Thread.sleep(500);
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_A);
        Thread.sleep(500);
        WebElement search = driver.findElement(By.xpath("//*[@id='search-icon-legacy']"));
        r.mouseMove(1000, 150);

//        actions.sendKeys("Java").perform();
//        actions.doubleClick().perform();

        actions.click(search).perform();

        Thread.sleep(5000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (int i =0;i<3;i++) {
            js.executeScript("window.scrollBy(0, 1000)");
            Thread.sleep(2000);
        }
    }
}

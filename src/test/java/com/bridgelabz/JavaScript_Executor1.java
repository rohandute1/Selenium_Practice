package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScript_Executor1 {
    @Test
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/hp/OneDrive/Desktop/Testing/JavaScriptExecuter.html");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Example: Scroll to the bottom of the page
        WebElement id = driver.findElement(By.id("t2"));
        js.executeScript("arguments[0].value = 'Rohan'", id);
        WebElement id1 = driver.findElement(By.id("t1"));
        js.executeScript("arguments[0],id = 't1'", id1);
    }
}
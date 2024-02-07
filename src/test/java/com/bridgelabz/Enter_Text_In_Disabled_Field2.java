package com.bridgelabz;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Enter_Text_In_Disabled_Field2 {
    public WebDriver driver;
    @Test
    public void nter_Text_In_Disabled_Field() throws InterruptedException {

        driver = new ChromeDriver();

        driver.get("file:///C:/Users/hp/OneDrive/Desktop/Testing/JavaScriptExecuter.html");
//Typecast the driver object to JavascriptExecutor interface type
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
//enter "admin" in first textbox using javascript
        js.executeScript("document.getElementById('t1').value='admin'");
        Thread.sleep(2000);
//clear the value in second textbox using javascript
        js.executeScript("document.getElementById('t2').value=''");
//enter "manager" in second textbox using javascript
        js.executeScript("document.getElementById('t2').value='manager'");
//change the second text box to button type using Javascript
        js.executeScript("document.getElementById('t2').type='button'");
    }
}

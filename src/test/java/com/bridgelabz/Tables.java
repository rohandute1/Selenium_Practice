package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;

public class Tables {
    public WebDriver driver;
    @Test
    public void m2() throws InterruptedException{

        driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        List<WebElement> list = driver.findElements(By.xpath("//table[@name='BookTable']//parent::tr"));

        System.out.println(list.get(0).getText());
        System.out.println(list.size());

        for (int i =1;i<list.size();i++){
            WebElement name = driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+(i+1)+"]/td[1]"));
            System.out.println(name.getText());
        }
    }
}
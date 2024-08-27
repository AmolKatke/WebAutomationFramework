package com.WebAutomationframe.test;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class StaleElementException {
    public static void main(String[] args) {
       // StaleElement Reference  Exception //

        WebDriver driver =new EdgeDriver();
        driver.get("https://google.com");
//        WebElement serchbox_textarea = driver.findElement(By.name("q"));
//        driver.navigate().refresh(); //u have again serch Element
//        WebElement serchbox_textarea1 = driver.findElement(By.name("q"));
//
//        serchbox_textarea.sendKeys("thetesttingacademy");
        driver.quit();
    }
}

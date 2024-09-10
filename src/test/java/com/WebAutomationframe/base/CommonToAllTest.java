package com.WebAutomationframe.base;

import com.WebAutomationframe.driver.DriverManager;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class CommonToAllTest {
    //To Call the Start the Webdriver
    //Down The WebDriver
    //Start  WebDriver start

    @BeforeMethod
    public void setup() throws FileNotFoundException, MalformedURLException {
        DriverManager.init();

    }
    @AfterMethod
    public void tearDown(){
        DriverManager.down();

    }
}

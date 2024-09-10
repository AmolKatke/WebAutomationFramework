package com.WebAutomationframe.test;

import com.WebAutomationframe.base.CommonToAllTest;
import com.WebAutomationframe.Page.pageFatory.LoginPage_PF;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static com.WebAutomationframe.driver.DriverManager.driver;


public class TestVWOLogin_PF extends CommonToAllTest  {
    @Test
    public void testLoginNegativeVWO() throws InterruptedException, FileNotFoundException {
        WebDriver driver =new EdgeDriver();
        driver.get("https://app.vwo.com");
        LoginPage_PF loginPage_PF =new LoginPage_PF(driver);
        String error_msg = loginPage_PF.loginToVWOInvalidCreds();
        Assert.assertEquals(error_msg,"Your email, password, IP address or location did not match");
        driver.quit();



    }

}

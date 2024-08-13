package test_code.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageObjectModel.LoginPage_POM;

public class TestVWOLogin_POM {
    @Test
    public void testLoginNegativeVWO() throws InterruptedException {
       WebDriver driver =new EdgeDriver();
        LoginPage_POM loginPagePom =new LoginPage_POM(driver);
        String error_msg_text = loginPagePom.loginToVWOInvalidCreds("admin@gmail.com","admin");
        Assert.assertEquals(error_msg_text,"Your email, password, IP address or location did not match");
        driver.quit();
    }
    @Test
    public void testLoginNegativeVWO2(){
        WebDriver driver = new EdgeDriver();
        LoginPage_POM loginPagePom = new LoginPage_POM(driver);
        String error_msg_text = loginPagePom.loginToVWOInvalidCreds("pramod@gmail.com","admin");
        Assert.assertEquals(error_msg_text,"Your email, password, IP address or location did not match");
        driver.quit();
    }


}

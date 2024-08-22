package com.WebAutomationframe.test;
import com.WebAutomationframe.base.CommonToAllPage;
import com.WebAutomationframe.base.CommonToAllTest;
import com.WebAutomationframe.Page.pageFatory.LoginPage_PF;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.FileNotFoundException;
import static com.WebAutomationframe.driver.DriverManager.driver;

public class TestVWOLogin_PF_DM extends CommonToAllTest  {
    private static final Logger logger = LogManager.getLogger(TestVWOLogin_PF_DM.class);

    @Test
    public void testLoginNegativeVWO() throws InterruptedException, FileNotFoundException {
        logger.info("Starting Test");
        LoginPage_PF loginPage_PF = new LoginPage_PF(driver);
        logger.info("Opening the URL");
        loginPage_PF.openVWOLoginURL("qa");
        String error_msg = loginPage_PF.loginToVWOInvalidCreds();
        logger.info("Verifying the Result");
        Assert.assertEquals(error_msg,"Your email, password, IP address or location did not match");

        //AssertJ
        Assertions.assertThat(error_msg).isNotNull().isNotBlank();
//Expected result should not be blank or null



        driver.quit();



    }

}

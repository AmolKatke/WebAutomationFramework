package com.WebAutomationframe.Page.pageFatory;

import com.WebAutomationframe.base.CommonToAllPage;
import com.WebAutomationframe.utils.Propertyreader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import java.io.FileNotFoundException;

public class LoginPage_PF extends CommonToAllPage {

    WebDriver driver;

    public LoginPage_PF(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }
//PAge Locatoer

    @FindBy( id ="login-username")
    private WebElement username;

    @FindBy( id ="login-password")
    private WebElement password;

    @FindBy( id ="js-login-btn")
    private WebElement signButton;

    @FindBy(css = "#js-notification-box-msg")
    private  WebElement error_message;


    //pAge ACtion
    public String loginToVWOInvalidCreds() throws InterruptedException, FileNotFoundException {
//        username.sendKeys("admin@admin.com");
//        password.sendKeys("password123");
//        signButton.click();
        //after driver and commenTO all FIle create

//        enterInput(username,"admin@admin.com");
//        enterInput(password,"admin123");
//        clickElement(signButton);

        enterInput(username, Propertyreader.readKey("invalid_username"));
        enterInput(password,Propertyreader.readKey("invalid_password"));
        clickElement(signButton);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

         return error_message.getText();

    }


}

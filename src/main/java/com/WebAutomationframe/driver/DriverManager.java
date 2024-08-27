package com.WebAutomationframe.driver;

import com.WebAutomationframe.utils.Propertyreader;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.FileNotFoundException;
import java.util.Map;

public class DriverManager {
    public static WebDriver driver;
    private static String browser;
//why using Static funtion
    //becoz we dont want Option Class

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        DriverManager.driver = driver;
    }
    public static void init() throws FileNotFoundException {
        String browser = Propertyreader.readKey("browser");
                    EdgeOptions edgeOptions = new EdgeOptions();
                    edgeOptions.addArguments("--start-maximized");
                    edgeOptions.addArguments("--headless");
                    edgeOptions.addArguments("--disable-gpu");
                    edgeOptions.addArguments("--no-sandbox");
                   // edgeOptions.addArguments("--guest");
                    edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                    edgeOptions.setCapability("timeouts", Map.of("pageLoad", 60000));
                    driver = new EdgeDriver(edgeOptions);



        }

    public static void down(){
        if (DriverManager.driver!=null) {
            DriverManager.driver.quit();
        }

  }
}






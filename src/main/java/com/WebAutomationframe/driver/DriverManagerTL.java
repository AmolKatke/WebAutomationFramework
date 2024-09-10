package com.WebAutomationframe.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import java.net.MalformedURLException;
import java.util.Objects;

public class DriverManagerTL {

        public static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();


        public static void setDriver(WebDriver driverRef){
            driver.set(driverRef);
        }

        public static WebDriver getDriver(){
            return driver.get();
        }

        // Unload
        public static void unload(){
            driver.remove();
        }

        public static void down() {
            if (Objects.nonNull(DriverManagerTL.getDriver())) {
                getDriver().quit();
                unload();
            }
        }

        public static void init() throws MalformedURLException {
            if (Objects.isNull(DriverManagerTL.getDriver())){
                EdgeOptions options = new EdgeOptions();
                options.addArguments("--guest");
                options.addArguments("--remote-allow-origins=*");
                WebDriver driver = new EdgeDriver(options);
                setDriver(driver);
            }
        }
}

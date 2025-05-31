package org.selenium.pom.Base;

import org.openqa.selenium.WebDriver;
import org.selenium.pom.factory.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

protected WebDriver driver;
    @BeforeMethod
    public void startDriver(){

        driver = new DriverManager().intilaizeDriver();

    }

    @AfterMethod
    public void quitDriver(){
        driver.quit();

    }
}

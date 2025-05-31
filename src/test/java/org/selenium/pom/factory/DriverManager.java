package org.selenium.pom.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverManager {


    public WebDriver intilaizeDriver(){
        WebDriver  driver = new ChromeDriver();
        driver.manage().window().maximize();
    return driver; }
}

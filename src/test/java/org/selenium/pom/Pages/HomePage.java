package org.selenium.pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.pom.Base.BasePage;

public class HomePage extends BasePage {

    private final By storeMenuLink = By.id("menu-item-1227");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage load(){
        load("");
        return this;
    }

    public void clickStoreMenuLink(){
        driver.findElement(storeMenuLink).click();

    }
}

package org.selenium.pom.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected WebDriverWait longWait;

    public BasePage(WebDriver driver){
        this.driver  = driver;
        wait = new WebDriverWait(driver,Duration.ofSeconds(15));
        longWait = new WebDriverWait(driver,Duration.ofSeconds(30));
    }

    public BasePage load(String endPoint){
        driver.get("https://askomdch.com/"+endPoint);
        return this;
    }

    public void waitForOverlaysToDisappear(By WebElement){

        List<WebElement> overlays =  driver.findElements(WebElement);
        if(!overlays.isEmpty()){
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                    ExpectedConditions.invisibilityOfAllElements(overlays));
        }

    }
    public void waitTillElementToLoad(By WebElement){
        longWait.until(ExpectedConditions.visibilityOfElementLocated(WebElement));
    }
    public void waitTillElementClickable(WebElement webElement){
        longWait.until(ExpectedConditions.elementToBeClickable(webElement));

    }
}

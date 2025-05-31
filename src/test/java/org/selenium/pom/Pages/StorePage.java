package org.selenium.pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium.pom.Base.BasePage;

import java.time.Duration;

public class StorePage extends BasePage {

    private final By searchFld = By.id("woocommerce-product-search-field-0");
    private final By searchBtn = By.xpath("//button[@value=\"Search\"]");
    private final By title = By.xpath("//*[@class='woocommerce-products-header__title page-title']");
    private final By viewCart = By.cssSelector(".woocommerce a.added_to_cart");
    public StorePage(WebDriver driver) {
        super(driver);
    }

    public void typeTextSearchField(String text){
       driver.findElement(searchFld) .sendKeys(text);

    }

    public void clickSearchBtn(){
        driver.findElement(searchBtn).click();

    }
    public String getTitle(){
      return longWait.until(ExpectedConditions.visibilityOfElementLocated(title)).getText();
        //waitTillElementToLoad(title);


    }

    private By getAddToCartBtnElement(String productName){
       return By.cssSelector("a[aria-label='Add “"+productName+"” to your cart']");
    }
    public void clickAddToCart(String productName){
     By addToCartBtn = getAddToCartBtnElement(productName);
     driver.findElement(addToCartBtn).click();

    }
    public void viewCart(){
      //  longWait.until(ExpectedConditions.elementToBeClickable(viewCart)).click();
        WebElement e = driver.findElement(viewCart);
        waitTillElementClickable(e);
        e.click();
     //  new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".woocommerce a.added_to_cart")));

    }


}

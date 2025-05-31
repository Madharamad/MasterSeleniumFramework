package org.selenium.pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.pom.Base.BasePage;

public class CartPage extends BasePage {


   private final By checkoutBTn = By.cssSelector(".checkout-button.button.alt.wc-forward");


  public void clickCheckout(){

      driver.findElement(checkoutBTn).click();
  }










    public CartPage(WebDriver driver) {
        super(driver);
    }



}

package org.selenium;


import com.fasterxml.jackson.core.JsonProcessingException;
import org.openqa.selenium.By;
import org.selenium.pom.Base.TestBase;
import org.selenium.pom.Pages.CartPage;
import org.selenium.pom.Pages.CheckoutPage;
import org.selenium.pom.Pages.HomePage;
import org.selenium.pom.Pages.StorePage;
import org.selenium.pom.objects.BillingAddress;
import org.selenium.pom.utils.JacksonUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;

public class MyFirstTest extends TestBase {

    @Test

    public void guestCheckoutUsingDirectBankTransfer() throws IOException {
        BillingAddress billingAddress = new BillingAddress();
        InputStream is = getClass().getClassLoader().getResourceAsStream("myBillingAddress.json");
       billingAddress = JacksonUtils.deserialization(is , billingAddress);

        HomePage homepage = new HomePage(driver).load();
        homepage.clickStoreMenuLink();
        StorePage storePage = new StorePage(driver);
        storePage.typeTextSearchField("Blue");
        storePage.clickSearchBtn();
        Assert.assertEquals( storePage.getTitle(),"Search results: “Blue”");
        storePage.clickAddToCart("Blue Shoes");
        storePage.viewCart();

        CartPage cart = new CartPage(driver);
        cart.clickCheckout();
        CheckoutPage checkOut = new CheckoutPage(driver);
        checkOut.setBillingAddress(billingAddress);
        checkOut.placeOrder();





    }
}

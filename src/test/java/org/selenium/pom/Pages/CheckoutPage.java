package org.selenium.pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.pom.Base.BasePage;
import org.selenium.pom.objects.BillingAddress;


public class CheckoutPage extends BasePage {

        private final By firstName = By.xpath("//input[@id='billing_first_name']");
        private final By lastName = By.xpath("//input[@id='billing_last_name']");
        private final By companyName = By.xpath("//input[@id='billing_company']");
        private final By houseNumber = By.xpath("//input[@id='billing_address_1']");
        private final By houseName = By.xpath("//input[@id='billing_address_2']");
        private final By city = By.xpath("//input[@id='billing_city']");
        private final By zipCode = By.xpath("//input[@id='billing_postcode']");
        private final By email = By.xpath("//input[@id='billing_email']");
        private final By placeOrderBtn = By.id("place_order");
        private final By overlay = By.xpath("//*[@class='blockUI blockOverlay']");

        public CheckoutPage(WebDriver driver) {
            super(driver);
        }


        public void enterFirstName(String firstname){
            driver.findElement(firstName).clear();
            driver.findElement(firstName).sendKeys(firstname);
        }

        public void enterLastName(String lastname){
            driver.findElement(firstName).clear();
            driver.findElement(lastName).sendKeys(lastname);
        }
        public void enterCompanyName(String company){
            driver.findElement(firstName).clear();
            driver.findElement(companyName).sendKeys(company);
        }
        public void enterHouseNumber(String HouseNb){
            driver.findElement(firstName).clear();
            driver.findElement(houseNumber).sendKeys(HouseNb);
        }
        public void enterHouseName(String name){
            driver.findElement(firstName).clear();
            driver.findElement(houseName).sendKeys(name);
        }
        public void enterCityName(String City){
            driver.findElement(firstName).clear();
            driver.findElement(city).sendKeys(City);
        }
        public void enterZipcode(String ZipCode){
            driver.findElement(firstName).clear();
            driver.findElement(zipCode).sendKeys(ZipCode);
        }
        public void enterEmailId(String Email){
            driver.findElement(firstName).clear();
            driver.findElement(email).sendKeys(Email);
        }
        public void placeOrder(){
            waitForOverlaysToDisappear(overlay);
            driver.findElement(placeOrderBtn).click();
        }

        public CheckoutPage setBillingAddress  (BillingAddress billingAddress) {
            enterFirstName(billingAddress.getFirstName());
            enterLastName(billingAddress.getLastName());
            enterCompanyName(billingAddress.getCompanyName());
            enterHouseNumber(billingAddress.getHouseNumber());
            enterHouseName(billingAddress.getHouseName());
            enterCityName(billingAddress.getCityName());
            enterZipcode(billingAddress.getZipcode());
            enterEmailId(billingAddress.getEmailId());
            return this;
        }
    }




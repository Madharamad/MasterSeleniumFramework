package org.selenium.pom.objects;

public class BillingAddress {

    private String firstName;
    private String lastName;
    private String companyName;
    private String houseNumber;
    private String houseName;
    private String cityName;
    private String zipcode;
    private String emailId;

    public BillingAddress() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public BillingAddress(String firstName, String lastName, String companyName, String houseNumber,
                          String houseName, String cityName, String zipcode, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.houseNumber = houseNumber;
        this.houseName = houseName;
        this.cityName = cityName;
        this.zipcode = zipcode;
        this.emailId = emailId;
    }
}

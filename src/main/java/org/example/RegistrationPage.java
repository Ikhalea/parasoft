package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    WebDriver driver;

    @FindBy(id = "customer.firstName")
    WebElement firstName;

    @FindBy(id = "customer.lastName")
    WebElement lastName;

    @FindBy(id = "customer.address.street")
    WebElement address;

    @FindBy(id = "customer.address.city")
    WebElement city;

    @FindBy(id = "customer.address.state")
    WebElement state;

    @FindBy(id = "customer.address.zipCode")
    WebElement zipCode;

    @FindBy(id = "customer.phoneNumber")
    WebElement phone;

    @FindBy(id = "customer.ssn")
    WebElement ssn;

    @FindBy(id = "customer.username")
    WebElement username;

    @FindBy(id = "customer.password")
    WebElement password;

    @FindBy(id = "repeatedPassword")
    WebElement repeatedPassword;

    @FindBy(xpath = "//input[@value='Register']")
    WebElement registerButton;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void register(String first, String last, String addr, String cty, String st, String zip, String ph, String ssnNum, String user, String pass) {
        firstName.sendKeys(first);
        lastName.sendKeys(last);
        address.sendKeys(addr);
        city.sendKeys(cty);
        state.sendKeys(st);
        zipCode.sendKeys(zip);
        phone.sendKeys(ph);
        ssn.sendKeys(ssnNum);
        username.sendKeys(user);
        password.sendKeys(pass);
        repeatedPassword.sendKeys(pass);
        registerButton.click();
    }

}

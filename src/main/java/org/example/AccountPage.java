package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

    WebDriver driver;

    @FindBy(linkText = "Open New Account")
    WebElement openAccountLink;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openNewAccount() {
        openAccountLink.click();
    }

}

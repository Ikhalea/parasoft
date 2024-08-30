package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TransferFundsPage {

    WebDriver driver;



    @FindBy(xpath = "//input[@id='amount']")
    WebElement amountField;

    @FindBy(xpath = "//input[@value='Transfer']")
    WebElement transferButton;

    public TransferFundsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void transferFunds(String amount) {
        amountField.sendKeys(amount);
        transferButton.click();
    }


}

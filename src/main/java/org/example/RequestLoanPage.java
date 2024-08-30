package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestLoanPage {

    WebDriver driver;

    @FindBy(id = "amount")
    WebElement loanAmountField;

    @FindBy(id = "downPayment")
    WebElement downPaymentField;

    @FindBy(xpath = "//input[@value='Apply Now']")
    WebElement applyNowButton;

    public RequestLoanPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void requestLoan(String amount, String downPayment) {
        loanAmountField.sendKeys(amount);
        downPaymentField.sendKeys(downPayment);
        applyNowButton.click();
    }
}

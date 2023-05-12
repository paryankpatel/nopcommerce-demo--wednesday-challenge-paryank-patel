package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailId;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement clickOnLogin;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutLink;


    public String getWelcomeText() {
        CustomListeners.test.log(Status.PASS, "Get text Welcome");
        Reporter.log("Get text Welcome" + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailId, email);
        Reporter.log("Enter Email" + emailId.toString());
        CustomListeners.test.log(Status.PASS, "Enter email");
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        Reporter.log("Enter password" + password.toString());
        CustomListeners.test.log(Status.PASS, "CEnter password");
    }

    public void clickOnLoginButton() {
        clickOnElement(clickOnLogin);
        Reporter.log("Click on login Button" + clickOnLogin.toString());
        CustomListeners.test.log(Status.PASS, "Click on login Button");
    }

    public String getErrorMessage() {
        CustomListeners.test.log(Status.PASS, "Get error message");
        Reporter.log("Get error message" + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

    public String displayLogOutLink() {
        CustomListeners.test.log(Status.PASS, "Log out button");
        Reporter.log("Log out button" + logOutLink.toString());
        return getTextFromElement(logOutLink);
    }
}
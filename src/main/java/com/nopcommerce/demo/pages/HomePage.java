package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerTab;

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        Reporter.log("Click on login Button" + loginLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on login Button");
    }
    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        Reporter.log("Click on Register Button" + registerLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on Register Button");
    }
    public void clickOnComputerTab(){
        clickOnElement(computerTab);
        Reporter.log("lick on computer tab" + computerTab.toString());
        CustomListeners.test.log(Status.PASS, "Click on computer tab");

    }
}

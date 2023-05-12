package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DesktopsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopsText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Build your own computer']")
    WebElement productName;

    public String verifyDesktopsText(){
        CustomListeners.test.log(Status.PASS, "Get text desktop");
        Reporter.log("Get text desktop" + desktopsText.toString());
        return getTextFromElement(desktopsText);
    }
    public void clickOnProductName() {
        clickOnElement(productName);
        Reporter.log("Click on product name" + productName.toString());
        CustomListeners.test.log(Status.PASS, "lick on product name");
    }
}

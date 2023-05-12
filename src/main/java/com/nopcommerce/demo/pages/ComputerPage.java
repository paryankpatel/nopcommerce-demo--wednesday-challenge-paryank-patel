package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computersText;

    @CacheLookup
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Desktops']")
    WebElement desktopTab;


    public String verifyComputersText() {
        CustomListeners.test.log(Status.PASS, "Get text computers");
        Reporter.log("Get text computers" + computersText.toString());
        return getTextFromElement(computersText);
    }

    public void clickOnDesktopTab() {
        clickOnElement(desktopTab);
        Reporter.log("lick on desktop tab" + desktopTab.toString());
        CustomListeners.test.log(Status.PASS, "Click on desktop tab");
    }
    }



package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectProcessor;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;

    @CacheLookup
    @FindBy(name = "product_attribute_3")
    WebElement selectHDD;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement selectOS;

    @CacheLookup
    @FindBy(xpath = "(//ul[@class='option-list'])[3]")
    WebElement selectSoftware;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement cartButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement productAddedToCart;

    public void selectProcessor(String processor) {
        CustomListeners.test.log(Status.PASS, "Select processor");
        Reporter.log("Select processor" + selectProcessor.toString());
        selectByVisibleTextFromDropDown(selectProcessor, processor);
    }

    public void selectRam(String ram) {
        CustomListeners.test.log(Status.PASS, "Select ram");
        Reporter.log("Select ram" + ram.toString());
        selectByVisibleTextFromDropDown(selectRam,ram);
    }

    public void selectOS(String os) {
        CustomListeners.test.log(Status.PASS, "Select OS");
        Reporter.log("Select HDD" + selectOS.toString());
        clickOnElement(selectOS);
    }
    public void selectHDD(String HDD) {
        CustomListeners.test.log(Status.PASS, "Select HDD");
        Reporter.log("Select HDD" + selectHDD.toString());
        clickOnElement(selectHDD);
    }

    public void selectSoftware(String software) {
        CustomListeners.test.log(Status.PASS, "Select Software");
        Reporter.log("Select Software" + software.toString());
        clickOnElement(selectSoftware);
    }

    public void addToCart() {
        CustomListeners.test.log(Status.PASS, "Add to cart");
        Reporter.log("Add to cart" + cartButton.toString());
        clickOnElement(cartButton);
    }

    public String verifyShoppingCartMessage() {
        CustomListeners.test.log(Status.PASS, "Verify shopping cart");
        Reporter.log("Verify shopping cart" + productAddedToCart.toString());
        return getTextFromElement(productAddedToCart);
    }
}


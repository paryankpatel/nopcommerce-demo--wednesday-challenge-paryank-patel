package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordError;

    @CacheLookup
    @FindBy(xpath = "//span[@class='female']")
    WebElement genderFemale;

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dateOfBirthDay;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthOfBirthDay;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearOfBirthDay;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registerMessage;

    public String getRegisterText() {
        CustomListeners.test.log(Status.PASS, "Get text Welcome");
        Reporter.log("Get text Welcome" + registerText.toString());
        return getTextFromElement(registerText);
    }


    public void clickRegisterButton() {
        CustomListeners.test.log(Status.PASS, "Click on register button");
        Reporter.log("Click on register button" + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String verifyFirstNameErrorMessage() {
        CustomListeners.test.log(Status.PASS, "First name error");
        Reporter.log("First name error" + firstNameError.toString());
        return getTextFromElement(firstNameError);
    }

    public String verifyLastNameErrorMessage() {
        CustomListeners.test.log(Status.PASS, "Get text Welcome");
        Reporter.log("Get text Welcome" + lastNameError.toString());
        return getTextFromElement(lastNameError);
    }

    public String verifyEmailErrorMessage() {
        CustomListeners.test.log(Status.PASS, "Email error");
        Reporter.log("Email error" + emailError.toString());
        return getTextFromElement(emailError);
    }

    public String verifyPasswordErrorMessage() {
        CustomListeners.test.log(Status.PASS, "Password error");
        Reporter.log("Password error" + passwordError.toString());
        return getTextFromElement(passwordError);
    }

    public String verifyConfirmPasswordErrorMessage() {
        CustomListeners.test.log(Status.PASS, "Confirm password error");
        Reporter.log("Confirm password error" + confirmPasswordError.toString());
        return getTextFromElement(confirmPasswordError);
    }

    public void selectGenderFemale() {
        CustomListeners.test.log(Status.PASS, "Select female radio");
        Reporter.log("Select female radio" + genderFemale.toString());
        clickOnElement(genderFemale);
    }

    public void enterFirstName() {
        CustomListeners.test.log(Status.PASS, "Enter first name");
        Reporter.log("Enter first name" + firstName.toString());
        sendTextToElement(firstName, "Lisa");
    }

    public void enterLastName() {
        CustomListeners.test.log(Status.PASS, "Enter last name");
        Reporter.log("Enter last name" + lastName.toString());
        sendTextToElement(lastName, "Verma");
    }

    public void selectDateOfBirthDay() {
        CustomListeners.test.log(Status.PASS, "Select date of birthday");
        Reporter.log("Select date of birthday" + dateOfBirthDay.toString());
        sendTextToElement(dateOfBirthDay, "10");
    }

    public void selectMonthOfBirthDay() {
        CustomListeners.test.log(Status.PASS, "Select month of birthday");
        Reporter.log("Select month of birthday" + monthOfBirthDay.toString());
        sendTextToElement(monthOfBirthDay, "February");
    }

    public void selectYearOfBirthDay() {
        CustomListeners.test.log(Status.PASS, "Select year of birthday");
        Reporter.log("Select year of birthday" + yearOfBirthDay.toString());
        sendTextToElement(yearOfBirthDay, "1980");
    }

    public void enterEmail() {
        CustomListeners.test.log(Status.PASS, "Enter email");
        Reporter.log("Enter email" + email.toString());
        sendTextToElement(email, "Has567@gmail.com");
    }

    public void enterPassword() {
        CustomListeners.test.log(Status.PASS, "Enter password");
        Reporter.log("Enter password" + password.toString());
        sendTextToElement(password, "abcd123");
    }

    public void enterConfirmPassword() {
        CustomListeners.test.log(Status.PASS, "Enter confirm password");
        Reporter.log("Enter confirm password" + confirmPassword.toString());
        sendTextToElement(confirmPassword, "abcd123");
    }

    public String getRegisterMessage() {
        CustomListeners.test.log(Status.PASS, "Get text Register");
        Reporter.log("Get text Register" + registerMessage.toString());
        return getTextFromElement(registerMessage);
    }
}
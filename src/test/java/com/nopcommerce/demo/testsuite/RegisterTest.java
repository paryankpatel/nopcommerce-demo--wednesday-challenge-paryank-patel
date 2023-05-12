package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    RegisterPage registerPage;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        registerPage = new RegisterPage();
        homePage = new HomePage();

    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        //Click on Register Link
        homePage.clickOnRegisterLink();

        //Verify "Register" text
        Assert.assertEquals(registerPage.getRegisterText(), "Register");

    }

    @Test
    public void verifyThatFirstNameLastNameEmailIdPasswordAndConfirmPasswordFieldsAreMandatory() {

        //  Click on Register Link
        homePage.clickOnRegisterLink();

        //  Click on "REGISTER" button
        registerPage.clickRegisterButton();

        //  Verify the error message "First name is required."
        Assert.assertEquals(registerPage.verifyFirstNameErrorMessage(),"First name is required.");

        //  Verify the error message "Last name is required."
        Assert.assertEquals(registerPage.verifyLastNameErrorMessage(),"Last name is required.");

        //  Verify the error message "Email is required."
        Assert.assertEquals(registerPage.verifyEmailErrorMessage(),"Email is required.");

        //    Verify the error message "Password is required."
        Assert.assertEquals(registerPage.verifyPasswordErrorMessage(),"Password is required.");

        //    Verify the error message "Password is required."
        Assert.assertEquals(registerPage.verifyConfirmPasswordErrorMessage(),"Password is required.");
    }
    @Test
    public void VerifyThatUserShouldCreateAccountSuccessfully() throws InterruptedException {
        //        Click on Register Link
        homePage.clickOnRegisterLink();

        //        Select gender "Female"
        registerPage.selectGenderFemale();

        //        Enter firstname
        registerPage.enterFirstName();

        //        Enter lastname
        registerPage.enterLastName();

        //        Select day
        registerPage.selectDateOfBirthDay();

        //        Select day
        registerPage.selectMonthOfBirthDay();

        //        Select year
        registerPage.selectYearOfBirthDay();

        //        Enter email
        registerPage.enterEmail();

        //        Enter password
        registerPage.enterPassword();

        //        Enter Confirm Password
        registerPage.enterConfirmPassword();

        //        Click on "REGISTER" button
        registerPage.clickRegisterButton();

        //        Verify message "Your registration completed"
        Assert.assertEquals(registerPage.getRegisterMessage(),"Your registration completed");
    }
}

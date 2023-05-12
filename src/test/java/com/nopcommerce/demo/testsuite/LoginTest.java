package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        homePage = new HomePage();

    }


    @Test
    public void userShouldNavigateToLoginPageSuccessFully(){
        //Click on login link
        homePage.clickOnLoginLink();

        //verify that "Welcome, Please Sign In!" message display
        Assert.assertEquals(loginPage.getWelcomeText(),"Welcome, Please Sign In!");

    }
    @Test
    public void verifyTheErrorMessageWithInValidCredentials(){
        //Click on login link
        homePage.clickOnLoginLink();

        //Enter EmailId
        loginPage.enterEmailId("has12080@gmail.com");

        // Enter Password
        loginPage.enterPassword("abc123");

        // Click on Login Button
        loginPage.clickOnLoginButton();

        //Verify that the Error message
        Assert.assertEquals(loginPage.getErrorMessage(),"Login was unsuccessful. Please correct the errors and" +
                " try again.\n" + "No customer account found");

    }

    @Test
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredential(){
        //Click on login link
        homePage.clickOnLoginLink();

        //Enter EmailId
        loginPage.enterEmailId("has2080@gmail.com");

        // Enter Password
        loginPage.enterPassword("abc123");

        //Click on Login Button
        loginPage.clickOnLoginButton();

        //Verify that LogOut link is display


    }
}

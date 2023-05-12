package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class ComputerTest extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;

    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();



    }


    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        // Click on Computer tab
        homePage.clickOnComputerTab();

        //Verify "Computer" text
        Assert.assertEquals(computerPage.verifyComputersText(),"Computers");
    }
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        //Click on Computer tab
        homePage.clickOnComputerTab();

        // Click on Desktops link
        computerPage.clickOnDesktopTab();

        // Verify "Desktops" text
        Assert.assertEquals(desktopsPage.verifyDesktopsText(),"Desktops");
    }
    @Test(dataProvider = "productSpecification",dataProviderClass = TestData.class)
    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram,
                                                                                    String hdd, String os, String software){

        // Click on Computer tab
        homePage.clickOnComputerTab();

        // Click on Desktops link
        computerPage.clickOnDesktopTab();

        // Click on product name "Build your own computer"
        desktopsPage.clickOnProductName();

        // Select processor "processor"
        buildYourOwnComputerPage.selectProcessor(processor);

        // Select RAM "ram"
        buildYourOwnComputerPage.selectRam(ram);

        //Select HDD "hdd"
        buildYourOwnComputerPage.selectHDD(hdd);

        //Select OS "os"
        buildYourOwnComputerPage.selectOS(os);

        //Select Software "software"
        buildYourOwnComputerPage.selectSoftware(software);

        //Click on "ADD TO CART" Button
        buildYourOwnComputerPage.addToCart();

        //Verify message "The product has been added to your shopping cart"
        Assert.assertEquals(buildYourOwnComputerPage.verifyShoppingCartMessage(),"The product has been added to your shopping cart");

    }
}
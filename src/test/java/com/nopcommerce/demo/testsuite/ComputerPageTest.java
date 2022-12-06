package com.nopcommerce.demo.testsuite;

import com.google.common.base.Verify;
import com.nopcommerce.demo.pages.AddToCartPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.m;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class ComputerPageTest extends BaseTest {
    AddToCartPage addToCartPage = new AddToCartPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        ComputerPage computerPage = new ComputerPage();

        //1.1 Click on Computer Menu.
        computerPage.mouseHoverToElementAndClickOnComputer();
        // 1.2 Click on Desktop
        computerPage.setClickOnDeskTop();
        //1.3 Select Sort By position "Name: Z to A"
        computerPage.setSelectSortByZToA("Name: Z to A");
        // 1.4 Verify the Product will arrange in Descending order

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        ComputerPage computerPage = new ComputerPage();
        //2.1 Click on Computer Menu.
        computerPage.mouseHoverToElementAndClickOnComputer();
        //2.2 Click on Desktop
        computerPage.setClickOnDeskTop();
        //2.3 Select Sort By position "Name: A to Z"
        computerPage.setSelectSortByAToZ("Name: A to Z");
        //2.4 Click on "Add To Cart"
        Thread.sleep(500);
        computerPage.setClickOnAddToCart();
        //2.5 Verify the Text "Build your own computer"
        String expectedMessage = "Build your own computer";
        Assert.assertEquals(computerPage.getBuildYourComputerText(), expectedMessage, "Message is not displayed");
        // 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        computerPage.selectFirstOptionFromDropDown("2.2 GHz Intel Pentium Dual-Core E2200");
        //  2.7.Select "8GB [+$60.00]" using Select class.
        computerPage.selectFirstOptionFromDropDown2("8GB [+$60.00]");
        //  2.8 Select HDD radio "400 GB [+$100.00]"
        computerPage.selectRadioButtonTab();
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        computerPage.selectRadioButton1Tab();
        // 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander[+$5.00]"
        computerPage.selectCheckbox();
        //2.11 Verify the price "$1,475.00"
        computerPage.verifyPriceText();
        // 2.12 Click on "ADD TO CARD" Button.
        addToCartPage.clickOnAddToCart();
        //2.13 Verify the Message "The product has been added to your shopping cart" on TopGreen Bar After that close the bar clicking on the cross button
        String expectedMessage1 = "The product has been added to your shopping cart";
        Assert.assertEquals(addToCartPage.getText1(), expectedMessage1, "Message is not displayed");
        // After that close the bar clicking on the cross button.
        addToCartPage.clickOnCloseBox();
        //  2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        addToCartPage.mouseHooverAndClickOnAddToCart();
        // 2.15 Verify the message "Shopping cart"
        String expectedMessage2 = "Shopping cart";
        Assert.assertEquals(addToCartPage.getText2(), expectedMessage2, "Message is not displayed");
        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        addToCartPage.updateBasket();
        addToCartPage.updateOnShoppingCart();
        // 2.17 Verify the Total"$2,950.00"
        Thread.sleep(1000);
        String expectedMessage3 = "$2,950.00";
        Assert.assertEquals(addToCartPage.getTextTotal(), expectedMessage3, "Message is not displayed");
        //2.18 click on checkbox “I agree with the terms of service"
        addToCartPage.clickOnCheckBox();
        // 2.19 Click on “CHECKOUT”
        addToCartPage.clickOnCheckOut();
        //2.20 Verify the Text “Welcome, Please Sign In!”
        Thread.sleep(1000);
        // String expectedMessage4 = "Welcome, Please Sign In!";
        //  Assert.assertEquals(addToCartPage.getTexts(), expectedMessage2, "Message is not displayed");
        //2.21Click on “CHECKOUT AS GUEST”Tab
        addToCartPage.setCheckoutGuest();
        //2.22 Fill the all mandatory field
        addToCartPage.enterFirstname("John");
        addToCartPage.enterLastname("white");
        addToCartPage.enterEmail1("123aaa@gmail.com");
        addToCartPage.enterCountry("United Kingdom");
        addToCartPage.enterCity("London");
        addToCartPage.enterAddress1("14 crofts Rd");
        addToCartPage.enterZipPostalCode("wd17 2tr");
        addToCartPage.enterPhoneNumber("07654327856");
        // 2.23 Click on “CONTINUE”
        addToCartPage.setClickOnContinue();
        // 2.24 Click on Radio Button “Next Day Air($0.00)”
        addToCartPage.setNextDayAir();
        //2.25 Click on “CONTINUE”
        addToCartPage.setClickOnContinue1();
        // 2.26 Select Radio Button “Credit Card”
        addToCartPage.selectRadioButton2Tab();
        // 2.27 Select “Master card” From Select credit card dropdown
        addToCartPage.setSelectMasterCard("Master card");

        // 2.28 Fill all the details
        addToCartPage.enterCardHolderName("john white");
        addToCartPage.cardNumber("0795 5666 6667 7777");
        addToCartPage.expireMonth("05");
        addToCartPage.expireYear("2025");
        addToCartPage.cvv("567");
        // 2.29 Click on “CONTINUE”
        addToCartPage.continue1();
        // 2.30 Verify “Payment Method” is “Credit Card”
        String expected5 = "Payment Method:";
        Assert.assertEquals(addToCartPage.getPaymentMethod(), expected5, "Message is not displayed");
        String expectedText = "Credit Card";
        // String actualText7 = computerPage.verifyMessage6();
        Assert.assertEquals(addToCartPage.verifyMessage6(), expectedText, "Message not displayed");
        //2.32 Verify “Shipping Method” is “Next Day Air”
        String expectedText8 = "Shipping Method:";
        //String actualText8 = computerPage.verifyMessage7();
        Assert.assertEquals(addToCartPage.verifyMessage7(), expectedText8, "Message not displayed");
        String expectedText9 = "Next Day Air";
        //String actualText9 = computerPage.verifyMessage8();
        Assert.assertEquals(addToCartPage.verifyMessage8(), expectedText9, "Message not displayed");
        //   2.33 Verify Total is “$2,950.00”
        String expectedText7 = "$2,950.00";
        Assert.assertEquals(addToCartPage.verifyTotal(), expectedText7, "Message is not displayed");
        //   2.34 Click on “CONFIRM”
        addToCartPage.confirm1();
        //   2.35 Verify the Text “Thank You”
        String expectedTextThank = "Thank you";
        Assert.assertEquals(addToCartPage.verifyThankYou(), expectedTextThank, "Message is not displayed");
        //   2.36 Verify the message “Your order has been successfully processed!”
        String expectedTextOrder = "Your order has been successfully processed!";
        Assert.assertEquals(addToCartPage.verifyYourOrder(), expectedTextOrder, "Message is not displayed");
        //  2.37 Click on “CONTINUE”
        addToCartPage.clickContinue3();
        //  2.37 Verify the text “Welcome to our store
        String expectedTextM = "Welcome to our store";
        Assert.assertEquals(addToCartPage.welcomeToStore(), expectedTextM, "Message is not displayed");
    }
}
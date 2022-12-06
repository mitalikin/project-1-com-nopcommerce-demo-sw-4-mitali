package com.nopcommerce.demo.pages;

import com.google.common.base.Verify;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class AddToCartPage extends Utility {

    // 2.12 Click on "ADD TO CARD" Button.
    By addToCart = By.id("add-to-cart-button-1");

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }
    //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar

    By textMessage1 = By.xpath("//div[@class='bar-notification success']/p[1]");

    public String getText1() {
        return getTextFromElement(textMessage1);
    }

    // After that close the bar clicking on the cross button.
    By closeMessage = By.xpath("//span[@class='close']");

    public void clickOnCloseBox() {
        clickOnElement(closeMessage);
    }

    //  2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    By mouseHoverOnShoppingCar = By.xpath("//span[contains(text(),'Shopping cart')]");
    By clickOnAddToCart1 = By.xpath("//button[contains(text(),'Go to cart')]");

    public void mouseHooverAndClickOnAddToCart() {
        mouseHoverToElement(mouseHoverOnShoppingCar);
        clickOnElement(clickOnAddToCart1);
    }

    // 2.15 Verify the message "Shopping cart"
    By textMessage2 = By.xpath("//h1[text()='Shopping cart']");

    public String getText2() {
        return getTextFromElement(textMessage2);
    }

    //2.16 Change the Qty to "2" and Click on "Update shopping cart"
    By clickOnUpdateBasket = By.xpath("//input[@class='qty-input']");

    public void updateBasket() {

        clearAndEnterQuantity(clickOnUpdateBasket, "2");

    }

    By clickOnUpdateShoppingCart = By.xpath("//button[@id='updatecart']");

    //---//button[@class='button-2 update-cart-button']
    public void updateOnShoppingCart() {
        clickOnElement(clickOnUpdateShoppingCart);
    }

    // 2.17 Verify the Total"$2,950.00"
    By verifyTotal$2950 = By.xpath("//tbody/tr[4]/td[2]/span[1]/strong[1]");//----//strong[text()='$2,950.00']

    public String getTextTotal() {
        return getTextFromElement(verifyTotal$2950);
    }

    //2.18 click on checkbox “I agree with the terms of service"
    By clickOnCheckBox = By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[3]/input[1]");

    public void clickOnCheckBox() {
        clickOnElement(clickOnCheckBox);
    }

    // 2.19 Click on “CHECKOUT”
    By checkoutTab = By.xpath("//button[@class='button-1 checkout-button']");//---//div[@class='checkout-buttons']//button[1]

    public void clickOnCheckOut() {
        clickOnElement(checkoutTab);
    }

    //2.20 Verify the Text “Welcome, Please Sign In!”
    By welcomeMessage = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    //-----//div[@class='page-title']//h1[contains(text(),'Welcome, Please Sign In!')]
    // By welcomeMessage = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]\n");

    public String getTexts() {
        return getTextFromElement(welcomeMessage);
    }

    //2.21Click on “CHECKOUT AS GUEST”Tab
    By checkoutGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");

    public void setCheckoutGuest() {
        clickOnElement(checkoutGuest);
    }

    //2.22 Fill the all mandatory field
    By firstName = By.id("BillingNewAddress_FirstName");

    public void enterFirstname(String text) {
        sendTextToElement(firstName, text);
    }

    By LastName = By.id("BillingNewAddress_LastName");


    public void enterLastname(String text) {
        sendTextToElement(LastName, text);
    }

    By email = By.id("BillingNewAddress_Email");

    public void enterEmail1(String text) {
        sendTextToElement(email, text);
    }

    By country = By.id("BillingNewAddress_CountryId");

    public void enterCountry(String text) {
        selectByVisibleTextFromDropDown(country, text);
    }

    By city = By.id("BillingNewAddress_City");

    public void enterCity(String text) {
        sendTextToElement(city, text);
        ;
    }

    By address1 = By.id("BillingNewAddress_Address1");

    public void enterAddress1(String text) {
        sendTextToElement(address1, text);
        ;
    }

    By zipPostalCode = By.id("BillingNewAddress_ZipPostalCode");

    public void enterZipPostalCode(String text) {
        sendTextToElement(zipPostalCode, text);

    }

    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");

    public void enterPhoneNumber(String text) {
        sendTextToElement(phoneNumber, text);

    }

    // 2.23 Click on “CONTINUE”
    By clickOnContinue = By.xpath("//div[@id='billing-buttons-container']//button[text()='Continue']");//-----//button[@class='button-1 new-address-next-step-button'and@name='save']

    public void setClickOnContinue() {
        clickOnElement(clickOnContinue);
    }

    // 2.24 Click on Radio Button “Next Day Air($0.00)”
    By nextDayAir = By.id("shippingoption_1");

    public void setNextDayAir() {
        clickOnElement(nextDayAir);
    }

    //2.25 Click on “CONTINUE”
    By clickOnContinue1 = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");

    public void setClickOnContinue1() {
        clickOnElement(clickOnContinue1);
    }

    // 2.26 Select Radio Button “Credit Card”
    By selectRadioButton2 = By.id("paymentmethod_1");
    By clickOnRadioButton = By.xpath("//button[@type='button'and@onclick='PaymentMethod.save()']");

    public void selectRadioButton2Tab() {
        clickOnElement(selectRadioButton2);
        clickOnElement(clickOnRadioButton);
    }

    // 2.27 Select “Master card” From Select credit card dropdown
    By masterCard = By.id("CreditCardType");

    By selectMasterCard = By.xpath("//select[@id='CreditCardType']");

    public void setSelectMasterCard(String text) {
        clickOnElement(masterCard);
        selectByVisibleTextFromDropDown(selectMasterCard, text);
    }

    // 2.28 Fill all the details
    By cardholderName = By.id("CardholderName");

    public void enterCardHolderName(String text) {
        sendTextToElement(cardholderName, text);
    }

    By cardNumber = By.id("CardNumber");

    public void cardNumber(String text) {
        sendTextToElement(cardNumber, text);

    }

    By expireMonth = By.id("ExpireMonth");

    public void expireMonth(String text) {
        sendTextToElement(expireMonth, text);

    }

    By expireYear = By.id("ExpireYear");

    public void expireYear(String text) {
        sendTextToElement(expireYear, text);

    }

    By cvv = By.xpath("//input[@data-val-regex='Wrong card code']");

    public void cvv(String text) {
        sendTextToElement(cvv, text);

    }

    // 2.29 Click on “CONTINUE”
    By getClickOnContinue = By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    public void continue1() {
        clickOnElement(getClickOnContinue);
    }

    // 2.30 Verify “Payment Method” is “Credit Card”
    By paymentMethod = By.xpath("//span[contains(text(),'Payment Method:')]");

    public String getPaymentMethod() {
        return getTextFromElement(paymentMethod);

    }

    By verifyMessage6 = By.xpath("//span[contains(text(),'Credit Card')]");

    public String verifyMessage6() {
        return getTextFromElement(verifyMessage6);
    }

    //2.32 Verify “Shipping Method” is “Next Day Air”
    By verifyMessage7 = By.xpath("//span[contains(text(),'Shipping Method:')]");

    public String verifyMessage7() {
        return getTextFromElement(verifyMessage7);
    }

    By verifyMessage8 = By.xpath("//ul//li//span[contains(text(),'Next Day Air')]");

    public String verifyMessage8() {
        return getTextFromElement(verifyMessage8);
    }

    //          2.33 Verify Total is “$2,950.00”
    By total = By.xpath("//span//strong[contains(text(),'$2,950.00')]");

    public String verifyTotal() {
        return getTextFromElement(total);
    }

    //        2.34 Click on “CONFIRM”
    By confirmButton1 = By.xpath("//button[@type='button' and @onclick='ConfirmOrder.save()']");

    public void confirm1() {
        clickOnElement(confirmButton1);
    }

    //   2.35 Verify the Text “Thank You”
    By thankYou = By.xpath("//h1[text()='Thank you']");

    public String verifyThankYou() {
        return getTextFromElement(thankYou);
    }

    //     2.36 Verify the message “Your order has been successfully processed!”
    By yourOrder = By.xpath("//strong[text()='Your order has been successfully processed!']");

    public String verifyYourOrder() {
        return getTextFromElement(yourOrder);
    }

    //    2.37 Click on “CONTINUE”
    By continue3 = By.xpath("//button[@onclick='setLocation(\"/\")']");

    public void clickContinue3() {
        clickOnElement(continue3);
    }

    //  2.37 Verify the text “Welcome to our store
    By welcomeToOurStore = By.xpath("//h2[text()='Welcome to our store']");

    public String welcomeToStore() {
        return getTextFromElement(welcomeToOurStore);
    }

}










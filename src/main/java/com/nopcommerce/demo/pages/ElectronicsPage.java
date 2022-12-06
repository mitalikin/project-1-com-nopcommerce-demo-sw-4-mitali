package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {

    //1.1 Mouse Hover on “Electronics”Tab
    By mouseHooverOnElectronics = By.xpath("//ul[@class='top-menu notmobile']/li[2]");

    public void electronicsPage() {
        mouseHoverToElement(mouseHooverOnElectronics);
    }

    //1.2 Mouse Hover on “Cell phones” and click
    By cellphone = By.xpath("//body[1]/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");//---//ul[@class='top-menu notmobile']/li[2]/ul/li[2]

    public void setMouseHooverOnCellPhone() {

        mouseHoverToElementAndClick(cellphone);

    }

    //1.3 Verify the text “Cell phones
    By textCellPhone1 = By.xpath("//h1[contains(text(),'Cell phones')]");

    public String cellPhone() {
        return getTextFromElement(textCellPhone1);
    }

    By listView = By.xpath("//h1[contains(text(),'Cell phones')]");

    public void listView() {
        clickOnElement(listView);
    }

    //2.5 Click on product name “Nokia Lumia 1020” link
    By nameNokiaLumia = By.xpath("//div[@class='details']//a[contains(text(),'Nokia Lumia 1020')]");

    public void nokiaLumia() {
        clickOnElement(nameNokiaLumia);
    }

    //2.6 Verify the text “Nokia Lumia 1020”
    By nokiaLumia = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");

    public String nokiaLumia1() {
        return getTextFromElement(nokiaLumia);
    }

    //2.7 Verify the price “$349.00”
    By verifyText$349 = By.xpath("//span[@id='price-value-20']");

    public String verifyText1$349() {
        return getTextFromElement(verifyText$349);
    }

    //2.8 Change quantity to 2
    By changeQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");

    public void changeQuntity1() {

        clearAndEnterQuantity(changeQuantity, "2");

    }


    //2.9 Click on “ADD TO CART” tab
    By addToCart = By.xpath("//button[@id='add-to-cart-button-20']");

    public void addToCart() {
        clickOnElement(addToCart);
    }

    //2.10 Verify the Message "The product has been added to your shopping cart" on Topgreen Bar
    By verifyTheProductHasBeenAddedmessage = By.xpath("//div[@id='bar-notification']/div/p");

    public String message1() {
        return getTextFromElement(verifyTheProductHasBeenAddedmessage);
    }

    //After that close the bar clicking on the cross button.
    By closeButton = By.xpath("//span[@class='close']");

    public void closeButton() {
        clickOnElement(closeButton);
    }

    //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By clickOnIt = By.xpath("//button[contains(text(),'Go to cart')]");

    public void clickOnShoppingCart() {
        mouseHoverToElementAndClick(shoppingCart);
        clickOnElement(clickOnIt);
    }

    //2.12 Verify the message "Shopping cart"
    By verifyShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");

    public String verifyShoppingCart() {
        return getTextFromElement(verifyShoppingCart);
    }
    //2.13 Verify the quantity is 2

    //2.14 Verify the Total $698.00
    By verifyTotal$698 = By.xpath("//span[@class='product-subtotal']");//--//tbody/tr[4]/td[2]/span[1]/strong[1]

    public String totalText698() {
        return getTextFromElement(verifyTotal$698);
    }
    //2.15 click on checkbox “I agree with the terms of service”

    By checkBox = By.xpath("//input[@id='termsofservice']");//---//input[@name='termsofservice']

    public void checkBox() {
        clickOnElement(checkBox);
    }

    //2.16 Click on “CHECKOUT”
    By checkOut = By.xpath("//button[@id='checkout']");

    public void checkOut() {
        clickOnElement(checkOut);
    }

    //2.17 Verify the Text “Welcome, Please Sign In!”
    By welcomeMessage = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    public String welcomeMessage1() {
        return getTextFromElement(welcomeMessage);
    }

    //2.18 Click on “REGISTER” tab
    By registerTab = By.xpath("//button[contains(text(),'Register')]");

    public void registerTab() {
        clickOnElement(registerTab);
    }

    //2.19 Verify the text “Register”
    By registerText = By.xpath("//h1[contains(text(),'Register')]");

    public String registerText() {
        return getTextFromElement(registerText);
    }

    //2.20 Fill the mandatory fields
    By firstName = By.id("FirstName");

    public void enterFirstname(String text) {
        sendTextToElement(firstName, text);
    }

    By LastName = By.id("LastName");

    public void enterLastname(String text) {
        sendTextToElement(LastName, text);
    }

    By email = By.id("Email");

    public void enterEmail1(String text) {
        sendTextToElement(email, text);
    }

    By password = By.id("Password");

    public void enterPassword(String text) {
        sendTextToElement(password, text);
    }

    By confirmPassword = By.id("ConfirmPassword");

    public void enterConfirmPassword(String text) {
        sendTextToElement(confirmPassword, text);
    }

    // 2.21 Click on “REGISTER” Button
    By register1 = By.id("register-button");

    public void registerButton1() {
        clickOnElement(register1);
    }

    //2.22 Verify the message “Your registration completed”
    By textMessageYourRegistrationCompleted = By.xpath("//div[text()='Your registration completed']");

    public String registrationCompleted() {
        return getTextFromElement(textMessageYourRegistrationCompleted);
    }

    //2.23 Click on “CONTINUE” tab
    By continueButton2 = By.xpath("//a[@class='button-1 register-continue-button']");

    public void continueB() {
        clickOnElement(continueButton2);
    }

    //2.24 Verify the text “Shopping card”
    By getVerifyShoppingCart = By.xpath("//h1[text()='Shopping cart']");

    public String shoppingCart1() {
        return getTextFromElement(getVerifyShoppingCart);
    }

    //2.25 click on checkbox “I agree with the terms of service”
    By checkBox1 = By.id("termsofservice");

    public void setCheckBox2() {
        clickOnElement(checkBox1);
    }

    //2.26 Click on “CHECKOUT”
    By Checkout = By.id("termsofservice");

    public void checkout3() {
        clickOnElement(checkOut);
    }
    //2.27 Fill the Mandatory fields*****


    By country = By.id("BillingNewAddress_CountryId");

    public void enterCountry(String text) {
        selectByVisibleTextFromDropDown(country, text);
    }

    By city = By.id("BillingNewAddress_City");

    public void enterCity(String text) {
        sendTextToElement(city, text);

    }

    By address1 = By.id("BillingNewAddress_Address1");

    public void enterAddress1(String text) {
        sendTextToElement(address1, text);

    }

    By zipPostalCode = By.id("BillingNewAddress_ZipPostalCode");

    public void enterZipPostalCode(String text) {
        sendTextToElement(zipPostalCode, text);

    }

    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");

    public void enterPhoneNumber(String text) {
        sendTextToElement(phoneNumber, text);

    }

    //2.28 Click on “CONTINUE”
    By continueButton3 = By.xpath("//button[text() = 'Continue']");

    public void continue3() {
        clickOnElement(continueButton3);
    }

    //2.29 Click on Radio Button “2nd Day Air ($0.00)”
    By radiobutton1 = By.id("shippingoption_2");

    public void setRadiobutton1() {
        clickOnElement(radiobutton1);
    }

    // 2.30 Click on “CONTINUE”
    By continueButton4 = By.xpath("//div[@id='shipping-method-buttons-container']/button");

    public void continue4() {
        clickOnElement(continueButton4);
    }

    // 2.31 Select Radio Button “Credit Card”
    By clickOnRadioButton2 = By.xpath("//input[@id='paymentmethod_1']");
    By clickOnContinue4 = By.xpath("//div[@id='checkout-step-payment-method']/div/button");

    public void setClickOnRadioButton2() {
        clickOnElement(clickOnRadioButton2);
        clickOnElement(clickOnContinue4);
    }

    // 2.32 Select “Visa” From Select credit card dropdown
    By selectVisa = By.id("CreditCardType");

    public void selectVisa(String text) {
        selectByVisibleTextFromDropDown(selectVisa, text);
    }
    //2.33 Fill all the details

    By cardholderName = By.xpath("//input[@data-val-required='Enter cardholder name']");

    public void setCardholderName(String text) {
        sendTextToElement(cardholderName, text);
    }

    By cardNumber = By.id("CardNumber");

    public void setCardNumber(String text) {
        sendTextToElement(cardNumber, text);

    }

    By ExpireMonth = By.id("ExpireMonth");

    public void ExpireMonth(String text) {
        sendTextToElement(ExpireMonth, text);

    }

    By ExpireYear = By.id("ExpireYear");

    public void ExpireYear(String text) {
        sendTextToElement(ExpireYear, text);

    }

    By CardCode = By.xpath("//input[@id='CardCode']");

    public void cardCode(String text) {
        sendTextToElement(CardCode, text);

    }

    //2.34 Click on “CONTINUE”
    By getContinueButton5 = By.xpath("//div[@id='payment-info-buttons-container']/button");

    public void setGetContinueButton5() {
        clickOnElement(getContinueButton5);

    }

    //2.35 Verify “Payment Method” is “Credit Card”
    By PaymentMethod1 = By.xpath("//li[@class='payment-method']/span[2]");

    public String paymentMethod() {
        return getTextFromElement(PaymentMethod1);
    }

    //2.36 Verify “Shipping Method” is “2nd Day Air”
    By shippingMethod = By.xpath("//li[@class='shipping-method']/span[2]");

    public String shippingMethod1() {
        return getTextFromElement(shippingMethod);
    }

    //2.37 Verify Total is “$698.00”
    By total$698 = By.xpath("//td[@class='subtotal']/span");

    public String total$698() {
        return getTextFromElement(total$698);
    }

    // 2.38 Click on “CONFIRM”
    By confirmButton5 = By.xpath("//button[text()='Confirm']");

    public void confirm5() {
        clickOnElement(confirmButton5);
    }

    // 2.39 Verify the Text “Thank You”
    By thankYouMessage = By.xpath("//h1[contains(text(),'Thank you')]");

    public String thankYou() {
        return getTextFromElement(thankYouMessage);
    }

    // 2.40 Verify the message “Your order has been successfully processed!”
    By orderSuccessfullyProcessed = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");

    public String orderProcessed() {
        return getTextFromElement(orderSuccessfullyProcessed);
    }

    //2.41 Click on “CONTINUE”
    By getContinueButton6 = By.xpath("//button[contains(text(),'Continue')]");

    public void continueButton6() {
        clickOnElement(getContinueButton6);

    }

    //2.42 Verify the text “Welcome to our store”
    By welcomeToOurStore = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    public String message5() {
        return getTextFromElement(welcomeToOurStore);
    }

    //2.43 Click on “Logout” link
    By logout1 = By.xpath("//a[contains(text(),'Log out')]");

    public void logout1() {
        clickOnElement(logout1);

    }
}

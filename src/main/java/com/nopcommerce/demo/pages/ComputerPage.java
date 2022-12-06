package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

import javax.lang.model.element.Name;
import java.util.jar.Attributes;

public class ComputerPage extends Utility {

    By mouseHoverAndClickOnComputer = By.xpath("//ul[@class='top-menu notmobile']/li[1]/a[1]");

    public void mouseHoverToElementAndClickOnComputer() {
        mouseHoverToElementAndClick(mouseHoverAndClickOnComputer);
    }

    By clickOnDeskTop = By.linkText("Desktops");

    public void setClickOnDeskTop() {
        clickOnElement(clickOnDeskTop);
    }

    By selectSortByZToA = By.id("products-orderby");

    public void setSelectSortByZToA(String sortZToA) {
        selectByVisibleTextFromDropDown(selectSortByZToA, sortZToA);
    }

    By selectSortByAToZ = By.id("products-orderby");

    public void setSelectSortByAToZ(String sortAToZ) {
        selectByVisibleTextFromDropDown(selectSortByAToZ, sortAToZ);
    }

    //click on add to cart
    By clickOnAddToCart = By.xpath("//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/1/1/1\"),!1']");

    public void setClickOnAddToCart() {
        clickOnElement(clickOnAddToCart);
    }

    By buildYourOwnComputerText = By.xpath("//h1[text()='Build your own computer']");

    public String getBuildYourComputerText() {
        return getTextFromElement(buildYourOwnComputerText);
    }

    // 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    By selectFirstOptionFromProcessor = By.xpath("//select[@id='product_attribute_1']");

    public void selectFirstOptionFromDropDown(String option) {
        selectByVisibleTextFromDropDown(selectFirstOptionFromProcessor, option);
    }

    //  2.7.Select "8GB [+$60.00]" using Select class.
    By selectFirstOptionFromRam = By.name("product_attribute_2");

    public void selectFirstOptionFromDropDown2(String option) {
        selectByVisibleTextFromDropDown(selectFirstOptionFromRam, option);
    }

    // 2.8 Select HDD radio "400 GB [+$100.00]"
    By selectRadioButton = By.id("product_attribute_3_7");

    public void selectRadioButtonTab() {
        clickOnElement(selectRadioButton);
    }

    //  2.9 Select OS radio "Vista Premium [+$60.00]"
    By selectRadioButton1 = By.id("product_attribute_4_9");

    public void selectRadioButton1Tab() {
        clickOnElement(selectRadioButton1);
    }

    // 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander[+$5.00]"
    By selectTotalCommander = By.id("product_attribute_5_12");

    public void selectCheckbox() {
        clickOnElement(selectTotalCommander);
    }

    //  2.11 Verify the price "$1,475.00"
    By textPrice$1475 = By.id("price-value-1");

    public String verifyPriceText() {
        return getTextFromElement(textPrice$1475);
    }

}








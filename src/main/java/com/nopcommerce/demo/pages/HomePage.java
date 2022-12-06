package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
    By mouseHoverAndClickOnComputer = By.xpath("//ul[@class='top-menu notmobile']/li[1]/a[1]");
    By mouseHoverAndClickOnElectronics = By.linkText("Electronics");
    By mouseHoverAndClickOnApparel = By.linkText("Apparel");
    By mouseHoverAndClickOnDigitalDownloads = By.linkText("Digital downloads");
    By mouseHoverAndClickOnBooks = By.linkText("Books");
    By mouseHoverAndClickOnJewelry = By.linkText("Jewelry");
    By mouseHoverAndClickOnGiftCards = By.linkText("Gift Cards");


    public void mouseHoverToElementAndClickOnComputer() {
        mouseHoverToElementAndClick(mouseHoverAndClickOnComputer);
    }

    public void mouseHoverToElementAndClickOnElectronics() {
        mouseHoverToElementAndClick(mouseHoverAndClickOnElectronics);
    }
    public void mouseHoverToElementAndClickOnApparel() {
        mouseHoverToElementAndClick(mouseHoverAndClickOnApparel);
    }
    public void mouseHoverToElementAndClickOnDigitalDownloads() {
        mouseHoverToElementAndClick(mouseHoverAndClickOnDigitalDownloads);

    }
    public void mouseHoverToElementAndClickOnBooks() {
        mouseHoverToElementAndClick(mouseHoverAndClickOnBooks);
    }
    public void mouseHoverToElementAndClickOnJewelry() {
        mouseHoverToElementAndClick(mouseHoverAndClickOnJewelry);
    }
    public void mouseHoverToElementAndClickOnGiftCards() {
        mouseHoverToElementAndClick(mouseHoverAndClickOnGiftCards);
    }
    public void selectMenu(String menu){
        List<WebElement> topMenuList=driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/child::*"));
        }
    }
}

package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HomePageTest extends BaseTest {
    HomePage homepage = new HomePage();


    @Test
    public void verifyPageNavigationToComputerPageSuccessfully() {
        homepage.selectMenu("Computers");
        homepage.mouseHoverToElementAndClickOnComputer();
        //homepage.mouseHoverToElementAndClick(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a[1]"));
        String expectedText = "Computers";
        String actualText = getTextFromElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a[1]"));
        Assert.assertEquals(actualText, expectedText, "Not navigated to the Page");
    }

    @Test
    public void verifyPageNavigationToElectronicsPageSuccessfully() {
        homepage.selectMenu("Electronics");
        homepage.mouseHoverToElementAndClickOnElectronics();
        // mouseHoverToElementAndClick(By.linkText("Electronics"));
        String expectedText = "Electronics";
        String actualText = getTextFromElement(By.linkText("Electronics"));
        Assert.assertEquals(actualText, expectedText, "Not navigated to the Page");
    }

    @Test
    public void verifyPageNavigationToApparelPageSuccessfully() {
        homepage.selectMenu("Apparel");
        homepage.mouseHoverToElementAndClickOnApparel();
        mouseHoverToElementAndClick(By.linkText("Apparel"));
        String expectedText = "Apparel";
        String actualText = getTextFromElement(By.linkText("Apparel"));
        Assert.assertEquals(actualText, expectedText, "Not navigated to the Page");
    }

    @Test
    public void verifyPageNavigationToDigitalDownloadsPageSuccessfully() {
        homepage.selectMenu("Digital downloads");
        homepage.mouseHoverToElementAndClickOnDigitalDownloads();
        //mouseHoverToElementAndClick(By.linkText("Digital downloads"));
        String expectedText = "Digital downloads";
        String actualText = getTextFromElement(By.linkText("Digital downloads"));
        Assert.assertEquals(actualText, expectedText, "Not navigated to the Page");
    }

    @Test
    public void verifyPageNavigationToBooksPageSuccessfully() {
        homepage.selectMenu("Books");
        homepage.mouseHoverToElementAndClickOnBooks();
        //mouseHoverToElementAndClick(By.linkText("Books"));
        String expectedText = "Books";
        String actualText = getTextFromElement(By.linkText("Books"));
        Assert.assertEquals(actualText, expectedText, "Not navigated to the Page");
    }

    @Test
    public void verifyPageNavigationToJewelryPageSuccessfully() {
        homepage.selectMenu("Jewelry");
        homepage.mouseHoverToElementAndClickOnJewelry();
        //  mouseHoverToElementAndClick(By.linkText("Books"));
        String expectedText = "Jewelry";
        String actualText = getTextFromElement(By.linkText("Jewelry"));
        Assert.assertEquals(actualText, expectedText, "Not navigated to the Page");
    }

    @Test
    public void verifyPageNavigationToGiftCardsPageSuccessfully() {
        homepage.selectMenu("Gift Cards");
        homepage.mouseHoverToElementAndClickOnGiftCards();
        //mouseHoverToElementAndClick(By.linkText("Gift Cards"));
        String expectedText = "Gift Cards";
        String actualText = getTextFromElement(By.linkText("Gift Cards"));
        Assert.assertEquals(actualText, expectedText, "Not navigated to the Page");
    }


}

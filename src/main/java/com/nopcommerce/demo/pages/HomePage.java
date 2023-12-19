package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement verifyNopCommerceLogo;

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(linkText = "My account")
    WebElement myAccountLink;

    @CacheLookup
    @FindBy(linkText = "Log out")
    WebElement logOutLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/child::ul[1]/li/a")
    List<WebElement> topMenuList;

    @CacheLookup
    @FindBy(linkText = "Computers")
    WebElement computersTabLink;

    @CacheLookup
    @FindBy(linkText = "Electronics")
    WebElement electronicsTabLink;

    @CacheLookup
    @FindBy(linkText = "Apparel")
    WebElement apparelTabLink;

    @CacheLookup
    @FindBy(partialLinkText = "Digital")
    WebElement digitalDownloadsTabLink;

    @CacheLookup
    @FindBy(linkText = "Books")
    WebElement booksTabLink;

    @CacheLookup
    @FindBy(linkText = "Jewelry")
    WebElement jewelryTabLink;

    @CacheLookup
    @FindBy(linkText = "Gift Cards")
    WebElement giftCardsTabLink;

    public boolean getNopComLogo() {
        boolean b = verifyNopCommerceLogo.isDisplayed();
        log.info("Verify NopCommerce Log is Displayed");
        return b;
    }

    public void clickOnLoginLink() {
        log.info("Clicking on login link : " + loginLink.toString());
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        log.info("Clicking on register link : " + registerLink.toString());
        clickOnElement(registerLink);
    }

    public void clickOnMyAccountLink() {
        log.info("Click on myAccountLink : " + myAccountLink.getText());
        clickOnElement(myAccountLink);
    }

    public boolean isLogInLinkDisplayed(){
        boolean b = loginLink.isDisplayed();
        log.info("Getting Log-in Link displayed : " + loginLink.getText());
        return b;
    }

    public boolean isLogOutLinkDisplayed() {
        boolean b = logOutLink.isDisplayed();
        log.info("Getting LogOut link Display : " + logOutLink.getText());
        return b;
    }

    public HomePage clickOnLogOutLink() {
        log.info("Click on logOutLink : " + logOutLink.getText());
        clickOnElement(logOutLink);
        return new HomePage();
    }

    public void clickOnMenuTab(String tab) {
        for (WebElement menu : topMenuList) {
            if (menu.getText().contains(tab)) {
                log.info("Click on '" + tab + "' tab");
                clickOnElement(menu);
                break;
            }
        }
    }

    public void clickOnComputersTabLink() {
        clickOnElement(computersTabLink);
        log.info("Clicking on Computers Tab link : " + computersTabLink.toString());
    }

    public void clickOnElectronicsTabLink() {
        clickOnElement(electronicsTabLink);
        log.info("Clicking on Electronics Tab link : " + electronicsTabLink.toString());
    }

    public void clickOnApparelTabLink() {
        clickOnElement(apparelTabLink);
        log.info("Clicking on Apparel Tab link : " + apparelTabLink.toString());
    }

    public void clickOnDigitalDownloadsTabLink() {
        clickOnElement(digitalDownloadsTabLink);
        log.info("Clicking on Digital Downloads Tab link : " + digitalDownloadsTabLink.toString());
    }

    public void clickOnBooksTabLink() {
        clickOnElement(booksTabLink);
        log.info("Clicking on Books Tab link : " + booksTabLink.toString());
    }

    public void clickOnJewelryTabLink() {
        clickOnElement(jewelryTabLink);
        log.info("Clicking on Jewelry Tab link : " + jewelryTabLink.toString());
    }

    public void clickOnGiftCardsTabLink() {
        clickOnElement(giftCardsTabLink);
        log.info("Clicking on Gift Cards Tab link : " + giftCardsTabLink.toString());
    }


}




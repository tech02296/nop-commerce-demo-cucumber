package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ComputerPage extends Utility {


    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement computerText;

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopsLink;

    @CacheLookup
    @FindBy(linkText = "Notebooks")
    WebElement notebooksLink;

    @CacheLookup
    @FindBy(linkText = "Software")
    WebElement softwareLink;

    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement pageTitle;

    @CacheLookup
    @FindBy(xpath = "//div[@class='category-grid sub-category-grid']//h2/a")
    List<WebElement> subMenuLinks;

    public String getComputerText() {
        String message = getTextFromElement(computerText);
        log.info("Get Computer Text : " + computerText.getText());
        return message;
    }

    public String getDesktopsLinkText() {
        String message = getTextFromElement(desktopsLink);
        log.info("Get Desktops Link text : " + desktopsLink.getText());
        return message;
    }

    public void clickOnDesktopTabLink() {
        clickOnElement(desktopsLink);
    }

    public String getNotebooksLinkText() {
        String message = getTextFromElement(notebooksLink);
        log.info("Get NotebooksLink text : " + notebooksLink.getText());
        return message;
    }

    public String getSoftwareLinkText() {
        String message = getTextFromElement(softwareLink);
        log.info("Get Software Link text : " + softwareLink.getText());
        return message;
    }

    public String getPageTitleText() {
        String message = getTextFromElement(pageTitle);
        log.info("Get pageTitle text : " + pageTitle.getText());
        return message;
    }

    public void clickOnSubMenu(String subTab) {
        for (WebElement menu : subMenuLinks) {
            if (menu.getText().contains(subTab)) {
                log.info("Click on '" + subTab + "' link");
                clickOnElement(menu);
                break;
            }
        }
    }


}

package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement verifyDesktopsText;

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement verifySortByLink;

    @CacheLookup
    @FindBy(id = "products-pagesize")
    WebElement verifyDisplayLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='page-body']")
    WebElement selectProductList;

    public String getDesktopsLinkText() {
        Reporter.log("Verify Desktops Text");
        return getTextFromElement(verifyDesktopsText);
    }

    public String getSortByText() {
        Reporter.log("Verify SortBy Text");
        return getTextFromElement(verifySortByLink);
    }

    public String getDisplayLinkText() {
        Reporter.log("Verify Display Link Text");
        return getTextFromElement(verifyDisplayLink);
    }

    public String getSelectProductListText() {
        Reporter.log("Verify Select Product List Text");
        return getTextFromElement(selectProductList);
    }


}





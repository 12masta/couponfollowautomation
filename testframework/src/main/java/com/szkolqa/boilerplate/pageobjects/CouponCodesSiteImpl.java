package com.szkolqa.boilerplate.pageobjects;

import com.szkolqa.boilerplate.handlers.ClipboardHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CouponCodesSiteImpl extends BasePageImpl implements CouponCodesSite {

    @FindAll({
            @FindBy(tagName = "article")
    })
    private List<WebElement> articles;

    @FindBy(id = "copy-button")
    private WebElement copyButton;

    @FindBy(id = "coupon-code")
    private WebElement couponCode;

    public CouponCodesSiteImpl(WebDriver driver) {
        super(driver);
    }

    @Override
    public CouponCodesSite clickShowCouponCode(int p) {
        webElementsHandler.click(articles.get(p));
        return new CouponCodesSiteImpl(driver);
    }

    @Override
    public CouponCodesSite switchToNewestTab() {
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        return new CouponCodesSiteImpl(driver);
    }

    @Override
    public CouponCodesSite clickCopy() {
        webElementsHandler.click(copyButton);
        return this;
    }

    @Override
    public String getCouponValue() {
        return couponCode.getText();
    }
}

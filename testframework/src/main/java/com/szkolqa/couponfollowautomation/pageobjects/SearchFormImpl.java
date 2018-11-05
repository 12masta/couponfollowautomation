package com.szkolqa.couponfollowautomation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFormImpl extends BasePageImpl implements SearchForm {
    @FindBy(id = "search")
    private WebElement search;

    @FindBy(xpath = "//ul[@class='sug']")
    private WebElement sug;

    public SearchFormImpl(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getDropdownHref(int i) {
        return search.findElements(By.tagName("li")).get(i)
                .findElement(By.tagName("a")).getAttribute("href");
    }

    @Override
    public CouponCodesSite clickDropdownElement(int p) {
        wait.visibilityOf(sug);
        webElementsHandler.click(search.findElements(By.tagName("li")).get(p));
        return new CouponCodesSiteImpl(driver);
    }
}

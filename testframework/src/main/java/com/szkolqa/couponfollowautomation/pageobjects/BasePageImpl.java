package com.szkolqa.couponfollowautomation.pageobjects;

import com.szkolqa.couponfollowautomation.driver.UrlResolver;
import com.szkolqa.couponfollowautomation.driver.UrlResolverImpl;
import com.szkolqa.couponfollowautomation.driver.Wait;
import com.szkolqa.couponfollowautomation.handlers.WebElementsHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePageImpl extends PageObject implements BasePage {

    @FindBy(id = "search")
    private WebElement search;

    @FindBy(xpath = "//ul[@class='sug']")
    private WebElement sug;

    protected WebElementsHandler webElementsHandler;
    protected Wait wait;
    protected UrlResolver urlResolver;

    public BasePageImpl(WebDriver driver) {
        super(driver);
        webElementsHandler = new WebElementsHandler(driver);
        wait = new Wait(driver);
        urlResolver = new UrlResolverImpl(driver);
        wait.waitUntilPageIsFullyLoaded();
    }

    @Override
    public SearchForm searchStore(String store) {
        webElementsHandler.typeInputText(store, search.findElement(By.xpath(".//input[@class='searchField']")));
        wait.visibilityOf(sug);
        wait.waintUntilElementByCountIsGreaterThenNumber(search, By.tagName("li"), 2);
        return new SearchFormImpl(driver);
    }

    @Override
    public String getUrl() {
        return urlResolver.getUrl();
    }
}

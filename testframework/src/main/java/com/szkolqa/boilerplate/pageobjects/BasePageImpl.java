package com.szkolqa.boilerplate.pageobjects;

import com.szkolqa.boilerplate.driver.Wait;
import com.szkolqa.boilerplate.handlers.WebElementsHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePageImpl extends PageObject implements BasePage {

    @FindBy(id = "search")
    private WebElement search;

    protected WebElementsHandler webElementsHandler;
    protected Wait wait;

    public BasePageImpl(WebDriver driver) {
        super(driver);
        webElementsHandler = new WebElementsHandler(driver);
        wait = new Wait(driver);
        wait.waitUntilPageIsFullyLoaded();
    }

    @Override
    public SearchForm searchStore(String store) {
        webElementsHandler.typeInputText(store, search.findElement(By.xpath(".//input[@class='searchField']")));
        wait.waintUntilElementByCountIsGreaterThenNumber(search, By.tagName("li"), 1);
        return new SearchFormImpl(driver);
    }
}

package com.szkolqa.boilerplate.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFormImpl extends BasePageImpl implements SearchForm {
    @FindBy(id = "search")
    private WebElement search;

    public SearchFormImpl(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getDropdownHref(int i) {
        return search.findElements(By.tagName("li")).get(i)
                .findElement(By.tagName("a")).getAttribute("href");
    }
}

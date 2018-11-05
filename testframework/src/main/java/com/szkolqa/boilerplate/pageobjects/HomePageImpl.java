package com.szkolqa.boilerplate.pageobjects;

import org.openqa.selenium.WebDriver;

public class HomePageImpl extends BasePageImpl implements HomePage, BasePage {
    public HomePageImpl(WebDriver driver) {
        super(driver);
    }
}

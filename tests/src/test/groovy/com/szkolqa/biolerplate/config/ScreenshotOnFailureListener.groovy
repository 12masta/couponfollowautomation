package com.szkolqa.biolerplate.config

import com.szkolqa.boilerplate.driver.ScreenshotManager
import org.openqa.selenium.WebDriver
import org.spockframework.runtime.AbstractRunListener
import org.spockframework.runtime.model.ErrorInfo

class ScreenshotOnFailureListener extends AbstractRunListener {
    WebDriver driver

    void error(ErrorInfo error) {
        def screenshot = new ScreenshotManager(driver)
        screenshot.takeScreenshot(error.method.parent.filename, error.method.name)
    }
}
package org.example;

import org.example.utils.ConfigReader;
import org.example.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;


    public BasePage (WebDriver driver) {
        this.driver = driver;
        int timeout = Integer.parseInt(ConfigReader.getProperty("timeout.seconds", "10"));
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
    }


    public void enterText(WebElement locator, String text) {
        waitForElementToBeVisible(locator);
        locator.sendKeys(text);
        Utils.logInfo("sendKey: [ " + text + " ] to element: " + locator);
    }

    public void waitForElementPresence(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Utils.logInfo("Waiting for presence of element: " + locator);
    }

    public void clickToElement(WebElement locator) {
        waitForElementToBeClickable(locator);
        locator.click();
        Utils.logInfo("click to element: " + locator);
    }


    public void waitForElementToBeClickable (WebElement locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        Utils.logInfo("waiting " + locator + " if is it clickable");
    }


    public void waitForElementToBeVisible (WebElement locator) {
        wait.until(ExpectedConditions.visibilityOf(locator));
        Utils.logInfo("waiting element: " + locator);
    }


    public void refreshPage () {
        driver.navigate().refresh();
        Utils.logInfo("refresh page: " + driver.getCurrentUrl());
    }


//    public void clickOnFirstProduct() {
//        WebElement firstProduct = driver.findElement(By.cssSelector("a.product-link"));
//        wait.until(ExpectedConditions.elementToBeClickable(firstProduct));
//        firstProduct.click();
//        wait.until(ExpectedConditions.urlContains("/product/"));
//    }

    public String getCurrentUrl () {
        Utils.logInfo("get current url: " + driver.getCurrentUrl());
        return driver.getCurrentUrl();
    }


    public String getTextFromElement (WebElement locator) {
        waitForElementToBeVisible(locator);
        Utils.logInfo("text was found" + locator.getText());
        return locator.getText();
    }

    public void assertUrlEquals (String expectedUrl, String actualUrl) {
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    public void assertUrlEquals (String expectedUrl, String actualUrl, String message) {
        Assert.assertEquals(actualUrl, expectedUrl, message);
    }


    public void assertHeaderEquals (String expectedHeaderText, String actualHeaderText) {
        Assert.assertEquals(actualHeaderText, expectedHeaderText);
    }

    public void assertHeaderEquals (String expectedHeaderText, String actualHeaderText, String message) {
        Assert.assertEquals(actualHeaderText, expectedHeaderText, message);
        Utils.logInfo("Verified dashboard header text: " + actualHeaderText);
    }

    public String getCssValue(WebElement locator, String propertyName) {
        waitForElementToBeVisible(locator);
        Utils.logInfo("Property Name is: " + propertyName);
        return locator.getCssValue(propertyName);
    }

    public void assertTextEquals (String expectedText, String actualText, String message) {
        Assert.assertEquals(actualText, expectedText, message);
        Utils.logInfo("Text is: " + actualText);
    }

    public void assertTextEquals (String expectedText, String actualText) {
        Assert.assertEquals(actualText, expectedText);
        Utils.logInfo("Text is: " + actualText);
    }

    public void assertCodeEqual(String actualStatusCode, String expectedStatusCode, String message) {
        Assert.assertEquals(actualStatusCode, expectedStatusCode, message);
        Utils.logInfo("Status code is: " + actualStatusCode);
    }
}

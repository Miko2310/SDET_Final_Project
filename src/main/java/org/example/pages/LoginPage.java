package org.example.pages;

import com.aventstack.extentreports.ExtentTest;
import org.example.BasePage;
import org.example.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//button[@class='account header-hover']")
    WebElement loginButtonOnMainPage;

    @FindBy(id = "sigin-email")
    WebElement usernameField;

    @FindBy(id = "signin-password")
    WebElement passwordField;

    @FindBy(xpath = "//button[@class='styled__AuthPrimaryBtn-mh0716-2 dCwCil']")
    WebElement loginButton;

    @FindBy(xpath = "//button[contains(text(),'ჩემი ველი')]")
    WebElement myAccountButton;

    public void login(String email, String password) {

        clickToElement(loginButtonOnMainPage);
        enterText(usernameField, email);
        enterText(passwordField, password);
        clickToElement(loginButton);
        waitForElementToBeClickable(myAccountButton);

   }

//    public boolean isLoginButtonVisible() {
//        try {
//            waitForElementToBeVisible(loginButtonOnMainPage);
//            return loginButtonOnMainPage.isDisplayed();
//        } catch (Exception e) {
//            Utils.logInfo("Login button not found: " + e.getMessage());
//            return false;
//        }
//    }

    public String getLoginButtonBackgroundColor() {
        waitForElementToBeVisible(loginButtonOnMainPage);
        Utils.logInfo(getCssValue(loginButtonOnMainPage,"background-color"));
        return getCssValue(loginButtonOnMainPage,"background-color");
    }


}

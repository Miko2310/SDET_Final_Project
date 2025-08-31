package org.example.pages;

import org.example.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DashboardPage extends BasePage {

    public DashboardPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[contains(text(),'ჩემი ველი')]")
    WebElement dashboardHeaderText;

    @FindBy(xpath = "(//input[@placeholder='რას ეძებ?'])[1]")
    WebElement searchInputField;

    @FindBy(xpath = "(//a[contains(text(),'Apple iPhone 16 Pro Max 8 GB 256 GB Natural Titani')])[1]")
    WebElement firstProductLink;

    @FindBy(xpath = "(//h1[contains(text(),'Apple iPhone 16 Pro Max 8 GB 256 GB Natural Titani')])[1]")
    WebElement productName;

    @FindBy (xpath = "(//h3[@class='price'])[1]")
    WebElement productPrice;

//    @FindBy (xpath = "(//a[contains(text(),'Apple iPhone 16 Pro Max 8 GB 256 GB Natural Titani')])[1]")
//    WebElement productDetails;

    @FindBy (css = "//div[@class='styles__ContainerBlock-sc-1fbw3zu-4 styled__CategoryWrapper-sc-183mmht-1 fgxCpI cYcolT']//div[1]//div[2]//div[1]//button[2]//*[name()='svg']")
    WebElement addProductToCart;

    @FindBy(xpath = "(//button[@id='cart-button'])[1]")
    WebElement clickOnCartButton;

    @FindBy(xpath = "(//a[@class='cart dark-hover'])[1]")
    WebElement goToCart;

    @FindBy(xpath = "(//img[@alt='ჩატის ვიჯეტი'])[1]")
    WebElement chatIcon;

//    @FindBy(id = "loadframe")
//    WebElement iframe;

    @FindBy(xpath = "(//textarea[@id='textarea'])[1]")
    WebElement chatMessageTest;

    @FindBy(xpath = "(//em[@id='sqico-send'])[1]")
    WebElement startChatButton;

    @FindBy(xpath = "(//span[@title='ჩათის დასასრული.'])[1]")
    WebElement endChat;

    public String getDashboardMainText() {
        waitForElementToBeVisible(dashboardHeaderText);
        return getTextFromElement(dashboardHeaderText);
    }

    public void searchForProduct (String searchQuery) {
        waitForElementToBeVisible(searchInputField);
        searchInputField.clear();
        searchInputField.sendKeys(searchQuery);
        searchInputField.sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("your-search-results-selector")));
    }

    public String getProductName () {
        waitForElementToBeVisible(productName);
        return getTextFromElement(productName);
    }

    public String getProductPrice () {
        waitForElementToBeVisible(productPrice);
        return getTextFromElement(productPrice);
    }

//    public void clickOnFirstProduct() {
//        waitForElementToBeVisible(firstProductLink);
//        clickToElement(firstProductLink);
//    }

//    public void clickOnFirstProduct() {
//        WebElement firstProduct = driver.findElement(By.cssSelector("img[alt='Apple iPhone 16 Pro Max 8 GB 256 GB Natural Titanium']"));
//        wait.until(ExpectedConditions.elementToBeClickable(firstProduct));
//        firstProduct.click();
//        wait.until(ExpectedConditions.urlContains("/category/"));
//    }

    public void addTheProductToCart () {
        waitForElementToBeVisible(addProductToCart);
        clickToElement(addProductToCart);
    }

    public void clickOnCartButton () {
        waitForElementToBeVisible(clickOnCartButton);
        clickToElement(clickOnCartButton);
    }

    public void goToCart () {
        waitForElementToBeVisible(goToCart);
        clickToElement(goToCart);
    }

    public void clickOnChatIcon () {
        waitForElementToBeVisible(chatIcon);
        clickToElement(chatIcon);
    }



    public void typeChatMessage(String msg) {
        waitForElementToBeVisible(chatMessageTest);
        chatMessageTest.sendKeys(msg);
    }

    public void clickStartChatButton() {
        waitForElementToBeVisible(startChatButton);
        startChatButton.click();
    }

    public void endChatButton () {
        waitForElementToBeVisible(endChat);
        endChat.click();
    }

}

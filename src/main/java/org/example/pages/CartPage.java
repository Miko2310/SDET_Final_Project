package org.example.pages;

import org.example.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {

    public CartPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "delete")
    WebElement clearCart;

    @FindBy(xpath = "(//*[name()='svg'])[8]")
    WebElement veliButton;

    @FindBy(xpath = "(//h4[contains(text(),'ყველა კატეგორია')])[1]")
    WebElement allCategories;

    @FindBy(xpath = "(//span[@class='title'][contains(text(),'სკოლისთვის')])[3]")
    WebElement firstCategory;

    @FindBy(xpath = "(//img)[56]")
    WebElement firstSubCategory;

    @FindBy(xpath = "(//a[contains(text(),\"MIQUELRIUS, Don't Panic, ზურგჩანთა, ვარდისფერი, 41\")])[1]")
    WebElement firstProduct;

    @FindBy (xpath = "(//span[contains(text(),'კალათაში დამატება')])[1]")
    WebElement addProductToCart;

    @FindBy(xpath = "(//button[@id='cart-button'])[1]")
    WebElement clickOnCartButton;

    @FindBy(xpath = "(//a[@class='cart dark-hover'])[1]")
    WebElement goToCart;

    @FindBy (css = "div[class='main'] div[class='text'] a")
    WebElement productName;

    @FindBy (xpath = "//div[@class='total-prices']//span[2]")
    WebElement productPrice;

    public boolean isCartEmpty() {
        try {
            return driver.findElement(By.xpath("//div[contains(text(),'კალათა ცარიელია')]")).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clickOnVeliButton () {
        waitForElementToBeVisible(veliButton);
        waitForElementToBeClickable(veliButton);
        clickToElement(veliButton);
    }

    public void clearProductsFromCart () {
        waitForElementToBeVisible(clearCart);
        waitForElementToBeClickable(clearCart);
        clickToElement(clearCart);
    }


    public void goToAllCategories () {
        waitForElementToBeVisible(allCategories);
        waitForElementToBeClickable(allCategories);
        clickToElement(allCategories);
    }

    public void goToCategory () {
        waitForElementToBeVisible(firstCategory);
        waitForElementToBeClickable(firstCategory);
        clickToElement(firstCategory);
    }


    public void goToSubCategory () {
        waitForElementToBeVisible(firstSubCategory);
        waitForElementToBeClickable(firstSubCategory);
        clickToElement(firstSubCategory);
    }

    public void goToFirstProductDetails () {
        waitForElementToBeVisible(firstProduct);
        waitForElementToBeClickable(firstProduct);
        clickToElement(firstProduct);
    }

    public void addTheProductToCart () {
        waitForElementToBeVisible(addProductToCart);
        wait.until(ExpectedConditions.elementToBeClickable(addProductToCart));
        clickToElement(addProductToCart);
    }


    public void clickOnCartButton () {
        waitForElementToBeVisible(clickOnCartButton);
        clickToElement(clickOnCartButton);
    }

    public void goToCart () {
        waitForElementToBeVisible(goToCart);
        wait.until(ExpectedConditions.elementToBeClickable(goToCart));
        clickToElement(goToCart);
    }

    public String getProductName () {
        waitForElementToBeVisible(productName);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("(//img[@alt=\"MIQUELRIUS, Don't Panic, ზურგჩანთა, ვარდისფერი, 41 x 16.5 სმ\"])[2]"))));
        return getTextFromElement(productName);
    }

    public String getProductPrice () {
        waitForElementToBeVisible(productPrice);
        return getTextFromElement(productPrice);
    }

}

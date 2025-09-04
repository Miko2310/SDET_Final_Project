package org.example.pages;

import org.example.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage extends BasePage {
    public WishlistPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//button[@class='menu'])[1]")
    WebElement allCategories;

    @FindBy(xpath = "(//button[@class='parent '])[2]")
    WebElement chosenCategory;

    @FindBy(xpath = "(//span[contains(text(),'მობილურები & აქსესუარები')])[1]")
    WebElement chosenSubCategory;

    @FindBy(xpath = "(//div[contains(text(),'მობილური ტელეფონები')])[1]")
    WebElement chosenMinorCategory;

    @FindBy(xpath = "(//a[normalize-space()='Honor 400 8 GB 256 GB Desert Gold'])[1]")
    WebElement firstProductDetails;

    @FindBy(xpath = "(//button[@class='wishlist-btn'])[1]")
    WebElement addToWishlist;

    @FindBy(xpath = "(//button[contains(text(),'ჩემი ველი')])[1]")
    WebElement myveliIcon;

    @FindBy(xpath = "(//a[contains(text(),'სურვილები')])[1]")
    WebElement wishlistIcon;

    @FindBy(css = "path[d='M17.5741 2.601C17.1485 2.17517 16.6431 1.83737 16.0869 1.6069C15.5307 1.37644 14.9345 1.25781 14.3325 1.25781C13.7304 1.25781 13.1342 1.37644 12.578 1.6069C12.0218 1.83737 11.5164 2.17517 11.0908 2.601L10.2075 3.48433L9.32412 2.601C8.46438 1.74126 7.29832 1.25826 6.08246 1.25826C4.86659 1.25826 3.70053 1.74126 2.84079 2.601C1.98105 3.46074 1.49805 4.62681 1.49805 5.84267C1.49805 7.05853 1.98105 8.22459 2.84079 9.08433L3.72412 9.96767L10.2075 16.451L16.6908 9.96767L17.5741 9.08433C18 8.6587 18.3377 8.15334 18.5682 7.59713C18.7987 7.04091 18.9173 6.44474 18.9173 5.84267C18.9173 5.24059 18.7987 4.64442 18.5682 4.0882C18.3377 3.53199 18 3.02663 17.5741 2.601V2.601Z'][stroke='red']")
    WebElement removeWishlistItem;

    @FindBy(xpath = "(//a[contains(text(),'დაამატე პროდუქტები')])[1]")
    WebElement emptyWishlistText;

    public void goToAllCategories () {
        waitForElementToBeVisible(allCategories);
        waitForElementToBeClickable(allCategories);
        clickToElement(allCategories);
    }

    public void goToChosenCategory () {
        waitForElementToBeVisible(chosenCategory);
        waitForElementToBeClickable(chosenCategory);
        clickToElement(chosenCategory);
    }

    public void goToChosenSubCategory () {
        waitForElementToBeVisible(chosenSubCategory);
        waitForElementToBeClickable(chosenSubCategory);
        clickToElement(chosenSubCategory);
    }

    public void goToChosenMinorCategory () {
        waitForElementToBeVisible(chosenMinorCategory);
        waitForElementToBeClickable(chosenMinorCategory);
        clickToElement(chosenMinorCategory);
    }

    public void firstProductDetails() {
        waitForElementToBeVisible(firstProductDetails);
        waitForElementToBeClickable(firstProductDetails);
        clickToElement(firstProductDetails);
    }

    public void addProductToMyWishlist() {
        waitForElementToBeVisible(addToWishlist);
        waitForElementToBeClickable(addToWishlist);
        clickToElement(addToWishlist);
    }

    public void clickOnMyveliIcon () {
        waitForElementToBeVisible(myveliIcon);
        waitForElementToBeClickable(myveliIcon);
        clickToElement(myveliIcon);
    }

    public void clickOnWishlistIcon () {
        waitForElementToBeVisible(wishlistIcon);
        waitForElementToBeClickable(wishlistIcon);
        clickToElement(wishlistIcon);
    }

    public boolean isWishlistItemAdded () {
        try {
            return driver.findElement(By.className("to-cart primary-hover")).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void removeProductFromWishlist () {
        waitForElementToBeVisible(removeWishlistItem);
        waitForElementToBeClickable(removeWishlistItem);
        clickToElement(removeWishlistItem);
    }

    public String getEmptyWishlistPageName () {
        waitForElementToBeVisible(emptyWishlistText);
        return getTextFromElement(emptyWishlistText);
    }
}

package org.example.pages;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterPage extends BasePage {

    public FilterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//button[@class='menu'])[1]")
    WebElement allCategories;

    @FindBy(xpath = "(//button[@class='parent '])[2]")
    WebElement chosenCategory;

    @FindBy(xpath = "(//a[@class='sub'])[1]")
    WebElement chosenSubCategory;

    @FindBy(xpath = "(//div[contains(text(),'მობილური ტელეფონები')])[1]")
    WebElement chosenMinorCategory;

    @FindBy(xpath = "(//button[@class='header'][contains(text(),'ფასი')])[1]")
    WebElement priceIcon;

    @FindBy(xpath = "(//input[@placeholder='მინ.'])[1]")
    WebElement minPrice;

    @FindBy(xpath = "(//input[@placeholder='მაქს.'])[1]")
    WebElement maxPrice;

    @FindBy(xpath = "(//button[contains(text(),'ძებნა')])[1]")
    WebElement searchButton;


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

    public void clickOnPriceIcon () {
        waitForElementToBeVisible(priceIcon);
        waitForElementToBeClickable(priceIcon);
        clickToElement(priceIcon);
    }

    public void minPriceInput () {
        waitForElementToBeVisible(minPrice);
        waitForElementToBeClickable(minPrice);
        enterText(minPrice,"99");
    }

    public void maxPriceInput () {
        waitForElementToBeVisible(maxPrice);
        waitForElementToBeClickable(maxPrice);
        enterText(maxPrice,"1001");
    }

    public void clickOnSearchButton () {
        waitForElementToBeVisible(searchButton);
        waitForElementToBeClickable(searchButton);
        clickToElement(searchButton);
    }



}

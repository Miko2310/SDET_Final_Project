package org.example.tests;

import org.example.BaseTest;
import org.example.pages.DashboardPage;
import org.example.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test(testName = "Add Category Product To Cart")
    public void testSearchedProductToCartAndValidateResult() {

        // 1 login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("manualtester400@gmail.com", "Giorgi1!");

        // 2 search for desired product
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.searchForProduct("Apple iPhone 16 Pro Max 8 GB 256 GB Natural Titanium");

//        // 3.1 redirect to page of searched items
//        dashboardPage.waitForElementPresence(By.cssSelector("selector-for-search-results"));
//
//        // 3.2 make assertion that page is redirected to right search page
//        dashboardPage.assertUrlEquals("https://veli.store/category/?q=Apple%20iPhone%2016%20Pro%20Max%208%20GB%20256%20GB%20Natural%20Titanium", driver.getCurrentUrl());

//        // 4 go to the desired product details
//        dashboardPage.clickOnFirstProduct();

//        // 5 add product to cart
//        dashboardPage.addTheProductToCart();
//
//        // 6 go to cart
//        dashboardPage.clickOnCartButton();
//
//        // 7 check if product is added to the cart
//
//        String expectedProductName = dashboardPage.getProductName();
//        String expectedProductPrice = dashboardPage.getProductPrice();
//
//
//        // 8 assertions
//        dashboardPage.assertTextEquals(dashboardPage.getProductName(), "Apple iPhone 16 Pro Max 8 GB 256 GB Natural Titanium");
//        dashboardPage.assertTextEquals(dashboardPage.getProductPrice(), "3879.00 ₾");
//
    }
}

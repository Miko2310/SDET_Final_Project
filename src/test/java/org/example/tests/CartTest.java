package org.example.tests;

import org.example.BaseTest;
import org.example.pages.CartPage;
import org.example.pages.LoginPage;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test(testName = "Add Random Product To Cart And Validate Results")
    public void testAddRandomProductToCartAndValidatePrice() {

        // 1 login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("manualtester400@gmail.com", "Giorgi1!");

        // 2 check if cart is empty
        CartPage cartPage = new CartPage(driver);
        cartPage.clickOnCartButton();
        if (cartPage.isCartEmpty()) {

        // 3 click on Veli Button
        cartPage.clickOnVeliButton();

        // 4 click on all categories
        cartPage.goToAllCategories();

        // 5 go to first category
        cartPage.goToCategory();

        // 6 go to first sub category
        cartPage.goToSubCategory();

        // 7 go to the first product details
        cartPage.goToFirstProductDetails();

        // 8 add product to cart
        cartPage.addTheProductToCart();

        // 9 click on cart button
        cartPage.clickOnCartButton();

        // 10 go to cart
        cartPage.goToCart();

        // 11 assertions
        String actualProductName = cartPage.getProductName();
        String actualProductPrice = cartPage.getProductPrice();
        cartPage.assertTextEquals(actualProductName, "MIQUELRIUS, Don't Panic, ზურგჩანთა, ვარდისფერი, 41 x 16.5 სმ");
        cartPage.assertTextEquals(actualProductPrice, "122.94 ₾");
    }
        // if cart isn't empty
        else {

        // 12 clear product from the cart
        cartPage.clearProductsFromCart();

            // 3.1 click on Veli Button
            cartPage.clickOnVeliButton();

            // 4.1 click on all categories
            cartPage.goToAllCategories();

            // 5.1 go to first category
            cartPage.goToCategory();

            // 6.1 go to first sub category
            cartPage.goToSubCategory();

            // 7.1 go to the first product details
            cartPage.goToFirstProductDetails();

            // 8.1 add product to cart
            cartPage.addTheProductToCart();

            // 9.1 click on cart button
            cartPage.clickOnCartButton();

            // 10.1 go to cart
            cartPage.goToCart();

            // 11 assertions
            String actualProductName2 = cartPage.getProductName();
            String actualProductPrice2 = cartPage.getProductPrice();
            cartPage.assertTextEquals(actualProductName2, "MIQUELRIUS, Don't Panic, ზურგჩანთა, ვარდისფერი, 41 x 16.5 სმ");
            cartPage.assertTextEquals(actualProductPrice2, "122.94 ₾");
        }

}

}
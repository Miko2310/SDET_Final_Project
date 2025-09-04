package org.example.tests;

import org.example.BaseTest;
import org.example.pages.LoginPage;
import org.example.pages.WishlistPage;
import org.testng.annotations.Test;

public class WishlistTest extends BaseTest {

    @Test(testName = "Add/Remove Items In Wishlist")

    public void testAddAndRemoveItemsInWishlist () {
        // 1 login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("manualtester400@gmail.com", "Giorgi1!");

        // 2 go to all categories
        WishlistPage wishlistPage = new WishlistPage(driver);
        wishlistPage.goToAllCategories();

        // 3 go to chosen category (for example "electronics")
        wishlistPage.goToChosenCategory();

        // 4 go to chosen subcategory (for example "smartphones & accessories")
        wishlistPage.goToChosenSubCategory();

        // 5 go to chosen minorcategory (for example "smartphones")
        wishlistPage.goToChosenMinorCategory();

        // 5 go to the first product details
        wishlistPage.firstProductDetails();

        // 6 add the product to wishlist
        wishlistPage.addProductToMyWishlist();

        // 7 check if the item is added to the wishlist
        wishlistPage.clickOnMyveliIcon();
        wishlistPage.clickOnWishlistIcon();

        // 8 check of the product is added in wishlist
        wishlistPage.isWishlistItemAdded();


        // 9 remove the item from wishlist
        wishlistPage.removeProductFromWishlist();


        // 10 check if the wishlist is empty with assertion
        wishlistPage.assertTextEquals("დაამატე პროდუქტები", wishlistPage.getEmptyWishlistPageName());

    }
}

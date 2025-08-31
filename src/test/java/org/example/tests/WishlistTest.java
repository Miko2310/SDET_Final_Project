package org.example.tests;

import org.example.BaseTest;
import org.example.pages.LoginPage;
import org.testng.annotations.Test;

public class WishlistTest extends BaseTest {

    @Test(testName = "Add/Remove Items In Wishlist")

    public void testAddAndRemoveItemsInWishlist () {
        // 1 login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("manualtester400@gmail.com", "Giorgi1!");

        // 2 go to all categories

        // 3 go to chosen category (for example teqniques)

        // 4 go to chosen subcategory (for example mobile phones)

        // 5 click on first item of the page

        // 6 add to wishlist

        // 7 check if the item is added to the wishlist

        //8 remove the item from wishlist

        //9 check if the wishlist is empty
    }
}

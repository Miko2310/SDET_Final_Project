package org.example.tests;

import org.example.BaseTest;
import org.example.pages.FilterPage;
import org.example.pages.LoginPage;
import org.testng.annotations.Test;

public class FilterTest extends BaseTest {

    @Test(testName = "Simple Filter")

    public void testSimpleFilter () {
        // 1 login with correct credentials
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("manualtester400@gmail.com", "Giorgi1!");

        // 2 go to all categories
        FilterPage filterPage = new FilterPage(driver);
        filterPage.goToAllCategories();

        // 3 go to chosen category (for example "electronics")
        filterPage.goToChosenCategory();

        // 4 go to chosen subcategory (for example "smartphones & accessories")
        filterPage.goToChosenSubCategory();

        // 5 go to chosen minorcategory (for example "smartphones")
        filterPage.goToChosenMinorCategory();

        // 6 fill the min and max prices and click on search button
        filterPage.clickOnPriceIcon();
        filterPage.minPriceInput();
        filterPage.maxPriceInput();
        filterPage.clickOnSearchButton();
    }
}

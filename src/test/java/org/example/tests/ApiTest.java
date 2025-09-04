package org.example.tests;

import org.example.BaseTest;
import org.example.pages.ApiPage;
import org.example.pages.LoginPage;
import org.testng.annotations.Test;

public class ApiTest extends BaseTest {

    @Test(testName = "Checking status code after login")
    public void testStatusCodeCheck () {

            ApiPage apiPage = new ApiPage(driver);
            LoginPage loginPage = new LoginPage(driver);

            loginPage.login("manualtester400@gmail.com", "Giorgi1!");

            String actualStatusCode = String.valueOf(apiPage.getStatusCode());
            String expectedStatusCode = "200";
            apiPage.assertCodeEqual(actualStatusCode,expectedStatusCode, "Status codes don't match");
        }


}




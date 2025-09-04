package org.example.tests;
import org.example.BaseTest;
import org.example.pages.DashboardPage;
import org.example.pages.LoginPage;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {


    @Test(testName = "Simple Login")
    public void testValidLogin() {
        // 1 login with correct credentials
        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboardPage = new DashboardPage(driver);
        loginPage.login("manualtester400@gmail.com", "Giorgi1!");

        // 2 assertion with header test
        dashboardPage.assertHeaderEquals("Ჩემი Ველი", dashboardPage.getDashboardMainText(), "Login failed: 'ჩემი ველი' button is not visible.");

        // 3 refresh page
        loginPage.refreshPage();
    }

    @Test(testName = "Login Button Background Text Color")
    public void testLoginButtonTextColor() {
        // 1 login with correct credentials
        LoginPage loginPage = new LoginPage(driver);

        // 2 background color
        String expectedTextColor = "rgba(0, 0, 0, 0)";
        String actualTextColor = loginPage.getLoginButtonBackgroundColor();

        // 3 assertion on background color
        loginPage.assertHeaderEquals(expectedTextColor, actualTextColor);
    }


}

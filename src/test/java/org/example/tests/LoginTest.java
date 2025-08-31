package org.example.tests;
import org.example.BaseTest;
import org.example.pages.DashboardPage;
import org.example.pages.LoginPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


// აღწერეთ თქვენს მიერ დაწერილი მეთოდები კომენტარის სახით (ქომონ მეთოდები)
//
// გამოიყენეთ ასევე restAssured ( კონკრეტულად კი შემდეგი ლოგიკით:
// შექმენით ცალკე კლასი სადაც იქნება თავმოყრილი restassured მეთოდები და თუნდაც ერთი get მეთოდი გამოიყენეთ ფრეიმვორქში.
// ანუ ერთი ქეისი დაწერეთ რომელიც შეამოწმებს მაგალითად სტატუს კოდს ან რაიმეს რესპონსიდან.
// სატესტოდ შეგიძლიათ გამოიყენოთ : https://reqres.in სატესტო api.)


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

    @Test(testName = "Login Button Text Color")
    public void loginButtonTextColor() {
        // 1 login with correct credentials
        LoginPage loginPage = new LoginPage(driver);

        // 2 background color
        String expectedTextColor = "rgba(0, 0, 0, 0)";
        String actualTextColor = loginPage.getLoginButtonBackgroundColor();

        // 3 assertion on background color
        loginPage.assertHeaderEquals(expectedTextColor, actualTextColor);
    }


}

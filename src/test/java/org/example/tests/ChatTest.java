package org.example.tests;

import org.example.BaseTest;
import org.example.pages.DashboardPage;
import org.example.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class ChatTest extends BaseTest {

    @Test(testName = "Authorized User Chat in non working hours")
    public void testChat() {
        // 1 login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("manualtester400@gmail.com", "Giorgi1!");

        // 2 click on the chat icon
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.clickOnChatIcon();

//        // 3 switch to chat iframe
//        dashboardPage.switchToChatIframe();


        // 4 write a message and click start button for new conversation
        dashboardPage.typeChatMessage("Hello, this is a test message for sdet final project!");
        dashboardPage.clickStartChatButton();

        // 5 close the chat
        dashboardPage.endChatButton();

//        // 6 switch back to default
//        dashboardPage.switchBackFromChatIframe();

    }
}
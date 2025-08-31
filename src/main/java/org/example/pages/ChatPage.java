package org.example.pages;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ChatPage extends BasePage {

    public ChatPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

}

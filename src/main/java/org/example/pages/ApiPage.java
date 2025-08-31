package org.example.pages;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.example.BasePage;
import org.example.utils.Utils;
import org.openqa.selenium.WebDriver;

import static io.restassured.RestAssured.given;

public class ApiPage extends BasePage {
    public ApiPage (WebDriver driver) {
        super(driver);
    }


    public int getStatusCode () {
        RestAssured.baseURI = "https://veli.store/";
        Response resp = given()
                .when()
                .get("/")
                .then()
                .statusCode(200)
                .extract()
                .response();
        int statusCode = resp.getStatusCode();
        Utils.logInfo("Actual status code is: " + statusCode);
        Utils.logInfo("Expected status code is: 200");
        return statusCode;
    }
}

Automation Testing at veli.store

This is a testing project automated using Java and Selenium, built on the Page Object Model (POM) architecture. The project covers testing of the core functionalities of the veli.store website. As a result of the test cases, various functionalities were tested, including:

• User login and header text validation after authorization

• Verification of the login button background color

• Searching for desired product, adding it to cart and validate the results

• Adding and removing a product from wishlist

• Using chat for authorized user in non working hours


Technology:

• Language: Java
• Build tool: Apache Maven

• Browser automation: Selenium WebDriver

• Test management and execution: TestNG

• Automatic driver management: WebDriverManager

• For test reporting: ExtentReports

• For API testing: Rest-Assured

Global Config

In the project, a global configuration file named config.properties is used. This configuration contains information related to the base URL and the timeout seconds.

How to run tests
You can run the test cases in two different ways:
    1. Using testng.xml file: Simply right-click the testng.xml file in your IDE and select Run. This will execute all test cases defined in the suite.
    2. Using the terminal with Maven: Run the following command from the root directory of the project: "mvn clean test". This will compile the project and execute all test cases automatically.

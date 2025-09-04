Veli.store Automation Testing

Automated testing framework for veli.store built with Java + Selenium WebDriver.
The project uses the Page Object Model (POM) design pattern and validates key e-commerce functionalities.

✅ Test Coverage
As a result of the test cases, various functionalities were tested, including:

-   Authentication

1) Login with valid credentials

2) Verify login button background color

- Shopping Cart

1) Add random product to cart and validate

- Wishlist

1) Add product to wishlist

2) Remove product from wishlist

- Filters

1) Apply price filter on product category

2) Validate results match price range

- API Tests

1) Basic API validations with Rest-Assured

🛠 Tech Stack
| Purpose            | Tool/Library       |
| ------------------ | ------------------ |
| Language           | Java               |
| Build Tool         | Apache Maven       |
| Browser Automation | Selenium WebDriver |
| Test Execution     | TestNG             |
| Driver Management  | WebDriverManager   |
| Reporting          | ExtentReports      |
| API Testing        | Rest-Assured       |

⚙ Configuration

- Global settings stored in config.properties

1) Base URL

2) Timeout values

▶ Running Tests

Option 1: testng.xml (via IDE)
Right-click testng.xml → Run

Option 2: Maven (via terminal)
mvn clean test

📊 Reports

- ExtentReports generates interactive HTML reports

- Includes logs, pass/fail/skip status, and error stack traces

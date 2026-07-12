# SauceDemo Automation Project

This project is my QA Automation Intern Assignment. I wrote automated UI tests for the SauceDemo website ([https://www.saucedemo.com](https://www.saucedemo.com)).

---

## 🛠️ Tools I Used

*   **Language:** Java
*   **Automation Tool:** Selenium WebDriver
*   **Test Framework:** TestNG
*   **Build Tool:** Maven
*   **Design Pattern:** Page Object Model (POM)

### Why I chose these tools:
*   **Selenium & Java:** Selenium is a very popular and stable tool for browser automation, and it works great with Java.
*   **Page Object Model (POM):** I used this design pattern to separate the web elements from the actual test code. This makes the code clean and easy to understand.
*   **TestNG:** It helps to organize the tests easily using annotations like `@BeforeMethod` and `@AfterMethod` and gives good assertions.

---


### How to Setup and Run Tests Locally

Before cloning the project, ensure you have the following installed on your machine:

*   Java Development Kit (JDK 11 or higher)
*   Apache Maven
*   Google Chrome Browser 

Steps to Run:
1. Clone the Repository

git clone <your-github-repo-url-here>
cd SauceDemoAutomationNewnop

2. Clean and Run the Suite via Maven Terminal

Open your terminal/command prompt inside the project root folder and execute:

mvn clean test

### Bonus Work Done
Option B - CI Pipeline: I created a GitHub Actions workflow file (maven.yml). Every time I push new code to the main or master branch, GitHub will automatically run the tests to check if everything is working fine.


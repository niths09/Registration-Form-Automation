# ToolsQA Automation Using Selenium

### Description
This project demonstrates an automation script for user registration, login and logout on the ToolsQA demo application. The script interacts with the web elements on the registration and login pages to simulate a user performing the following tasks:
1. Registering a new account.
2. Logging in with the registered account.
3. Logging out of the account.

The script uses Selenium WebDriver with Java and incorporates manual handling for CAPTCHA verification.


### Features
- Automates the registration process by filling in user details.
- Handles manual CAPTCHA solving with a pause in the script.
- Automates login and logout functionalities after successful registration.
- Alerts and confirmations are managed effectively in the script.
- Uses dynamic waits to handle varying page load times.


### Prerequisites
Before running the project, ensure the following are installed and set up:

1. **Java Development Kit (JDK)**: Install JDK 8 or later and set up the environment variables.
2. **Selenium WebDriver**: Include the Selenium library in your project. You can add it using a dependency manager like Maven/Gradle or manually download it.
3. **WebDriver Binary**: Ensure the ChromeDriver binary is installed and matches your Chrome browser version. Place it in a directory included in your system's PATH or provide the path explicitly in the code.
4. **Browser**: Google Chrome browser installed on the system.
5. **IDE**: Use an Integrated Development Environment like IntelliJ IDEA or Eclipse to run the script.


### **Technologies Used**
- **Programming Language**: Java
- **Automation Framework**: Selenium WebDriver
- **Browser**: Google Chrome
- **Testing Environment**: ToolsQA Demo Page
- **Java Libraries**:
  - Selenium Support Libraries (`org.openqa.selenium.*`)
  - WebDriverWait and ExpectedConditions for dynamic waits
  - Java Utilities like `Scanner` for user input
  - JavaScript Executor for smooth scrolling


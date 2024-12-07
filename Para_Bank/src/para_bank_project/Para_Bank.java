package para_bank_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Para_Bank {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        waitForTheUser();
        
        WebElement registerButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Register']")));
        registerButton.click();
        waitForTheUser();
        
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
        scrollDown.executeScript("window.scrollBy(0,200)");
		waitForTheUser();
        
        WebElement firstName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='customer.firstName']")));
        firstName.click();
        firstName.sendKeys("Ethan");
        waitForTheUser();
        
        WebElement lastName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='customer.lastName']")));
        lastName.click();
        lastName.sendKeys("Winters");
        waitForTheUser();
        
        WebElement addressField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='customer.address.street']")));
        addressField.click();
        addressField.sendKeys("Old Dulvey Plantation, 136 Bayou Road");
        waitForTheUser();
        
        WebElement cityField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='customer.address.city']")));
        cityField.click();
        cityField.sendKeys("Dulvey");
        waitForTheUser();
        
        WebElement stateField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='customer.address.state']")));
        stateField.click();
        stateField.sendKeys("Louisiana");
        waitForTheUser();
        
        WebElement zipCode = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='customer.address.zipCode']")));
        zipCode.click();
        zipCode.sendKeys("70544");
        waitForTheUser();
        
        WebElement phoneNumber = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='customer.phoneNumber']")));
        phoneNumber.click();
        phoneNumber.sendKeys("(337) 555-0199");
        waitForTheUser();
        
        WebElement ssnField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='customer.ssn']")));
        ssnField.click();
        ssnField.sendKeys("441-75-8901");
        waitForTheUser();
        
        WebElement userName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='customer.username']")));
        userName.click();
        userName.sendKeys("ethan@1984");
        waitForTheUser();
        
        WebElement passWord = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='customer.password']")));
        passWord.click();
        passWord.sendKeys("EthanwinterS@1984!");
        waitForTheUser();
        
        WebElement repeatedPassword = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='repeatedPassword']")));
        repeatedPassword.click();
        repeatedPassword.sendKeys("EthanwinterS@1984!");
        waitForTheUser();
        
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='submit'])[2]")));
        submitButton.click();
        waitForTheUser();
        
        WebElement loginMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title']")));
        System.out.println("Login Message: " + loginMessage.getText());
        System.out.println("Your account was created successfully. You are now logged in.");
        waitForTheUser();
        
        WebElement logOut = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Log Out']")));
        logOut.click();
        System.out.println();
        System.out.println("Successfully logged out.");
        waitForTheUser();
        
        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")));
        usernameField.click();
        usernameField.sendKeys("ethan@1984");
        waitForTheUser();
        
        WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']")));
        passwordField.click();
        passwordField.sendKeys("EthanwinterS@1984!");
        waitForTheUser();
        
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Log In']")));
        loginButton.click();
        waitForTheUser();
        
        driver.close();
	}
	
	public static void waitForTheUser() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

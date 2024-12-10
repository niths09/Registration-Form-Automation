package sign_up_genius;

import java.time.Duration;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp_Form {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.signupgenius.com/register");
        waitForTheUser();
        
        WebElement signupButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Create a Sign Up']")));
        signupButton.click();
        waitForTheUser();
        
        WebElement firstNameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='firstNameId']")));
        firstNameField.click();
        firstNameField.sendKeys("Chris");
        waitForTheUser();
        
        WebElement lastNameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='lastNameId']")));
        lastNameField.click();
        lastNameField.sendKeys("Redfield");
        waitForTheUser();
        
        WebElement emailIDField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='myEmailId']")));
        emailIDField.click();
        emailIDField.sendKeys("chrisredfield@gmail.com");
        waitForTheUser();
        
        WebElement passWordField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='pwordId']")));
        passWordField.click();
        passWordField.sendKeys("Cr@!ADA21309");
        waitForTheUser();
        
        WebElement viewPassWord = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"registration\"]/form/div/div[5]/div/span")));
        viewPassWord.click();
        waitForTheUser();
        viewPassWord.click();
        waitForTheUser();
        
        JavascriptExecutor scrollDownOne = (JavascriptExecutor) driver;
        scrollDownOne.executeScript("window.scrollBy(0,100)");
		waitForTheUser();
        
        // Pause the script for manual CAPTCHA solving
     	System.out.println("Please solve the CAPTCHA manually and press Enter to continue...");
     	Scanner scanner = new Scanner(System.in);
     	scanner.nextLine(); // Waits for user input
     	scanner.close(); // Close the Scanner to avoid resource leak
     	waitForTheUser();
        
        WebElement registerButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Register Now']")));
        registerButton.click();
        waitForTheUser();

        /*WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='logoutLink']")));
        logoutButton.click();
        waitForTheUser();*/
        
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Log In']")));
        loginButton.click();
        waitForTheUser();
        
        WebElement emailIdField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']")));
        emailIdField.click();
        emailIdField.sendKeys("chrisredfield@gmail.com");
        waitForTheUser();
        
        WebElement loginPasswordField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));
        loginPasswordField.click();
        loginPasswordField.sendKeys("Cr@!ADA21309");
        waitForTheUser();
        
        WebElement submitField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Login']")));
        submitField.click();
        waitForTheUser();
        
        JavascriptExecutor scrollDownTwo = (JavascriptExecutor) driver;
        scrollDownTwo.executeScript("window.scrollBy(0,800)");
		waitForTheUser();
		
		JavascriptExecutor scrollUp = (JavascriptExecutor) driver;
		scrollUp.executeScript("window.scrollBy(0,-800)");
		waitForTheUser();
		
		WebElement profileButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main-nav\"]/div/div[1]/div/div/div")));
        profileButton.click();
        waitForTheUser();
        
        WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='logoutLink']")));
        logoutButton.click();
        waitForTheUser();
        
        driver.quit();
	}
	
	public static void waitForTheUser() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

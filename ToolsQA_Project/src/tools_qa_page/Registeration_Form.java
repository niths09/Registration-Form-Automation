package tools_qa_page;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registeration_Form {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://demoqa.com/login");
        
        WebElement newUser = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='newUser']")));
        newUser.click();
        waitForTheUser();
        
        JavascriptExecutor scrollDownTwo = (JavascriptExecutor) driver;
        scrollDownTwo.executeScript("window.scrollBy(0,200)");
		waitForTheUser();
		
		WebElement firstName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='firstname']")));
		firstName.click();
		firstName.sendKeys("Mia");
		waitForTheUser();
		
		WebElement lastName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='lastname']")));
		lastName.click();
		lastName.sendKeys("Winters");
		waitForTheUser();
		
		WebElement userName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='userName']")));
		userName.click();
		userName.sendKeys("mia@22");
		waitForTheUser();
		
		WebElement passWord = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='password']")));
		passWord.click();
		passWord.sendKeys("MiaWinters@22!");
		waitForTheUser();
		
		// Pause the script for manual CAPTCHA solving
		System.out.println("Please solve the CAPTCHA manually and press Enter to continue...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine(); // Waits for user input
		scanner.close(); // Close the Scanner to avoid resource leak
		
		WebElement registerButon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='register']")));
		registerButon.click();
		waitForTheUser();
		
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		System.out.println("Alert accepted successfully.");
		waitForTheUser();
		
		WebElement backButon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[3]")));
		backButon.click();
		waitForTheUser();
		
		WebElement uName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='userName']")));
		uName.click();
		uName.sendKeys("mia@22");
		waitForTheUser();
		
		WebElement pWord = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='password']")));
		pWord.click();
		pWord.sendKeys("MiaWinters@22!");
		waitForTheUser();
		
		WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='login']")));
		loginButton.click();
		waitForTheUser();
		
		WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[2]")));
		logoutButton.click();
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

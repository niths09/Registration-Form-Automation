package lambdatest_project;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lambdatest_Registration {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
        waitForTheUser();
        
        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-primary']")));
        continueButton.click();
        waitForTheUser();
		
		WebElement firstName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='firstname']")));
		firstName.click();
		firstName.sendKeys("Ethan");
        waitForTheUser();
        
        WebElement lastName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='lastname']")));
		lastName.click();
		lastName.sendKeys("Winters");
        waitForTheUser();
        
        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='email']")));
        emailField.click();
        emailField.sendKeys("ethanwinters1984@gmail.com");
        waitForTheUser();
        
        JavascriptExecutor scrollDownOne = (JavascriptExecutor) driver;
        scrollDownOne.executeScript("window.scrollBy(0,400)");
		waitForTheUser();
		
        WebElement telePhone = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='telephone']")));
        telePhone.click();
        telePhone.sendKeys("(337) 555-0199");
        waitForTheUser();
        
        WebElement passWord = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']")));
        passWord.click();
        passWord.sendKeys("EthanwinterS@1984");
        waitForTheUser();
        
        WebElement confirmPassword = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='confirm']")));
        confirmPassword.click();
        confirmPassword.sendKeys("EthanwinterS@1984");
        waitForTheUser();
        
        WebElement subscribeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='input-newsletter-yes']")));
        subscribeButton.click();
        waitForTheUser();
        
        WebElement policyButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[@class='custom-control-label'])[3]")));
        policyButton.click();
        waitForTheUser();
        
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit']")));
        submitButton.click();
        waitForTheUser();
        
        WebElement loginMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='page-title my-3']")));
        System.out.println("Login Message: " + loginMessage.getText());
        System.out.println("Congratulations! Your new account has been successfully created!");
        waitForTheUser();
        
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Continue']")));
        proceedButton.click();
        waitForTheUser();
        
        JavascriptExecutor scrollDownTwo = (JavascriptExecutor) driver;
        scrollDownTwo.executeScript("window.scrollBy(0,400)");
		waitForTheUser();
		
		WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fas fa-sign-out-alt fa-fw mr-1']")));
		logoutButton.click();
        waitForTheUser();
        
        WebElement logoutMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='page-title my-3']")));
        System.out.println();
        System.out.println("Logout Message: " + logoutMessage.getText());
        System.out.println("You have been logged off your account. It is now safe to leave the computer.");
        waitForTheUser();
        
        WebElement logoutContinue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-primary']")));
        logoutContinue.click();
        waitForTheUser();
        
        WebElement myAccount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[6]/a/div/span")));
        myAccount.click();
        waitForTheUser();
        
        WebElement inputEmail = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='input-email']")));
        inputEmail.click();
        inputEmail.sendKeys("ethanwinters1984@gmail.com");
        waitForTheUser();
        
        WebElement inputPassword = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='input-password']")));
        inputPassword.click();
        inputPassword.sendKeys("EthanwinterS@1984");
        waitForTheUser();
        
        WebElement inputLogin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Login']")));
        inputLogin.click();
        waitForTheUser();
        
        driver.quit();
	}
	
	public static void waitForTheUser() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

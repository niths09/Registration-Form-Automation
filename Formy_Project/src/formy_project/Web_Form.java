package formy_project;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Web_Form {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://formy-project.herokuapp.com/form");
        waitForTheUser();
        
        WebElement firstName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='first-name']")));
        firstName.click();
        firstName.sendKeys("Chris");
        waitForTheUser();
        
        WebElement lastName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='last-name']")));
        lastName.click();
        lastName.sendKeys("Redfield");
        waitForTheUser();
        
        WebElement jobTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='job-title']")));
        jobTitle.click();
        jobTitle.sendKeys("QA Engineer");
        waitForTheUser();
        
        WebElement highLevelEducation = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='radio-button-3']")));
        highLevelEducation.click();
        waitForTheUser();
        
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
        scrollDown.executeScript("window.scrollBy(0,400)");
		waitForTheUser();
        
        WebElement genderField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkbox-2']")));
        genderField.click();
        waitForTheUser();
        
        WebElement yearOfExperience = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='select-menu']")));
        Select object = new Select (yearOfExperience);
        object.selectByVisibleText("2-4");
        waitForTheUser();
        
        WebElement datePicker = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='datepicker']")));
        datePicker.click();
        datePicker.sendKeys("07/12/2022");
        waitForTheUser();
        
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@role='button']")));
        submitButton.click();
        waitForTheUser();
        
        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@align='center']")));
        System.out.println("Login Message: " + successMessage.getText());
        System.out.println("The form was successfully submitted!");
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

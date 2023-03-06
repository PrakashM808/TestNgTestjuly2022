package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.AddCategoryPage;
import util.BrowserFactory;

public class DuplicatedCategoryTest2 {

	WebDriver driver;
	String category = "NEWTEST310";

	@Test
	public void Validate_a_user_is_Not_able_to_add_category() {
		driver = BrowserFactory.init();
		
		// Get the input element for the new category name
		WebElement categoryNameInput = driver.findElement(By.id("category-name"));

		// Enter a category name that already exists
		String duplicatedCategoryName = "NEWTEST310";
		categoryNameInput.sendKeys(duplicatedCategoryName);

		// Submit the form to add the new category
		WebElement submitButton = driver.findElement(By.id("add-category-button"));
		submitButton.click();

		// Check if the error message is displayed
		WebElement errorMessage = driver.findElement(By.id("duplicate-category-error"));
		if (errorMessage.isDisplayed()) {
		    // Get the text of the error message
		    String errorMessageText = errorMessage.getText();
		    
		    // Check if the error message contains the duplicated category name
		    if (errorMessageText.contains(duplicatedCategoryName)) {
		        System.out.println("Validation Passed: Duplicate category error message displayed correctly");
		    } else {
		        System.out.println("Validation Failed: Duplicate category error message does not contain the duplicated category name");
		    }
		} else {
		    System.out.println("Validation Failed: Duplicate category error message not displayed");
		}
	}
}
//Test 2: Validate a user is not able to add a duplicated category. If it does then the following 
//message will display: "The category you want to add already exists: <duplicated category name>."

//Test 3: Validate the month drop down has all the months (jan, feb, mar ...) in the Due Date dropdown section.
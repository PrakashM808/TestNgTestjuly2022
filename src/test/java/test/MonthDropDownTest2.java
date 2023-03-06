package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import util.BrowserFactory;

public class MonthDropDownTest2 {
	
	WebDriver driver;
	@Test
	public void MonthDropDownTest() {
		driver=BrowserFactory.init();
//		
//		AddCategoryPage addCategoryPage = PageFactory.initElements(driver, AddCategoryPage.class);
//		addCategoryPage.insertNewList("July2022QA");
//		addCategoryPage.selectCategory("PrakashMijarQA413");
//		addCategoryPage.selectDay("21");
//		addCategoryPage.selectMonth("Oct");
//		addCategoryPage.selectYear("2023");
//		addCategoryPage.addNewListButton();
//		addCategoryPage.SkyBlueBackgroundButton();
//	}
	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"extra\"]/select[3]"));

	// Click on the dropdown to open the list
	dropdown.click();

	// Get all the options in the list
	List<WebElement> options = dropdown.findElements(By.tagName("option"));

	// Create a list of expected months
	List<String> expectedMonths = Arrays.asList("None","Jan", "Feb", "Mar", "Apr", "May", "Jun",
	    "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");

	// Create a list of actual months from the dropdown options
	List<String> actualMonths = new ArrayList<String>();
	for (WebElement option : options) {
	    actualMonths.add(option.getText());
	}

	// Sort the lists to ensure order doesn't affect comparison
	Collections.sort(expectedMonths);
	Collections.sort(actualMonths);

	// Compare the expected and actual lists
	if (expectedMonths.equals(actualMonths)) {
	    System.out.println("Validation Passed: Dropdown contains all the months" + actualMonths );
	} else {
	    System.out.println("Validation Failed: Dropdown does not contain all the months");
	}
}
}

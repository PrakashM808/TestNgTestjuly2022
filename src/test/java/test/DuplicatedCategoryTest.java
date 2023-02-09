package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.AddCategoryPage;
import util.BrowserFactory;

public class DuplicatedCategoryTest {
	
	
	
	WebDriver driver;
	String category ="NEWTEST310";
	@Test
	public void Validate_a_user_is_Not_able_to_add_category() {
		driver=BrowserFactory.init();
		
		AddCategoryPage addCategoryPage = PageFactory.initElements(driver, AddCategoryPage.class);
		addCategoryPage.insertDuplicateCategory(category);
		addCategoryPage.addCategoryButton();
		
		System.out.println("The category you want to add already exists:"+ category );
		
		
	}

}
//Test 2: Validate a user is not able to add a duplicated category. If it does then the following 
//message will display: "The category you want to add already exists: <duplicated category name>."

//Test 3: Validate the month drop down has all the months (jan, feb, mar ...) in the Due Date dropdown section.
package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.AddCategoryPage;
import util.BrowserFactory;

public class AddCategoryTest {

	
	
	WebDriver driver;
	@Test
	public void Validate_a_user_is_able_to_add_category() {
		driver=BrowserFactory.init();
		
		AddCategoryPage addCategoryPage = PageFactory.initElements(driver, AddCategoryPage.class);
		addCategoryPage.insertNewCategory("PrakashMijarQA");
		addCategoryPage.selectColor("Purple");
		addCategoryPage.addCategoryButton();
		
		
	}
	
}

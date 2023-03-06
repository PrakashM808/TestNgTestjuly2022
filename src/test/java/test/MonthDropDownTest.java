package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.AddCategoryPage;
import util.BrowserFactory;

public class MonthDropDownTest {
	
	WebDriver driver;
	@Test
	public void MonthDropDownTest() {
		driver=BrowserFactory.init();
		
		AddCategoryPage addCategoryPage = PageFactory.initElements(driver, AddCategoryPage.class);
		addCategoryPage.insertNewList("July2022QA");
		addCategoryPage.selectCategory("PrakashMijarQA413");
		addCategoryPage.selectDay("21");
		addCategoryPage.selectMonth("Oct");
		addCategoryPage.selectYear("2023");
		addCategoryPage.addNewListButton();
		addCategoryPage.SkyBlueBackgroundButton();
	}
	

}

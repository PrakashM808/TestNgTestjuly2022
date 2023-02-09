package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCategoryPage extends BasePage {
	
	WebDriver driver;
	public AddCategoryPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(how = How.XPATH, using ="//html/body/div[4]/input[1]")WebElement ADD_NEW_LIST_ELEMENT;
	@FindBy(how = How.XPATH, using ="/html/body/div[4]/input[2]")WebElement ADD_NEW_LIST_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using ="//*[@id=\"extra\"]/input[1]")WebElement ADD_NEW_CATEGORY_ELEMENT;
	@FindBy(how = How.XPATH, using ="//*[@id=\"extra\"]/select[5]")WebElement COLOR_FOR_ADDED_CATEGORY_ELEMENT;
	@FindBy(how = How.XPATH, using ="//*[@id=\"extra\"]/input[2]")WebElement ADD_CATEGORY_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using ="//*[@id=\"extra\"]/select[2]")WebElement SELECT_DAY_ELEMENT;
	@FindBy(how = How.XPATH, using ="//*[@id=\"extra\"]/select[3]")WebElement SELECT_MONTH_ELEMENT;
	@FindBy(how = How.XPATH, using ="//*[@id=\"extra\"]/select[4]")WebElement SELECT_YEAR_ELEMENT;
	@FindBy(how = How.XPATH, using ="//*[@id=\"extra\"]/select[1]")WebElement SELECT_CATEGORY_ELEMENT;
	@FindBy(how = How.XPATH, using ="//*[@id=\"extra\"]/button[1]")WebElement SELECT_SKY_BLUE_BACKGROUND_ELEMENT;
	
	String insertedList;
	public void insertNewList(String newList) {
		insertedList =newList +generateRandomNum(999);
		ADD_NEW_LIST_ELEMENT.sendKeys(insertedList);
		
	}
	
	
	String insertedCategory;
	public void insertNewCategory(String newCategory) {
		insertedCategory =newCategory +generateRandomNum(999);
		ADD_NEW_CATEGORY_ELEMENT.sendKeys(insertedCategory);
		
	}
	
	String insertedduplicateCategory;
	public void insertDuplicateCategory(String DuplicateCategory) {
		insertedduplicateCategory =DuplicateCategory ;
		ADD_NEW_CATEGORY_ELEMENT.sendKeys(insertedduplicateCategory);
	}
	
	
	public void selectDay(String day) {
		selectFromDrowdown(SELECT_DAY_ELEMENT,day);	 
		
	}
	
	public void selectMonth(String month) {
		selectFromDrowdown(SELECT_MONTH_ELEMENT,month);	 
		
	}
	public void selectYear(String year) {
		selectFromDrowdown(SELECT_YEAR_ELEMENT,year);	 
		
	}
	public void selectCategory(String category) {
		selectFromDrowdown(SELECT_CATEGORY_ELEMENT,category);	
		
	}
	
	public void selectColor(String color) {
		selectFromDrowdown(COLOR_FOR_ADDED_CATEGORY_ELEMENT,color);	 
		
	}
	
	public void addCategoryButton() {
		ADD_CATEGORY_BUTTON_ELEMENT.click();
		
		
	}
	public void addNewListButton() {
		ADD_NEW_LIST_BUTTON_ELEMENT.click();
		
		
	}
	public void SkyBlueBackgroundButton() {
		SELECT_SKY_BLUE_BACKGROUND_ELEMENT.click();
		
		
	}


}

package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class editcustomer_pageobjects {

	@FindBy(xpath = "//a[text()='Edit Customer']")
	public static WebElement edit_customer;

	@FindBy(xpath = "//p[text()='Edit Customer Form']")
	public static WebElement edit_customer_title;

	@FindBy(xpath = "//input[@name='cusid']")
	public static WebElement customer_id;
	
	@FindBy(xpath = "//input[@name='AccSubmit']")
	public static WebElement submit_button;
}

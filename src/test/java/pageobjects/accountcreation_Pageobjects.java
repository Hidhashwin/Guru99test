package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class accountcreation_Pageobjects {
	
	@FindBy(xpath = "//a[text()='New Customer']")
	public static WebElement new_customer;
	
	@FindBy(xpath = "//p[text()='Add New Customer']")
	public static WebElement add_new_customer;
	
	@FindBy(xpath = "//input[@name='name']")
	public static WebElement customer_name;
	
	@FindBy(xpath = "(//input[@type='radio' and @name='rad1'])[1]")
	public static WebElement male;
	
	@FindBy(xpath = "(//input[@type='radio' and @name='rad1'])[2]")
	public static WebElement female;
	
	@FindBy(xpath = "//input[@id='dob']")
	public static WebElement DOB;
	
	@FindBy(xpath = "//textarea[@name='addr']")
	public static WebElement address;
	
	@FindBy(xpath = "//input[@name='city']")
	public static WebElement city;
	
	@FindBy(xpath = "//input[@name='state']")
	public static WebElement state;
	
	@FindBy(xpath = "//input[@name='pinno']")
	public static WebElement pin;
	
	@FindBy(xpath = "//input[@name='telephoneno']")
	public static WebElement mobile_num;
	
	@FindBy(xpath = "//input[@name='emailid']")
	public static WebElement email_id;
	
	@FindBy(xpath = "//input[@name='password']")
	public static WebElement pass_word;
	
	@FindBy(xpath = "//input[@name='sub']")
	public static WebElement submit_button;
	
	@FindBy(xpath = "//tr[4]/td[2]")
	public static WebElement cus_id;
	
	
	

}

package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class newAccount_Pageobjects {
	
	@FindBy(xpath = "//p[text()='Add new account form']")
	public static WebElement Add_new_Account_Header;
	
	@FindBy(xpath = "//a[text()='New Account']")
	public static WebElement new_account;
	
	@FindBy(css = "input[name='inideposit']")
    public static WebElement initial_deposit;	
	
	@FindBy(css = "input[name='cusid']")
    public static WebElement customer_ID;
	
	@FindBy(css = "input[name='button2']")
    public static WebElement submit_button;
	
	@FindBy(css = "select[name='selaccount']")
	public static WebElement account_type;
	
	@FindBy(css = "p.heading3")
	public static WebElement account_success;
	
	@FindBy(xpath = "//tr/td[2]")
	public static WebElement Acc_ID;

}

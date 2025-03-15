package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class deposit_Pageobjects {
	
	@FindBy(xpath = "//ul[@class='menusubnav']/child::li/a[text()='Deposit']")
	public static WebElement deposit;
	
	@FindBy(css = "p.heading3")
	public static WebElement heading_of_page;
	
	@FindBy(css="input[name='accountno']")
	public static WebElement Acc_No;
	
	@FindBy(xpath = "(//input[starts-with(@type,'tex')])[2]")
	public static WebElement amount;
	
	@FindBy(xpath = "(//input[starts-with(@type,'tex')])[3]")
	public static WebElement discription;
	
	@FindBy(xpath = "//input[@type='submit' or @name='AccSubmit']")
	public static WebElement submit_button;

}

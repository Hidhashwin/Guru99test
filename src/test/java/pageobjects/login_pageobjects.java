package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login_pageobjects {
	
	@FindBy(name = "uid")
	public static WebElement username;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(name="btnLogin")
	public static WebElement loginbutton;
	
	@FindBy(id = "/html/body/div[2]/h2")
	public static WebElement title;
}

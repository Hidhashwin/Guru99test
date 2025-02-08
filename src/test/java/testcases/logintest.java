package testcases;



import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


import commonfunctions.commonfunctionsGuru1;
import commonfunctions.takingscreenshot;
import pageobjects.login_pageobjects;

public class logintest extends commonfunctionsGuru1 {
	
	 public String titletext;
	
	public static void login() throws InterruptedException {
		
		PageFactory.initElements(driver,login_pageobjects.class);
		login_pageobjects.username.sendKeys(properties.getProperty("username"));
		login_pageobjects.password.sendKeys(properties.getProperty("password"));
		takingscreenshot.takeScreenshot(driver, "loginpage");
		login_pageobjects.loginbutton.click();
		takingscreenshot.takeScreenshot(driver, "create customerpage");
		Thread.sleep(3000);
	}

	/*
	 * public void titlevalidation() {
	 * PageFactory.initElements(driver,login_pageobjects.class);
	 * titletext=login_pageobjects.title.getText(); //Assert.assertEquals(titletext,
	 * "Guru99 Bank"); }
	 */
	@Test
	public void check() throws InterruptedException {
		login();
		
	
	}
}

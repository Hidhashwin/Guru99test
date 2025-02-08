package testcases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonfunctions.actionclass;
import commonfunctions.commonfunctionsGuru1;
import commonfunctions.takingscreenshot;
import pageobjects.editcustomer_pageobjects;

public class editcustomertest extends commonfunctionsGuru1 {
	@Test
	public void editcustomer() throws InterruptedException, IOException {
		PageFactory.initElements(driver,editcustomer_pageobjects.class);
		
		actionclass act1=new actionclass(driver, 20);
		
		act1.click(editcustomer_pageobjects.edit_customer);
		takingscreenshot.takeScreenshot(driver, "edit customer");
		Thread.sleep(1000);
		//Validating title
		String editcustomerformtitle=editcustomer_pageobjects.edit_customer_title.getText();
		Assert.assertEquals(editcustomerformtitle, "Edit Customer Form");
		
		String location="usingfilewriter.txt";
		FileReader fileReader=new FileReader(location);
		try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			String cus_id=bufferedReader.readLine();
			
			act1.enterText(editcustomer_pageobjects.customer_id, cus_id);
		}
		takingscreenshot.takeScreenshot(driver, "edit customer_id entered");
		act1.click(editcustomer_pageobjects.submit_button);
		Thread.sleep(2000);
		takingscreenshot.takeScreenshot(driver, "edit customer_id entered");
	}

}

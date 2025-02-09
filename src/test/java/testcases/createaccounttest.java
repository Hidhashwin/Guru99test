package testcases;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commonfunctions.WaitUtility;
import commonfunctions.actionclass;
import commonfunctions.commonfunctionsGuru1;
import commonfunctions.takingscreenshot;
import pageobjects.accountcreation_Pageobjects;

public class createaccounttest extends commonfunctionsGuru1 {
	
	public actionclass act;
@Test
	public void newaccount() throws InterruptedException, IOException {
		PageFactory.initElements(driver,accountcreation_Pageobjects.class);
		act=new actionclass(driver, 20);
		
		act.click(accountcreation_Pageobjects.new_customer);
		takingscreenshot.takeScreenshot(driver, "new customer page");
		Thread.sleep(500);
		//Validating title
		String title=accountcreation_Pageobjects.add_new_customer.getText();
		Assert.assertEquals(title, "Add New Customer");
		System.out.println(title);
		act.enterText(accountcreation_Pageobjects.customer_name,properties.getProperty("customername"));
		act.click(accountcreation_Pageobjects.female);
		act.enterText(accountcreation_Pageobjects.DOB, properties.getProperty("dateofbirth"));
		act.enterText(accountcreation_Pageobjects.address, properties.getProperty("Address"));
		act.enterText(accountcreation_Pageobjects.city, properties.getProperty("City"));
		act.enterText(accountcreation_Pageobjects.pin, properties.getProperty("Pin"));
		act.enterText(accountcreation_Pageobjects.mobile_num, properties.getProperty("Mobilenum"));
		act.enterText(accountcreation_Pageobjects.email_id, properties.getProperty("Email"));
		act.enterText(accountcreation_Pageobjects.state, properties.getProperty("State"));
		act.enterText(accountcreation_Pageobjects.pass_word, properties.getProperty("Pword"));
		takingscreenshot.takeScreenshot(driver, "all inputs added");
		Thread.sleep(1000);
		act.click(accountcreation_Pageobjects.submit_button);
		takingscreenshot.takeScreenshot(driver, "customer created");
		Thread.sleep(2000);
		String newcustomerid=accountcreation_Pageobjects.cus_id.getText();
		//writing the newly created customer id 
		FileWriter fileWriter=new FileWriter("usingfilewriter.txt");
		fileWriter.write(newcustomerid);
		fileWriter.close();
	}
}

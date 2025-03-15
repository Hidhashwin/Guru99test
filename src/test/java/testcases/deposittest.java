package testcases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonfunctions.actionclass;
import commonfunctions.commonfunctionsGuru1;
import commonfunctions.takingscreenshot;
import pageobjects.deposit_Pageobjects;

public class deposittest extends commonfunctionsGuru1 {
	actionclass act;

	@Test
	public void deposit() throws InterruptedException {

		PageFactory.initElements(driver, deposit_Pageobjects.class);
		act = new actionclass(driver, 20);
		act.click(deposit_Pageobjects.deposit);

		Thread.sleep(300);
		String header = deposit_Pageobjects.heading_of_page.getText();
		Assert.assertEquals(header, "Amount Deposit Form");
		takingscreenshot.takeScreenshot(driver, "Deposit page");
		Thread.sleep(300);
		String path = "usingfilewriter.txt";
		try {
			FileReader reader = new FileReader(path);
			@SuppressWarnings("resource")
			BufferedReader bufferedReader = new BufferedReader(reader);
			try {
				bufferedReader.readLine();
				String cust_id = bufferedReader.readLine();
				act.enterText(deposit_Pageobjects.Acc_No, cust_id);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		act.enterText(deposit_Pageobjects.amount, properties.getProperty("amount"));
		act.enterText(deposit_Pageobjects.discription, properties.getProperty("Description"));
		act.click(deposit_Pageobjects.submit_button);
		
		takingscreenshot.takeScreenshot(driver, "Deposit page");
	}

}

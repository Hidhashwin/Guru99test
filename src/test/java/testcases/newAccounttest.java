package testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonfunctions.actionclass;
import commonfunctions.commonfunctionsGuru1;
import commonfunctions.takingscreenshot;
import pageobjects.deposit_Pageobjects;
import pageobjects.newAccount_Pageobjects;

public class newAccounttest extends commonfunctionsGuru1 {

	@Test
	public void newAccount() throws InterruptedException, IOException, AWTException {
		PageFactory.initElements(driver, newAccount_Pageobjects.class);
		actionclass act3 = new actionclass(driver, 20);

		act3.click(newAccount_Pageobjects.new_account);

		takingscreenshot.takeScreenshot(driver, "Add Account");
		Thread.sleep(300);
		String Title = newAccount_Pageobjects.Add_new_Account_Header.getText();
		Assert.assertEquals(Title, "Add new account form");

		String location = "usingfilewriter.txt";

		try {
			FileReader reader = new FileReader(location);
			try (BufferedReader bufferedReader = new BufferedReader(reader)) {
				String customer_id = bufferedReader.readLine();
				act3.enterText(newAccount_Pageobjects.customer_ID, customer_id);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select select = new Select(newAccount_Pageobjects.account_type);
		select.selectByIndex(1);
		act3.enterText(newAccount_Pageobjects.initial_deposit, properties.getProperty("Initialdeposit"));
		act3.click(newAccount_Pageobjects.submit_button);
		Thread.sleep(200);

		String successmessge = newAccount_Pageobjects.account_success.getText();

		Assert.assertEquals(successmessge, "Account Generated Successfully!!!");
		Thread.sleep(1000);

		/*
		 * Robot robot=new Robot(); robot.keyPress(KeyEvent.VK_F5);
		 * robot.keyRelease(KeyEvent.VK_F5);
		 */
		if (newAccount_Pageobjects.Acc_ID == null) {
			System.out.println("Acc_No is null");
		} else {
			String newAcc_no1 = newAccount_Pageobjects.Acc_ID.getText();
			System.out.println("ACCOUNT Num " + newAcc_no1);

			// Open FileWriter in append mode by passing 'true' as the second argument
			try (FileWriter writer = new FileWriter("usingfilewriter.txt", true);
					BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

				bufferedWriter.write(System.lineSeparator()); // Add a new line
				bufferedWriter.write(newAcc_no1); // Write the new string value
			} catch (IOException e) {
				System.out.println("An error occurred: " + e.getMessage());
			}

		}

		takingscreenshot.takeScreenshot(driver, "new_account_successmessge");
		Thread.sleep(200);
	}

}

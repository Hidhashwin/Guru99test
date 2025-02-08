package commonfunctions;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class takingscreenshot {

	 public static void takeScreenshot(WebDriver driver, String fileName) {
	        // Convert WebDriver object to TakeScreenshot
	        TakesScreenshot screenshot = (TakesScreenshot) driver;

	        // Call getScreenshotAs method to create an image file
	        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

	     // Specify the location where the screenshot will be saved
	        String filePath = "C:\\Users\\WELCOME\\\\Desktop\\screenshots\\" + fileName + ".png";

	        try {
	            // Move image file to new destination
	            FileUtils.copyFile(srcFile, new File(filePath));
	            System.out.println("Screenshot saved at " + filePath);
	        } catch (IOException e) {
	            System.out.println("Failed to save screenshot: " + e.getMessage());
	        }
	    }
}

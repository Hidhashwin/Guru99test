package commonfunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class commonfunctionsGuru1 {
	
	public static Properties properties;
	public static WebDriver driver;

	public Properties loadproperty() throws IOException {

		FileInputStream fileInputStream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileInputStream);

		return properties;

	}

	@BeforeSuite
	public void Launchbrowser() throws IOException, InterruptedException {
		loadproperty();
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");

		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		takingscreenshot.takeScreenshot(driver, "homepage");
}
	@AfterSuite
	public void teardown() {
		driver.quit();
	}
}
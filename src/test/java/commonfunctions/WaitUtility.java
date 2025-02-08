package commonfunctions;
	// WaitUtility.java
	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import java.time.Duration;

	public class WaitUtility {
	    WebDriver driver;
	    WebDriverWait wait;

	    public WaitUtility(WebDriver driver, int timeout) {
	        this.driver = driver;
	        wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	    }

	    public void waitForElementToBeClickable(WebElement element) {
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	    }

	    public void waitForElementToBeVisible(WebElement element) {
	        wait.until(ExpectedConditions.visibilityOf(element));
	    }

	    public void waitForElementToBeInvisible(WebElement element) {
	        wait.until(ExpectedConditions.invisibilityOf(element));
	    }

	    // Add more wait methods as needed
	}




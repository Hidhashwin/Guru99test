package commonfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionclass {
	
	WebDriver driver;
    WaitUtility waitUtility;

    public actionclass(WebDriver driver, int timeout) {
        this.driver = driver;
        waitUtility = new WaitUtility(driver, timeout);
    }

    public void click(WebElement element) {	
        waitUtility.waitForElementToBeClickable(element);
        element.click();
    }

    public void enterText(WebElement element, String text) {
        waitUtility.waitForElementToBeVisible(element);
        element.sendKeys(text);
    }

    // Add more reusable methods as needed
	}



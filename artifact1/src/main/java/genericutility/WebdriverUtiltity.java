package genericutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WebdriverUtiltity {
	
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}

package java.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebDriver {

	public static WebDriver driver;
	
	public static void ChromeWebDriver(String url) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--disable-infobars");

		driver = new ChromeDriver(options);
		driver.get(url);
	}	
}
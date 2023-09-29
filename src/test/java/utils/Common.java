package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {
	WebDriver driver;
	

	public void setupBrowser(String browser, String url) {
		String currDir = System.getProperty("user.dir");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", currDir+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", currDir+"\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Invalid browser value provided, hence stopping the automation run");
			System.exit(0);
		}

		driver.manage().window().maximize();
		if(url!="")
			driver.get(url);
		else
			driver.get("about:blank");
	}
	
	public void quitDriver() {
		driver.quit();
	}

	public WebDriver getDriver() {
		return driver;
	}
}

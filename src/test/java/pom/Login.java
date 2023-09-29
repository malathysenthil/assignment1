package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	WebDriver driver;
	WebDriverWait wait;
	
	@CacheLookup
	@FindBy(id="email")
	WebElement email;
	
	@CacheLookup
	@FindBy(id="pass")
	WebElement pass;
	
	@CacheLookup
	@FindBy(id="u_0_b")
	WebElement loginBtn;
	
	@CacheLookup
	@FindBy(xpath = "//select[@id='day']")
	WebElement birthDate;
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 5000);
	}
	
	
	public void login(String username, String password) {
		
		wait.until(ExpectedConditions.visibilityOf(email));
		email.clear();
		email.sendKeys(username);
		pass.clear();
		pass.sendKeys(password);

//		loginBtn.click();
	}
	

	


}

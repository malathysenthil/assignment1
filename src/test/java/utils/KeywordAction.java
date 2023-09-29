package utils;

import pom.Login;
import test.Base;

public class KeywordAction extends Base{

	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getCurrentPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public void login(String username, String password) {
		Login loginObj = new Login(driver);
		loginObj.login(username, password);
	}
}

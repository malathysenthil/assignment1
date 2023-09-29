package test;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.KeywordAction;

public class BasicValidation extends Base{
	KeywordAction kw;
	@BeforeClass
	public void beforeClass() {
		kw = new KeywordAction();
	}
  @Test
  public void titleValidation() {
	  String expectedTitle = "Facebook – log in or sign up";
	  String actualTitle = kw.getPageTitle();
	  Reporter.log("Title of the page is - "+actualTitle);
	  assertTrue(actualTitle.equals(expectedTitle), "Title validation failed.");
  }
  
  @Test
  public void urlValidation() {
	  String expectedUrl = "https://www.facebook.com/";
	  String actualUrl = kw.getCurrentPageUrl();
	  Reporter.log("URL of the page is - "+actualUrl);
	  assertTrue(actualUrl.equals(expectedUrl), "URL validation failed.");
  }
}

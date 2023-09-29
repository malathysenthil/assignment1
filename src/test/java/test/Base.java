package test;

import utils.Common;
import utils.ReadPropertyFile;

import org.testng.annotations.BeforeSuite;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

public class Base {
	String configFileName = "config.properties";
	Properties configProp;
	Common common;
	public static WebDriver driver;
	
	public void readConfigFile(){
		String currDir = System.getProperty("user.dir");
		ReadPropertyFile rf = new ReadPropertyFile();
		configProp = rf.readFile(currDir+"\\"+configFileName);
	}

  @BeforeSuite
  public void beforeSuite() {
	  readConfigFile();
	  String browser = configProp.getProperty("browser");
	  String url = configProp.getProperty("url");
	   common = new Common();
	  common.setupBrowser(browser, url);
	  driver = common.getDriver();
  }

  @AfterSuite
  public void afterSuite() {
	  common.quitDriver();	  
  }
  

}

package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.KeywordAction;

public class LoginTest extends Base{
	
	KeywordAction kw;

	@BeforeClass
	public void beforeClass() {
		kw = new KeywordAction();
	}


	@Parameters({"validEmailId", "validPassword"})
	@Test
	public void validCredentialsTest(String username, String password) {
		kw.login(username, password);
		//add the assert code here
	}
	
	@Parameters({"invalidEmailId", "validPassword"})
	@Test
	public void invalidEmailTest(String username, String password) {
		kw.login(username, password);
		//add the assert code here
	}
	
	@Parameters({"validEmailId", "invalidPassword"})
	@Test
	public void invalidPasswordTest(String username, String password) {
		kw.login(username, password);
		//add the assert code here
	}
	
	@Parameters({"validPassword"})
	@Test
	public void blankEmailAndValidPasswordTest(String password) {
		kw.login("", password);
		//add the assert code here
	}
	
	@Parameters({"validEmailId"})
	@Test
	public void blankPasswordTest(String username) {
		kw.login(username, "");
		//add the assert code here
	}
		
	@Test
	public void blankUseridAndPasswordTest() {
		kw.login("", "");
		//add the assert code here
	}
	
	
}

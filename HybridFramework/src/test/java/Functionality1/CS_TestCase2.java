package Functionality1;

import org.junit.BeforeClass;
import org.junit.Test;
import Automation.HybridFramework.BaseClass;
import Automation.HybridFramework.Keyword;
import InitiateScript.Open_Browser;
import UserLogin.UserLogin_User1;

public class CS_TestCase2 extends BaseClass {

	@Test
	public void CS_TestCase1_Test() throws InterruptedException {

		// ** Open Browser **
		Keyword.ADD_COMMENT_TO_LOG("Open Browser");
		Open_Browser.Open_Browser_Test();

		// ** Login to Application using User1 **
		Keyword.ADD_COMMENT_TO_LOG("Login to Application using User1");
		UserLogin_User1.UserLogin_User1_Test();
	}

	@BeforeClass
	public static void beforeClass() {
		createTestCaseReport(new Object() {}.getClass().getName());
		// System.out.println("Execution started " + new Object()
		// {}.getClass().getName());
	}
}

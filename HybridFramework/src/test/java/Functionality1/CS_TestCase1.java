package Functionality1;

import org.junit.BeforeClass;
import org.junit.Test;
import Automation.HybridFramework.BaseClass;
import Automation.HybridFramework.Keyword;
import InitiateScript.Open_Browser;
//import UserLogin.UserLogin_User1;
import UserLogin.UserLogin_User2;

public class CS_TestCase1 extends BaseClass {

	@Test
	public void CS_TestCase1_Test() throws InterruptedException {

		// ** Open Browser ** --> Update 6 PC2
		Keyword.ADD_COMMENT_TO_LOG("Open Browser");
		Open_Browser.Open_Browser_Test();

		// ** Login to Application using User1 **
		Keyword.ADD_COMMENT_TO_LOG("Login to Application using User1");
		UserLogin_User2.UserLogin_User2_Test();
	}

	@BeforeClass
	public static void beforeClass() {
		createTestCaseReport(new Object() {}.getClass().getName());
		// System.out.println("Execution started " + new Object()
		// {}.getClass().getName());
	}
}

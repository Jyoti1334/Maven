package com.scripts;




import org.testng.Assert;
import org.testng.annotations.*;

import com.pageFactory.*;


public class TestScript extends BaseTest {
	
	 public LoginPage objLoginPage;
	 public HomePage objHomePage;
	 
	 public void initilizePages(){
		 objLoginPage=new LoginPage(driver);
		 objHomePage=new HomePage(driver);	
	 }
	
	 /**
	  * Method to intialize web browser
	  */
	// @Test(groups={"Smoke"})
	 @BeforeTest
	 public  void initializeWebEnvironment() {
			this.initializeWebBrowser();
			this.initilizePages();
		   }
	
	 /**
	  * Method to verify LoginPage 
	  */
	@Test(priority=1)
	public void TCID_001_verifyLoginPage(){
		
		 String loginPageTitle = objLoginPage.getLoginPageTitleText();

		 Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

		 objLoginPage.loginToGuru99("mngr327539","vAqejaq");
	}
	
	
	/**
	 * Method to verify HomePage
	 */
	@Test(priority=2)
	public void TCID_003_verifyHomepage(){
		
		objHomePage.getHomePageDashboardNameText();
	}
	
	
	@Test(groups= {"Include Group"})  
	public void TCID_004_include()   
	{  
	System.out.println("This  test case is included in guru99 Test Script ");  
	}
	
	@Test(groups= {"Sanity"})  
	public void TCID_005_sanity()   
	{  
	System.out.println("This  test case is added in sanity group ");  
	}
	
	@Test(groups= {"Regression"})  
	public void TCID_004_regression()   
	{  
	System.out.println("This  test case is added in sanity group ");  
	}
	
	/**
	 * Method to verify Browser Termination
	 */
	@AfterTest
	public void TCID_005_verifyTearDown(){
	   this.tearDown();
	}

}

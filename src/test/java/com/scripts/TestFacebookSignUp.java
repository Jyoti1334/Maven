package com.scripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.facebookSignup.*;


import com.generic.BaseTest;
import com.generic.Utilities;
import com.generic.Wrapper_Function;

public class TestFacebookSignUp extends BaseTest{
	public Utilities objUtilities1;
	public Wrapper_Function objWrapperFun;
	public FacebookSignUpPageObjects objFacebookPageObjects;
	public FacebookPage objFacebookPage;
	
	
	public void initilizePages(){
	    objUtilities1=new Utilities();
		objWrapperFun=PageFactory.initElements(BaseTest.driver, Wrapper_Function.class);
		objFacebookPageObjects=new  FacebookSignUpPageObjects(driver);
		objFacebookPage=new FacebookPage(driver);
	 }
	 
	// @Test(groups={"Smoke"})
	@BeforeTest
	 public  void initializeWebEnvironment() {
			this.initializeWebBrowser();
			this.initilizePages();
		   }
     
	 @Test  
		public void TCID_001_verifySignUp(){
			 
		    objFacebookPage.toCreateNewAccount();
	        objWrapperFun.setImplicitwait(10);
			objFacebookPageObjects.setFirstName(objUtilities1.getRandomString(2));
	        objFacebookPageObjects.setLastName(objUtilities1.getRandomString(4));
	        objFacebookPageObjects.setMobileNumber(objUtilities1.getRandomMobileNumber());
	        objFacebookPageObjects.setPassword("Admin@123");
	        objFacebookPageObjects.setBirthDate("9");
	        objFacebookPageObjects.setBirthMonth("May");
	        objFacebookPageObjects.setBirthYear("1995");
	        objFacebookPageObjects.setUserGender("male");
	        objFacebookPageObjects.clickonSignUp();
	        objWrapperFun.setImplicitwait(60);
	        
	   }
	 

		@Test(groups= {"Include Group"})  
		public void TCID_002_include()   
		{  
		System.out.println("This test case is included in facebook signup test script");  
		}
		
		@Test(groups= {"Sanity"})  
		public void TCID_003_sanity()   
		{  
		System.out.println("This  test case is added in sanity group ");  
		}
		
		@Test(groups= {"Regression"})  
		public void TCID_004_regression()   
		{  
		System.out.println("This  test case is added in sanity group ");  
		}
		
		
		
	 @AfterTest
     public void TCID_003_verifyTearDown(){
    	this.tearDown();
    	System.out.println("After Test Exceuted");
     }
     

}

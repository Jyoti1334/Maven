package com.pageFactory;

import org.openqa.selenium.By;



public class LoginPage {

	 //WebDriver driver;
	By loc_inp_userName=By.name("uid");
	By loc_inp_passWord=By.name("password");
	By loc_btn_loginButton=By.xpath("//input[@name='btnLogin']");
	By loc_txt_loginPageTitleText=By.xpath("//h2[@class='barone']");
	
	
	/***
	 * Here I passesd WebDriver driver parameter so that 
	 * my mutliple methods can use this parameter
	 * @param driver
	 */
//	 public LoginPage(WebDriver driver){
//	        this.driver = driver;
//	       
//	    }
	 
	 
	 /**
	  * Method to set UserName in UserName Field of guru99 Bank
	  * @param strUserName
	  */
	 public void setUserName(String strUserName){
	       BaseTest.driver.findElement(loc_inp_userName).sendKeys(strUserName);
	    }
	 
	 
	 /**
	  * Method to set Password in Password Field of guru99 Bank
	  * @param strPassword
	  */
	  public void setPassword(String strPassword){
	         BaseTest.driver.findElement(loc_inp_passWord).sendKeys(strPassword);
	    }
	  
	  /**
	   * Method to click on login button of guru99 Bank
	   */
	  public void clickLogin(){
          BaseTest.driver.findElement(loc_btn_loginButton).click();
        }
	  
	  
	  /**
	   * Method  to get LoginPage Title Text and store it in string
	   * @return
	   */
	  public String getLoginPageTitleText(){

		   String strLoginPageTitle=  BaseTest.driver.findElement(loc_txt_loginPageTitleText).getText();
		   System.out.println("Login page title is :"+strLoginPageTitle);
		   
		     return strLoginPageTitle;

		    }
	  
	  
	  /**
	   * Method to perform login operations of guru99 Bank
	   * @param strUserName
	   * @param strPasword
	   */
	  public void loginToGuru99(String strUserName,String strPasword){

	        this.setUserName(strUserName);

	        this.setPassword(strPasword);

	        this.clickLogin();        
	    }
	  
}

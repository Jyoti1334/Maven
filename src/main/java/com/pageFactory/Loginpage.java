package com.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	WebDriver driver;
	
	 public Loginpage(WebDriver driver){

	        this.driver = driver;

	    }
	 
	 public void setUserName(String strUserName){

	        driver.findElement(By.name("uid")).sendKeys(strUserName);

	    }
	 
	  public void setPassword(String strPassword){

	         driver.findElement(By.name("password")).sendKeys(strPassword);

	    }
	  
	  public void clickLogin(){

          driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

  }
	  public String getLoginTitle(){

		   String strLoginTitle=  driver.findElement(By.xpath("//h2[@class='barone']")).getText();
		   System.out.println("Login Title is :"+strLoginTitle);
		   
		     return strLoginTitle;

		    }
	  
	  public void loginToGuru99(String strUserName,String strPasword){

	        //Fill user name

	        this.setUserName(strUserName);

	        //Fill password

	        this.setPassword(strPasword);

	        //Click Login button

	        this.clickLogin();        
	    }
	  
}

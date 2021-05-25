package com.facebookSignup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class FacebookPage {
 WebDriver driver;
	By loc_btn_createNewAccountButton=By.xpath("//a[text()='Create New Account']");
   
	
	public FacebookPage( WebDriver driver){
	   this.driver=driver;
   }
	
	public void toCreateNewAccount(){
	  driver.findElement(loc_btn_createNewAccountButton).click();
	 
    }

}

package com.facebookSignup;

import org.openqa.selenium.By;

public class FacebookPage {

	By loc_btn_createNewAccountButton=By.xpath("//a[text()='Create New Account']");
    public void toCreateNewAccount(){
	  BaseTest.driver.findElement(loc_btn_createNewAccountButton).click();
	 
    }

}

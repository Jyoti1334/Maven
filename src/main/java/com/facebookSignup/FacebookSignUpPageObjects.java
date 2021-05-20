package com.facebookSignup;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


public class FacebookSignUpPageObjects  {
     By loc_inp_firstName=By.xpath("//input[@name='firstname']");
	 By loc_inp_lastName=By.xpath("//input[@name='lastname']");
	 By loc_inp_mobileNumber=By.xpath("//input[@name='reg_email__']");
	 By loc_inp_emailID=By.xpath("//input[@name='reg_email__']");
	 By loc_inp_rewiriteEmailId=By.xpath("//input[@name='reg_email_confirmation__']");
	 By loc_inp_passWord=By.xpath("//input[@id='password_step_input']");
	 By loc_drp_dayDropdown=By.id("day");
	 By loc_drp_monthDropdown=By.id("month");
	 By loc_drp_yearDropdown=By.id("year");
	 By loc_rbGender_femaleRadioButton=By.xpath("//input[@value='1']");
	 By loc_rbGender_maleRadioButton=By.xpath("//input[@value='2']");
	 By loc_rbGender_customRadioButton=By.xpath("//input[@value='-1]");
	 By loc_btn_signUpButton=By.xpath("//button[@name='websubmit']");
	 
	Wrapper_Function objWrapperFun=new Wrapper_Function();
	
		      //display first name 
	     public void setFirstName(String strFirstName) {
	    BaseTest. driver.findElement(loc_inp_firstName).
	     sendKeys(strFirstName);
	    objWrapperFun.setImplicitwait(5);
		   }
       //display surname
       public void setLastName(String strLastName) {
    	   BaseTest.driver.findElement(loc_inp_lastName).
       sendKeys(strLastName);
    	   objWrapperFun.setImplicitwait(5);
	   }
      //display Mobile number
       public void setMobileNumber(String strMobileNo) {
    	   BaseTest.driver.findElement(loc_inp_mobileNumber).
       sendKeys(strMobileNo);
    	   objWrapperFun.setImplicitwait(5);
	   }
       
       public void setEmailId(String strEmailId1){
    	   BaseTest.driver.findElement(loc_inp_emailID).sendKeys(strEmailId1);
    	   objWrapperFun.setImplicitwait(5);
       }
       public void setRe_EnterEmailId(String strEmailId){
    	   BaseTest.driver.findElement(loc_inp_rewiriteEmailId).sendKeys(strEmailId);
    	   objWrapperFun.setImplicitwait(5);
       }
       //display password
       public String setPassword(String strPassword) {
    	   BaseTest.driver.findElement(loc_inp_passWord).
       sendKeys(strPassword);
    	   objWrapperFun.setImplicitwait(5);
	   return strPassword;
      
       }
       
    
        
      public void setBirthDate(String strDate){
  		WebElement dateDropDown= BaseTest.driver.findElement(loc_drp_dayDropdown);
  		//By   dateDropDown= By.id("day");
    	  
  		objWrapperFun.selectValueFromdropdown( dateDropDown,strDate);
  		 objWrapperFun.setImplicitwait(5);
//    	  Select objSelect =new Select(driver.findElement(By.xpath("//select[@id='day']")));
//    	  objSelect.selectByVisibleText(strDate);
    }
       
       public void setBirthMonth(String strMonth){
    		WebElement monthDropDown= BaseTest.driver.findElement(loc_drp_monthDropdown);
      		objWrapperFun.selectValueFromdropdown( monthDropDown,strMonth);
      		 objWrapperFun.setImplicitwait(5);
  	   //objWrapperFun.selectDropDown("//span[@data-name='birthday_wrapper']//select[@id='month']", strMonth); 
 		 
 	   }
      public void setBirthYear(String strYear){
  		WebElement yearDropDown= BaseTest.driver.findElement(loc_drp_yearDropdown);
  		objWrapperFun.selectValueFromdropdown( yearDropDown,strYear);
  		 objWrapperFun.setImplicitwait(5);
    	  // objWrapperFun.selectDropDown("//span[@data-name='birthday_wrapper']//select[@id='year']", strYear); 
  		
  	}
       public void setUserGender(String strGender){
	        
	        if(strGender.equalsIgnoreCase("female")){
	        	BaseTest.driver.findElement(loc_rbGender_femaleRadioButton).click();
	          
	        }else if(strGender.equalsIgnoreCase("male")){
	        	BaseTest. driver.findElement(loc_rbGender_maleRadioButton).click();
	        }else{
	        	BaseTest. driver.findElement(loc_rbGender_customRadioButton).click();
	            
	    }
	        }
	    
       public void clickonSignUp() {
    	   BaseTest.driver.findElement(loc_btn_signUpButton).click();
    	   objWrapperFun.setImplicitwait(5);
       }
		
  	
       

}
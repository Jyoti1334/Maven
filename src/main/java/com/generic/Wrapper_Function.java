package com.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Wrapper_Function   {
	 WebDriver driver;

	
	 Select select;
	 public Wrapper_Function(WebDriver driver){
		 this.driver=driver;
	 }
	
	
       public  void setImplicitwait(int intSecond){
		
    	   driver.manage().timeouts().implicitlyWait(intSecond, TimeUnit.SECONDS);
	   }
     

       
       public void selectValueFromdropdown(WebElement element, String value) {
      	  try{
      	   Select objDropdown = new Select(element);
      	 objDropdown.selectByVisibleText(value);
      	  }catch(Exception e)
      	  {
      		  System.out.println(e);
      	  }
         }
//   public static WebElement getWebElement(By locator) {
//  		return BaseTest.driver.findElement(locator);
//  	}
//  	 	public void selectValueFromdropdown(By locator,String strValue) {
// 		 		  			Select dropdown = new Select(getWebElement(locator));
// 		
//  		     dropdown.selectByVisibleText(strValue);
// 	  		
// 	}

}

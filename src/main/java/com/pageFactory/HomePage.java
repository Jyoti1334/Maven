package com.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomePage {
	 WebDriver driver;
	By loc_txt_homePageDashboardNameText= By.xpath("//tr[@class='heading3']");
	 
	/***
	 * Here I passesd WebDriver driver parameter so that 
	 * my mutliple methods can use this parameter
	 * @param driver
	 */
	 public HomePage(WebDriver driver){
		this.driver=driver;
		
	 }
	 
	 
	 /**
	  * Method to get text of Homepage Dashborad Name and store it into a string
	  * @return
	  */
	 public String getHomePageDashboardNameText(){

        String strDashboardName=driver.findElement(loc_txt_homePageDashboardNameText).getText();
            System.out.println("Dashboard Title is :"+strDashboardName);
        return strDashboardName;
        }

}

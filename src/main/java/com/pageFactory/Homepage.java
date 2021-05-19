package com.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	 WebDriver driver;
	 
	 public Homepage(WebDriver driver){
		 this.driver=driver;
	 }
	 
	 public String getHomePageDashboardUserName(){

        String strDashboardName=driver.findElement(By.xpath("//tr[@class='heading3']")).getText();
            System.out.println("Dashboard Title is :"+strDashboardName);
        return strDashboardName;
        }

}

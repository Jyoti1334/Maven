package com.facebookSignup;


import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest{
  static  WebDriver driver=null;
  public Properties objConfig;
	 
	 public  void initializeWebBrowser() {
			
	   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/chromedriver.exe");
	   driver=new ChromeDriver();
	   System.out.println("getUrl from config file : "+objConfig.getProperty("AUT_URL"));
		driver.get(objConfig.getProperty("AUT_URL"));
	
	   driver.manage().window().maximize();
			
	    }
		public void loadConfigProperties(){
			try{
				objConfig=new Properties();
				objConfig.load(new FileInputStream(System.getProperty("user.dir")+"/src/config/config.properties"));
			}catch(Exception exception){
				System.out.println("I got property file load exception"+exception.getMessage());
				exception.printStackTrace();
			}
		}

      public  void tearDown(){
		
		driver.close();
	  }

}






package com.pageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	public static  WebDriver driver=null;
	public  void initializeWebBrowser() {
		
		   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("http://demo.guru99.com/V4/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Browser Initialized");	
		    }
	
	public void tearDown(){
		driver.close();
	}

}

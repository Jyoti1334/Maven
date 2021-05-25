package com.scripts.screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScreenShot {
	static WebDriver driver;
	 
	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		takeScreenshot("Facebook_LoginPage");

	}
   
	
	public static void takeScreenshot(String strfileName) throws IOException{
		// step 1. take screenshot and store
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"/src/test/java/com/scripts/screenShot"+strfileName+".jpg"));
		
	}
}

package com.scripts;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


import com.pageFactory.Homepage;
import com.pageFactory.Loginpage;

public class TestScript  {
	 WebDriver driver;
	 @BeforeTest
	 public  void initializeWebBrowser() {
			
		   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("http://demo.guru99.com/V4/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Browser Initialized");	
		    }
	
	@Test(priority=1)
	public void TCID_001_verifyLoginPage(){
		Loginpage objLoginpage=new Loginpage(driver);
		 String loginPageTitle = objLoginpage.getLoginTitle();

		 Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

		objLoginpage.loginToGuru99("mngr327539","vAqejaq");
	}
	@Test(priority=2)
	public void TCID_003_verifyHomepage(){
		Homepage objHomepage=new Homepage(driver);
		objHomepage.getHomePageDashboardUserName();
	}
	
	@AfterTest
	public void TCID_004_verifyTearDown(){
		driver.close();
	}

}

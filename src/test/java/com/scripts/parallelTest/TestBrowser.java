package com.scripts.parallelTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestBrowser extends BaseTest{
	@Parameters({"browserName"})
	@Test
	public void doParallelTest(String browser) throws InterruptedException{
		
		System.out.println("Browser name: "+browser);
		Thread.sleep(2000);
		driver=getDriver(browser);
		driver.get("https://www.google.com/");
		driver.quit();
	}

}

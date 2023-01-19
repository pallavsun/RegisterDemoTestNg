package com.telus.crossbrowsertesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class MultiBrowser {

	public WebDriver driver;

	@Parameters({"browser","url"})
	@BeforeClass
	public void launchApplication(String browser,String url) {

		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{

			System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}


		//Maximize  the browser 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		// ========Launch the URL============
		driver.get(url);
		Reporter.log("Welcome to NXTGen AI Academy home page");

		Reporter.log("Application is launched");
	}


  @Test
  public void sampleTest() {
	  
	  System.out.println("Passed");
  }

	@AfterClass
	public void closeApplication() {

		driver.quit();
		Reporter.log("Application is closed");
	}







}

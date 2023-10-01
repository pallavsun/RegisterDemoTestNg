package com.telus.registration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



/*=============================================================================
| Author :  Pallav Kumar
| Project:  Registration  Demo  Page Using TestNG
| Purpose:  Checking Registration Form Page 
| Date   :  07/11/2022
 *===========================================================================*/





public class RegisterDemoTestNG {

	public WebDriver driver;


	// Store the Url in a variable
	String url = "https://nxtgenaiacademy.com/";

	//Input Variables
	String firstNameValue = "Pallav";
	String lastNameValue = "Kumar";
	String streetAddressValue="Nirman vihar";
	String aptNumberValue = "C-103 New Ashok Nagar";
	String cityNameValue = "Noida";
	String stateNameValue = "UP";
	String countryNameValue = "Algeria";
	String postalCodeValue = "110096";
	String emailAddressValue = "pallav18kumar@gmail.com";
	String dateOfDemoValue = "06/06/2008";
	String hour="10";
	String minute="10";
	String mobileNumberValue = "7906189818";
	String enterYourQueryValue="Automation Training";


	@BeforeClass
	public void launchApplication() {

		// Set the system property for the chrome driver
		//   System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		//Creating instance of Chrome driver
		driver=new ChromeDriver();

		//Maximize  the browser 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		// ========Launch the URL============
		driver.get(url);
		Reporter.log("Welcome to NXTGen AI Academy home page");

		Reporter.log("Application is launched");
	}




	@AfterClass
	public void closeApplication() {

		driver.quit();
		Reporter.log("Application is closed");
	}


	@Test(priority = 1)
	public void navigateToRegisterDemo() {


		//=======Create an object of Action class======= 
		Actions act=new Actions(driver);


		// Webelement for QA Automation Link
		WebElement qaAutomationLink = driver.findElement(By.xpath("//span[text()='QA Automation']"));

		// Check whether the  QA Automation link is enabled or not.
		if (qaAutomationLink.isDisplayed())
		{
			act.moveToElement(qaAutomationLink).perform();
			Reporter.log("QA Automation  link is displayed On Register page");
			Reporter.log("");

		}

		else
		{
			Reporter.log("QA Automation link is not displayed");
		}



		//======= Move the cursor to  Practice Automation link==========
		// Webelement for Practice automation link
		WebElement practiceAutomation = driver.findElement(By.xpath("//span[text()='Practice Automation']"));

		// Check whether Practice Automation link is displayed or not.
		if (practiceAutomation.isDisplayed()) 
		{
			//If Practice Automation link  is displayed move the cursor on it.

			act.moveToElement(practiceAutomation).perform();
			Reporter.log("Practice Automation link is displayed");
			Reporter.log("");

		}

		else 
		{
			Reporter.log("Practice Automation link is not displayed");
		}		


		// ========= Move the cursor to Registration Form=========
		WebElement registrationLink = driver.findElement(By.partialLinkText("Registration Form"));

		// Check whether 'Demo Site-Registration Form' link is Displayed or not.

		if (registrationLink.isDisplayed())
		{
			Reporter.log("Demo Site-Registration  link is displayed");
			registrationLink.click();     // Click on Demo Registration form link
			Reporter.log("");

		}
		else 
		{
			Reporter.log("Demo Site-Registration  link is not displayed");
		}

		Reporter.log("Register demo page is displayed");

	}


	@Test(priority = 2)
	public void registerDemo() {

		// ===============First name================
		WebElement firstName = driver.findElement(By.id("vfb-5"));

		//Check whether First name input field is enabled or not.
		if (firstName.isEnabled())
		{
			Reporter.log("First name input is enabled on registration page");
			firstName.sendKeys(firstNameValue);	

			Reporter.log("First Name : "+firstNameValue);
			Reporter.log("");
		}

		else 

		{
			Reporter.log("First name input Field is not enabled on registration page");
		}



		// ================Last name ================
		WebElement lastName = driver.findElement(By.id("vfb-7"));

		//Check whether Last name input Field is enabled or not.
		if (lastName.isEnabled()) 
		{
			Reporter.log("Last name input field is enabled on registation page");
			lastName.sendKeys(lastNameValue);

			Reporter.log("Last Name is :" +lastNameValue);
			Reporter.log("");
		}
		else 
		{
			Reporter.log("Last name input field is not enabled on registration page");
		}


		// ===============Select Gender=======================

		WebElement gender = driver.findElement(By.xpath("//input[@value='Female']"));    // Select the female radio button

		//Check whether Gender radio button  is enabled or not.
		if (gender.isEnabled()) 
		{
			Reporter.log("Gender radio button is enabled");

			// click on radio button	
			gender.click();

			// Check whether the radio button is selected or not	
			if (gender.isSelected())
			{
				Reporter.log("Gender radio button is Selected");
				Reporter.log("");
			}
			else
				Reporter.log("Gender radio button is not Selected");
		}
		else 
		{
			Reporter.log("Gender radio button is not enabled");
		}	


		// =================Street address============
		WebElement streetAddress = driver.findElement(By.id("vfb-13-address"));

		//Check whether the street Address is enabled or not.
		if (streetAddress.isEnabled()) 
		{
			Reporter.log(" Street Address input field is enabled");

			// send the values to address field	
			streetAddress.sendKeys(streetAddressValue);
			Reporter.log("Street Address : "+streetAddressValue);
			Reporter.log("");
		}
		else 
		{
			Reporter.log("Address input field is not enabled");
		}



		// =============Apartment number============
		WebElement apartmentNo = driver.findElement(By.id("vfb-13-address-2"));

		//Check whether the Apartment no is enabled or not.
		if (apartmentNo.isEnabled()) 
		{
			Reporter.log("Apartment no input field is enabled");

			// send the values to address field	
			apartmentNo.sendKeys(aptNumberValue);

			Reporter.log("Apartment No : " +aptNumberValue);
			Reporter.log("");
		}
		else 
		{
			Reporter.log("Apartment no input is not enabled");
		}



		// ==================City=================

		WebElement cityName = driver.findElement(By.id("vfb-13-city"));
		//Check whether City  is enabled or not.
		if (cityName.isEnabled()) 
		{
			Reporter.log("City input field  is enabled on registration page");

			cityName.sendKeys(cityNameValue);
			Reporter.log("City is :"+cityNameValue);
			Reporter.log("");
		}

		else 
		{
			Reporter.log("City input field is not enabled  on registration page");
		}


		// ==================State=================

		WebElement stateName = driver.findElement(By.id("vfb-13-state"));
		//Check whether State  is enabled or not.
		if (stateName.isEnabled()) 
		{
			Reporter.log("State input field  is enabled  on registration page");

			stateName.sendKeys(stateNameValue);
			Reporter.log("State is :" +stateNameValue);
			Reporter.log("");
		}

		else 
		{
			Reporter.log("State input field is not enabled on registration page  ");
		}



		//=========== Postal Code============
		WebElement postalCode = driver.findElement(By.id("vfb-13-zip"));

		//Check whether the Postal Code is enabled or not.
		if (postalCode.isEnabled())
		{
			Reporter.log("Postal Code input field is enabled");

			postalCode.sendKeys(postalCodeValue);
			Reporter.log("Postal Code is  :" +postalCodeValue);
			Reporter.log("");

		}
		else 
		{
			Reporter.log("Postal Code input  field is not enabled");
		}


		//==============Country (Drop down)====================

		WebElement countryDrp = driver.findElement(By.name("vfb-13[country]"));

		//Check whether Country (drop down) is displayed or not.
		if (countryDrp.isEnabled()) 
		{
			Reporter.log("Country Name  is displayed  on registration page");

			//Selecting Algeria as Country from drop down

			Select dropDown= new Select(countryDrp);
			dropDown.selectByVisibleText(countryNameValue);
			Reporter.log("");
		}	
		else
		{
			Reporter.log("Country Name is not displayed on registration page");
		}	


		// =================Email===============
		WebElement emailAddress = driver.findElement(By.id("vfb-14"));

		//Check whether Email field is enabled or not.
		if (emailAddress.isEnabled()) 
		{
			Reporter.log("Email input field is enabled");
			emailAddress.sendKeys(emailAddressValue);
			Reporter.log("Email is : " +emailAddressValue);
			Reporter.log("");

		}

		else 
		{
			Reporter.log("Email input is not enabled");
		}

		//============ Date of Demo============
		WebElement dateOfDemo = driver.findElement(By.id("vfb-18"));

		//Check whether Date of Demo is enabled or not.
		if (dateOfDemo.isEnabled()) 
		{
			Reporter.log("Date of Demo input is enabled");

			dateOfDemo.sendKeys(dateOfDemoValue);
			Reporter.log("Date is "+dateOfDemoValue);
			Reporter.log("");
		}

		else 

		{
			Reporter.log("Date of Demo input is not enabled");
		}



		// =========Convenient Time (Hour)==========
		WebElement hourHH = driver.findElement(By.id("vfb-16-hour"));
		if (hourHH.isEnabled()) 
		{
			Reporter.log("Time Hour is enabled");

			Select dropDownHour= new Select(hourHH);
			dropDownHour.selectByValue(hour);
			Reporter.log("");

		}

		else
		{
			Reporter.log("Time Hour is  not enabled");
		}



		// =========Convenient Time (Minute)========
		WebElement minuteMM = driver.findElement(By.id("vfb-16-min"));
		if (minuteMM.isEnabled()) 
		{
			Reporter.log(" Minute is enabled");

			Select dropDownMinute= new Select(minuteMM);
			dropDownMinute.selectByValue(minute);
			Reporter.log("");

		}

		else
		{
			Reporter.log(" Minute is not enabled");
		}



		// ============Mobile Number============
		WebElement mobileNumber = driver.findElement(By.id("vfb-19"));

		//Check whether Mobile Number is enabled or not.
		if (mobileNumber.isEnabled()) 
		{
			Reporter.log("Mobile Number input field is enabled");

			mobileNumber.sendKeys(mobileNumberValue);
			Reporter.log("Mobile no : " +mobileNumberValue);
			Reporter.log("");
		}

		else
		{
			Reporter.log("Mobile Number input field  is not enabled");
		}



		// =============Check Box (Select TestNg & CoreJava)   ==============

		// =======First CheckBox===============
		WebElement checkBoxTestNg = driver.findElement(By.id("vfb-20-2"));


		//Check whether CheckBox (TestNg) is displayed or not.
		if (checkBoxTestNg.isDisplayed())
		{
			Reporter.log("CheckBox TestNg is displayed");
			checkBoxTestNg.click();

			//After clicking on check box one check whether it is selected or not 
			if (checkBoxTestNg.isSelected()) 
			{
				Reporter.log("CheckBox TestNg is Selected");
				Reporter.log("");
			}
			else {
				Reporter.log("CheckBox TestNg is not Selected");
			}

		}

		else 
		{
			Reporter.log("CheckBox TestNg is not displayed");
		}


		//============To Select Second checkbox================


		WebElement checkBoxCore = driver.findElement(By.id("vfb-20-3"));

		//Check whether CheckBox CoreJava is displayed or not.
		if (checkBoxCore.isDisplayed()) 
		{
			Reporter.log("CheckBox is Displayed");
			checkBoxCore.click();

			//After clicking on check box Two check whether it is selected or not
			if (checkBoxCore.isSelected()) 
			{
				Reporter.log("CheckBox is Selected");
				Reporter.log("");
			}

			else 
			{
				Reporter.log("CheckBox is not Selected");
			}

		}

		else 
		{
			Reporter.log("CheckBox is not Displayed");
		}




		//=================Enter your query===============	

		WebElement enterQuery = driver.findElement(By.id("vfb-23"));
		//Check whether Query box  is enabled or not.
		if (enterQuery.isEnabled()) 
		{
			Reporter.log("Query input field  is enabled");

			enterQuery.sendKeys(enterYourQueryValue);
			Reporter.log("Query is : " +enterYourQueryValue);
			Reporter.log("");

		}

		else 
		{
			Reporter.log("Query input field is not enabled");
		}



		//======================Verification of two digits=============================	

		String verification = driver.findElement(By.xpath("//*[text()='Example: 99']")).getText();

		String verify=verification.substring(9);
		Reporter.log("Two digit no is  :" +verify);

		WebElement verifyValue=driver.findElement(By.id("vfb-3"));

		//Send values to Verification input field
		verifyValue.sendKeys(verify);
		Reporter.log("");


		//=========Click on Submit button =================
		WebElement submitButton = driver.findElement(By.name("vfb-submit"));

		//Check whether Submit button is enabled or not.
		if (submitButton.isEnabled()) 
		{
			Reporter.log("Submit button is enabled on Registraion page");

			// Click on submit button

			submitButton.click();
			Reporter.log("Submit button clicked Successfully");
		}
		else 
		{
			Reporter.log("Submit button is not enabled  on Registration page");
		}



		Reporter.log("Registered Successfully");
	}

	@Test(priority = 3)
	public void validateSuccessfullMsg() {

		//Check after submitting the form message is displayed or not

		WebElement transactionId= driver.findElement(By.xpath("//*[contains(text(),'Transaction ID')]"));

		if(transactionId.isDisplayed())
		{

			String actualMsg= transactionId.getText();
			String expectedMsg="Registration Form is Successfully Submitted";

			if (actualMsg.contains(expectedMsg)) 
			{
				Reporter.log("Actual and Expected Text Message are same  ");
				Reporter.log("Actual Text Message is :"+actualMsg);


			}
			else 
			{
				Reporter.log("Actual and Expected Text Message are not same ");
				Reporter.log("Actual Text Message is :"+actualMsg);
				Reporter.log("Expected text Message is : "+expectedMsg);

			}

		}

		else
		{
			Reporter.log("Successfull message is not displayed after submitting form");	
		}


	}




}

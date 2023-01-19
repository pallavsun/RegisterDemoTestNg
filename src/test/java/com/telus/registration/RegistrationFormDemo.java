package com.telus.registration;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



/*=============================================================================
| Author :  Pallav Kumar
| Project:  Registration  Demo 
| Purpose:  Checking Registration Form Page 
| Date   :  18/10/2022
 *===========================================================================*/


public class RegistrationFormDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		// Set the system property for the chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");


		//Creating instance of Chrome driver
		WebDriver driver=new ChromeDriver();


		//Maximize  the browser 
		driver.manage().window().maximize();

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


		// ========Launch the URL============
		driver.get(url);


		//=======Create an object of Action class======= 
		Actions act=new Actions(driver);


		// Webelement for QA Automation Link
		WebElement qaAutomationLink = driver.findElement(By.xpath("//span[text()='QA Automation']"));

		// Check whether the  QA Automation link is enabled or not.
		if (qaAutomationLink.isDisplayed())
		{
			act.moveToElement(qaAutomationLink).perform();
			System.out.println("QA Automation  link is displayed On Register page");

		}

		else
		{
			System.out.println("QA Automation link is not displayed");
		}



		//======= Move the cursor to  Practice Automation link==========
		// Webelement for Practice automation link
		WebElement practiceAutomation = driver.findElement(By.xpath("//span[text()='Practice Automation']"));

		// Check whether Practice Automation link is displayed or not.
		if (practiceAutomation.isDisplayed()) 
		{
			//If Practice Automation link  is displayed move the cursor on it.

			act.moveToElement(practiceAutomation).perform();
			System.out.println("Practice Automation link is displayed");
 
		}

		else 
		{
			System.out.println("Practice Automation link is not displayed");
		}		




		// ========= Move the cursor to Registration Form=========
		WebElement registrationLink = driver.findElement(By.partialLinkText("Registration Form"));

		// Check whether 'Demo Site-Registration Form' link is Displayed or not.

		if (registrationLink.isDisplayed())
		{
			System.out.println("Demo Site-Registration  link is displayed");
            registrationLink.click();     // Click on Demo Registration form link


		}
		else 
		{
			System.out.println("Demo Site-Registration  link is not displayed");
		}



		// ===============First name================
		WebElement firstName = driver.findElement(By.id("vfb-5"));

		//Check whether First name input field is enabled or not.
		if (firstName.isEnabled())
		{
			System.out.println("First name input is enabled on registration page");
			firstName.sendKeys(firstNameValue);	

			System.out.println("First Name : "+firstNameValue);
		}

		else 

		{
			System.out.println("First name input Field is not enabled on registration page");
		}



		// ================Last name ================
		WebElement lastName = driver.findElement(By.id("vfb-7"));

		//Check whether Last name input Field is enabled or not.
		if (lastName.isEnabled()) 
		{
			System.out.println("Last name input field is enabled on registation page");
			lastName.sendKeys(lastNameValue);

			System.out.println("Last Name is :" +lastNameValue);

		}
		else 
		{
			System.out.println("Last name input field is not enabled on registration page");
		}


		// ===============Select Gender=======================

		WebElement gender = driver.findElement(By.xpath("//input[@value='Female']"));    // Select the female radio button

		//Check whether Gender radio button  is enabled or not.
		if (gender.isEnabled()) 
		{
			System.out.println("Gender radio button is enabled");

			// click on radio button	
			gender.click();

			// Check whether the radio button is selected or not	
			if (gender.isSelected())
				System.out.println("Gender radio button is Selected");
			else
				System.out.println("Gender radio button is not Selected");
		}
		else 
		{
			System.out.println("Gender radio button is not enabled");
		}	


		// =================Street address============
		WebElement streetAddress = driver.findElement(By.id("vfb-13-address"));

		//Check whether the street Address is enabled or not.
		if (streetAddress.isEnabled()) 
		{
			System.out.println(" Street Address input field is enabled");

			// send the values to address field	
			streetAddress.sendKeys(streetAddressValue);
			System.out.println("Street Address : "+streetAddressValue);

		}
		else 
		{
			System.out.println("Address input field is not enabled");
		}



		// =============Apartment number============
		WebElement apartmentNo = driver.findElement(By.id("vfb-13-address-2"));

		//Check whether the Apartment no is enabled or not.
		if (apartmentNo.isEnabled()) 
		{
			System.out.println("Apartment no input field is enabled");

			// send the values to address field	
			apartmentNo.sendKeys(aptNumberValue);

			System.out.println("Apartment No : " +aptNumberValue);

		}
		else 
		{
			System.out.println("Apartment no input is not enabled");
		}



		// ==================City=================

		WebElement cityName = driver.findElement(By.id("vfb-13-city"));
		//Check whether City  is enabled or not.
		if (cityName.isEnabled()) 
		{
			System.out.println("City input field  is enabled on registration page");

			cityName.sendKeys(cityNameValue);
			System.out.println("City is :"+cityNameValue);

		}

		else 
		{
			System.out.println("City input field is not enabled  on registration page");
		}


		// ==================State=================

		WebElement stateName = driver.findElement(By.id("vfb-13-state"));
		//Check whether State  is enabled or not.
		if (stateName.isEnabled()) 
		{
			System.out.println("State input field  is enabled  on registration page");

			stateName.sendKeys(stateNameValue);
			System.out.println("State is :" +stateNameValue);

		}

		else 
		{
			System.out.println("State input field is not enabled on registration page  ");
		}



		//=========== Postal Code============
		WebElement postalCode = driver.findElement(By.id("vfb-13-zip"));

		//Check whether the Postal Code is enabled or not.
		if (postalCode.isEnabled())
		{
			System.out.println("Postal Code input field is enabled");

			postalCode.sendKeys(postalCodeValue);
			System.out.println("Postal Code is  :" +postalCodeValue);


		}
		else 
		{
			System.out.println("Postal Code input  field is not enabled");
		}


		//==============Country (Drop down)====================

		WebElement countryDrp = driver.findElement(By.name("vfb-13[country]"));

		//Check whether Country (drop down) is displayed or not.
		if (countryDrp.isEnabled()) 
		{
			System.out.println("Country Name  is displayed  on registration page");

			//Selecting Algeria as Country from drop down

			Select dropDown= new Select(countryDrp);
			dropDown.selectByVisibleText(countryNameValue);

		}	
		else
		{
			System.out.println("Country Name is not displayed on registration page");
		}	


		// =================Email===============
		WebElement emailAddress = driver.findElement(By.id("vfb-14"));

		//Check whether Email field is enabled or not.
		if (emailAddress.isEnabled()) 
		{
			System.out.println("Email input field is enabled");
			emailAddress.sendKeys(emailAddressValue);
			System.out.println("Email is : " +emailAddressValue);


		}

		else 
		{
			System.out.println("Email input is not enabled");
		}

		//============ Date of Demo============
		WebElement dateOfDemo = driver.findElement(By.id("vfb-18"));

		//Check whether Date of Demo is enabled or not.
		if (dateOfDemo.isEnabled()) 
		{
			System.out.println("Date of Demo input is enabled");

			dateOfDemo.sendKeys(dateOfDemoValue);
			System.out.println("Date is "+dateOfDemoValue);
		}

		else 

		{
			System.out.println("Date of Demo input is not enabled");
		}



		// =========Convenient Time (Hour)==========
		WebElement hourHH = driver.findElement(By.id("vfb-16-hour"));
		if (hourHH.isEnabled()) 
		{
			System.out.println("Time Hour is enabled");

			Select dropDownHour= new Select(hourHH);
			dropDownHour.selectByValue(hour);

		}

		else
		{
			System.out.println("Time Hour is  not enabled");
		}



		// =========Convenient Time (Minute)========
		WebElement minuteMM = driver.findElement(By.id("vfb-16-min"));
		if (minuteMM.isEnabled()) 
		{
			System.out.println(" Minute is enabled");

			Select dropDownMinute= new Select(minuteMM);
			dropDownMinute.selectByValue(minute);

		}

		else
		{
			System.out.println(" Minute is not enabled");
		}



		// ============Mobile Number============
		WebElement mobileNumber = driver.findElement(By.id("vfb-19"));

		//Check whether Mobile Number is enabled or not.
		if (mobileNumber.isEnabled()) 
		{
			System.out.println("Mobile Number input field is enabled");

			mobileNumber.sendKeys(mobileNumberValue);
			System.out.println("Mobile no : " +mobileNumberValue);
		}

		else
		{
			System.out.println("Mobile Number input field  is not enabled");
		}



		// =============Check Box (Select TestNg & CoreJava)   ==============

		// =======First CheckBox===============
		WebElement checkBoxTestNg = driver.findElement(By.id("vfb-20-2"));


		//Check whether CheckBox (TestNg) is displayed or not.
		if (checkBoxTestNg.isDisplayed())
		{
			System.out.println("CheckBox TestNg is displayed");
			checkBoxTestNg.click();

			//After clicking on check box one check whether it is selected or not 
			if (checkBoxTestNg.isSelected()) 
			{
				System.out.println("CheckBox TestNg is Selected");
			}
			else {
				System.out.println("CheckBox TestNg is not Selected");
			}

		}

		else 
		{
			System.out.println("CheckBox TestNg is not displayed");
		}


		//============To Select Second checkbox================


		WebElement checkBoxCore = driver.findElement(By.id("vfb-20-3"));

		//Check whether CheckBox CoreJava is displayed or not.
		if (checkBoxCore.isDisplayed()) 
		{
			System.out.println("CheckBox is Displayed");
			checkBoxCore.click();

			//After clicking on check box Two check whether it is selected or not
			if (checkBoxCore.isSelected()) 
			{
				System.out.println("CheckBox is Selected");
			}

			else 
			{
				System.out.println("CheckBox is not Selected");
			}

		}

		else 
		{
			System.out.println("CheckBox is not Displayed");
		}




		//=================Enter your query===============	

		WebElement enterQuery = driver.findElement(By.id("vfb-23"));
		//Check whether Query box  is enabled or not.
		if (enterQuery.isEnabled()) 
		{
			System.out.println("Query input field  is enabled");

			enterQuery.sendKeys(enterYourQueryValue);
			System.out.println("Query is : " +enterYourQueryValue);

		}

		else 
		{
			System.out.println("Query input field is not enabled");
		}



		//======================Verification of two digits=============================	

		String verification = driver.findElement(By.xpath("//*[text()='Example: 99']")).getText();

		String verify=verification.substring(9);
		System.out.println(verify);

		WebElement verifyValue=driver.findElement(By.id("vfb-3"));

		//Send values to Verification input field
		verifyValue.sendKeys(verify);


		//=========Click on Submit button =================
		WebElement submitButton = driver.findElement(By.name("vfb-submit"));

		//Check whether Submit button is enabled or not.
		if (submitButton.isEnabled()) 
		{
			System.out.println("Submit button is enabled on Registraion page");

			// Click on submit button

			submitButton.click();
		}
		else 
		{
			System.out.println("Submit button is not enabled  on Registration page");
		}



		//Check after submitting the form msg is displayed or not

		WebElement transactionId= driver.findElement(By.xpath("//*[contains(text(),'Transaction ID')]"));

		if(transactionId.isDisplayed())
		{
			System.out.println("Successfull message is displayed after submitting form");


			String actualMsg= transactionId.getText();
			String expectedMsg="Registration Form is Successfully Submitted.The Transaction ID: NXT";

			if (actualMsg.contains(expectedMsg)) 
			{
				System.out.println("Successfully Registered msg is displayed");
				System.out.println("Actual Text Message is :"+actualMsg);


			}
			else 
			{
				System.out.println("Not Registered msg is displayed");
				System.out.println("Actual Text Message is :"+actualMsg);

			}

		}

		else
		{
			System.out.println("Successfull message is not displayed after submitting form");	
		}




		// Close the browser
		driver.close();


	}

}

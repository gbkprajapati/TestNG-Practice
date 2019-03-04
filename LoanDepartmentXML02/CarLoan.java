package LoanDepartmentXML02;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CarLoan {
	@Test(groups= {"Smoke"}) // Group Annotation xml
	public void WebLoginCarLoan() {
		// Selenium
		System.out.println("Web Login Car");
	}

	@Test
	public void MobileLoginHomeLoan() {
		// Appium
		System.out.println("Mobile Login Car");
	}

	@Test
	public void ApiLoginHomeLoan() {
		// Rest Api login
		System.out.println("Api Login Car");
	}

	// --------------------------------------------

	// Test folder testing particular test
	@BeforeTest
	public void BeforeTest() {
		System.out.println("====== Before Test Annotation ====== ");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("======After Test Annotation=======");
	}

	// --------------------------------------------

	// Suite level that contain all level test
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("-------Before  Suite Level Annotation---");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("-------After  Suite Level Annotation------");
	}

	// --------------------------------------------
	// class level that only execute every method before class.
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("-------Before  Each method it will exceuted which Class Specific---");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("-------After  Each method it will exceuted which Class Specific---");
	}
	
	// --------------------------------------------
		// class level that only execute every method before class.
		
		@org.testng.annotations.BeforeClass
		public void BeforeClass() {
			System.out.println("-------Before  that specific class same as Beforemethod it will exceuted which Class Specific---");
		}

		@org.testng.annotations.AfterClass
		public void AfterClass() {
			System.out.println("-------After  that specific class same as After method which Class Specific---");
		}
}

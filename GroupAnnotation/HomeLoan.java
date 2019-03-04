package LoanDepartmentXML02;

import org.testng.annotations.Test;

public class HomeLoan {

	@Test(groups= {"Smoke"})	
	public void WebLoginHomeLoan() {
		//Selenium
		System.out.println("Web Login Home");
	}
	
	@Test	
	public void MobileLoginHomeLoan() {
		//Selenium
		System.out.println("Mobile Login Home");
	}
	
	@Test	
	public void ApiLoginHomeLoan() {
		//Rest Api login
		System.out.println("Api Login Home");
	}
	
	
	
}

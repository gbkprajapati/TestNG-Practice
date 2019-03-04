package LoanDepartmentXML02;

import org.testng.annotations.Test;

public class HomeLoan {

	@Test(groups= {"Smoke"}) //Group Annotation xml	
	public void WebLoginHomeLoan() {
		//Selenium
		System.out.println("Web Login Home");
	}
	
	@Test(enabled=false, timeOut=4000)  // Testng helper attribute	
	public void MobileLoginHomeLoan() {
		//Selenium
		System.out.println("Mobile Login Home");
	}
	
	@Test(dependsOnMethods="WebLoginHomeLoan")	 // Helper attribute file
	public void ApiLoginHomeLoan() {
		//Rest Api login
		System.out.println("Api Login Home");
	}
	
	
	
}

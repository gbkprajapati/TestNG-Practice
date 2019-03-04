package LoanDepartmentXML02;

import org.testng.annotations.Test;

public class PersonalLoan {
    
	//Improtant of xml file to run multiple test case  

	// Right click on xml  file > Run as  > TestNG Suite
	
	  
	@Test	
	public void WebLoginPersonalLoan() {
		//Selenium
		System.out.println("Web Login Personal");
	}
	
	@Test	
	public void MobileLoginPersonalLoan() {
		//Selenium
		System.out.println("Mobile Login Personal");
	}
	
	@Test	
	public void ApiLoginPersonalLoan() {
		//Rest Api login
		System.out.println("Api Login Personal");
	}
}

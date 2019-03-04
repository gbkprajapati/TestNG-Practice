package LoanDepartmentXML02;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PersonalLoan {

	// Improtant of xml file to run multiple test case

	// Right click on xml file > Run as > TestNG Suite

	@Parameters({ "URL", "urlPersonal", "username" }) // Parametersing xml file
	@Test(groups = { "Smoke" }) // Group Annotation xml file
	public void WebLoginPersonalLoan(String url, String urlpersonal, String username) {
		// Selenium
		System.out.println("Web Login Personal");

		System.out.println("Using Parameter Annotation url  (Suite level): " + url);
		System.out.println("Using Parameter Annotation url (Class Level): " + urlpersonal);
		System.out.println("Using Parameter Annotation Username (Class Level): " + username);
	}

	@Test
	public void MobileLoginPersonalLoan() {
		// Selenium
		System.out.println("Mobile Login Personal");
	}

	@Test(dataProvider = "getData")
	public void ApiLoginPersonalLoan(String username, String password) {
		// Rest Api login
		System.out.println("Api Login Personal");
		System.out.println("Api Login using data provider Annotation Username :" + username);
		System.out.println("Api Login using data provider Annotation Password :" + password);
	}

	// If we have mulitple datasert 20 or more we can use dataprovider

	@DataProvider
	public Object[][] getData() {

		// For example data set
		// 1st is username and password with good history.
		// 2st is username and password with NO history.
		// 3st is username and password with Frud One.

		Object[][] data = new Object[3][2];

		// 1st set
		data[0][0] = "FirstUsername";
		data[0][1] = "FirstPassword";

		// 2st set
		data[1][0] = "SecondUsername";
		data[1][1] = "SecondPassword";

		// 3st set
		data[2][0] = "ThirdUsername";
		data[2][1] = "ThirdPassword";

		return data;

	}

}

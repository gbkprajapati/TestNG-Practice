package datadrivenjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DataDrivenExample {
	public WebDriver driver =null;
	
	@Test
	public void Login() throws IOException {
       
		// To Interpreter file we use Properties object
		Properties prop = new Properties();

		// To find file location
		FileInputStream fis = new FileInputStream(
				"D:\\Gaurav\\Software testing\\Udemy\\Udemy Rahul Shetty\\eclipse-workspace\\TestNG\\src\\datadrivenjava\\datadriven.properties");

		// to read data from file
		prop.load(fis);

		System.out.println("Usernme : " + prop.getProperty("username"));
		System.out.println("Password : " + prop.getProperty("password"));
		
	    //Client want run test case specific on chrome or firefox
		
		if (prop.getProperty("broswer").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\work\\chromedriver.exe");
	        driver =  new ChromeDriver();
	        driver.get(prop.getProperty("url"));
			System.out.println("Page Title :" + driver.getTitle());
		} else if(prop.getProperty("broswer").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Gaurav\\work\\geckodriver.exe");
			 driver = new FirefoxDriver();
			 driver.get(prop.getProperty("url"));
			 System.out.println("Page Title :" + driver.getTitle());
		}
		
		
		
		
	}

}

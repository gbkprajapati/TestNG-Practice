package Introduction1;

import java.io.IOException;

import org.testng.annotations.Test;

import datadrivenjava.DataDrivenExample;

import org.testng.annotations.Test;

public class basic extends DataDrivenExample {

	// Annotation to run Test case with out main method
	@Test    
	public void Demo() throws IOException {
		
		Login();
		//System.out.println("Intro To Testng "+username);
	}

}

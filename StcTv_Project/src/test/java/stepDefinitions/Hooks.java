package stepDefinitions;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.Helper;


public class Hooks {
	
	@Before
    public static void setUp() {
     
    // Helper.setUpDriver();
    }
	
	@After
    public static void tearDown(Scenario scenario) { 
       
        Helper.tearDown();
    }
}

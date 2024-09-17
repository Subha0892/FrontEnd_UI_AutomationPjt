package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.subscriptionPage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;


public class subscriptionSteps {
	
	public static WebDriver driver;
	public subscriptionPage subscriptionPage= new subscriptionPage(driver);
	
	@Given("User is on Subscribe Page")
	  public void user_on_subscriber_page() {

		
		final int TIMEOUT = 30;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
		driver.get("https://subscribe.stctv.com/sa-en");

		subscriptionPage.verifySubscriptionPgTitle();
	  }

	@When("^User selects the \"([^\"]*)\" location at the right top of the page$")
	  public void user_selects_Location(String arg1) {
		subscriptionPage.compareCountryName(arg1);
	}

	@Then("^User should be able to see \"([^\"]*)\" having \"([^\"]*)\" per month$")
	  public void validate_type_and_price(String arg1, String arg2) {
		
		String currencyActualValue = subscriptionPage.validatePriceForEachType(arg1, arg2);
		assertThat(currencyActualValue,containsString(arg2));
	}


}


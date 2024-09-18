package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class subscriptionPage {

	@FindBy(xpath="//*[@id='main']/div/h2")
	@CacheLookup
	  WebElement subscriptionPageHeader;

	@FindBy(xpath ="//*[@id='country-name']")
	public
	  WebElement currentCountryName;

	@FindBy(xpath ="//*[@id='country-selct']")
	 WebElement selectCountryPopup;
	
	@FindBy(xpath ="//*[@id='bh-contry-lable']")
	  WebElement bahrainCountry;

	@FindBy(xpath ="//*[@id='kw-contry-lable']")
	  WebElement kuwaitCountry;

	@FindBy(xpath ="//*[@id='name-lite']")
	  WebElement planLite;

	@FindBy(xpath ="//*[@id='name-classic']")
	  WebElement planClassic;

	@FindBy(xpath ="//*[@id='name-premium']")
	  WebElement planPremium;

	@FindBy(xpath ="//div[@id='currency-lite']")
	  WebElement currencyLite;

	@FindBy(xpath ="//div[@id='currency-classic']")
	  WebElement currencyClassic;

	@FindBy(xpath ="//div[@id='currency-premium']")
	  WebElement currencyPremium;

	private String currentCountry;

	public subscriptionPage(WebDriver driver)
	{
       PageFactory.initElements( driver, this);
    }
	

	public void verifySubscriptionPgTitle() {
		subscriptionPageHeader.isDisplayed();
	  }

	public void compareCountryName(String countryName) {

		 currentCountry = currentCountryName.getText();
		if(!currentCountry.equals(countryName)) {
			changeCountry(countryName);
		}
	}

	public void changeCountry(String countryName) {

		currentCountryName.click();
		selectCountryPopup.isDisplayed();
		if(countryName.equals("Bahrain")) {	
			bahrainCountry.click();
		} else if(countryName.equals("Kuwait")){
			kuwaitCountry.click();
		}
	}
	
	public String getCurrentCountry() {
		return currentCountry = currentCountryName.getText();
	}

	public String validatePriceForEachType(String PlanType, String Cost) {

		String currencyValue = null;
		if (PlanType.equalsIgnoreCase(planLite.getText())) {
			currencyValue = currencyLite.getText();
		}else if (PlanType.equalsIgnoreCase(planClassic.getText())){
			currencyValue = currencyClassic.getText();
		}else if (PlanType.equalsIgnoreCase(planPremium.getText())) {
			currencyValue =  currencyPremium.getText();
		}
		return currencyValue;
	}



}

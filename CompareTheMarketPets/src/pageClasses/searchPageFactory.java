package pageClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchPageFactory {
WebDriver driver;
	
	//@FindBy(id="header-history")
	//WebElement headerHistory;
	
	@FindBy(id="tab-flight-tab-hp")
	WebElement fligthsTab;
	
	@FindBy(id="flight-origin-hp-flight")
	WebElement originCity;
	
	@FindBy(id="flight-destination-hp-flight")
	WebElement destinationCity;
	
	@FindBy(id="flight-departing-hp-flight")
	WebElement departureDate;
	
	@FindBy(id="flight-returning-hp-flight")
	WebElement returnDate;
	
	public searchPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickFlightsTab() {
	//	headerHistory.click();
		fligthsTab.click();
	}
	
	public void setOriginCity(String origin) {
		originCity.sendKeys(origin);
	}
	
	public void setDestinationCity(String destination) {
		destinationCity.sendKeys(destination);
	}
	
	public void setReturnDate(String returningDate) {
		returnDate.sendKeys(returningDate);
	}

	public void setDepartureDate(String departingDate) {
		departureDate.sendKeys(departingDate);
		
	}

	
	
}

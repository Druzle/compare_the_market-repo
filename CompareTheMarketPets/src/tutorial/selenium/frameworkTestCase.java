package tutorial.selenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import pageClasses.searchPageFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frameworkTestCase {
	private WebDriver driver;
	private String baseUrl;
	searchPageFactory searchPage;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";
		
		searchPage = new searchPageFactory(driver);

		// Maximise the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		searchPage.clickFlightsTab();
		searchPage.setOriginCity("New York");
		searchPage.setDestinationCity("San Francisco");
		searchPage.setReturnDate("03/22/2020");
		searchPage.setDepartureDate("03/15/2020");
		
	}

}

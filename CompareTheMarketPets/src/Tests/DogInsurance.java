package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import page_object.landing_Page;
import page_object.DogPage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DogInsurance {
	private WebDriver driver;
	 private String baseUrl;
	 landing_Page selectPage;
	 DogPage DogInsurance;
	 
	@BeforeTest
	public void beforeTest() {
		  driver = new ChromeDriver();
			 baseUrl="https://www.comparethemarket.com/";
			 
			 DogInsurance = new DogPage(driver);
			 selectPage = new landing_Page(driver);
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 driver.get(baseUrl);
			 selectPage.clickHomeAndPet();
			  selectPage.clickDogInsurance();
			  selectPage.clickStartAQuote();
			  DogInsurance.clickDog();
	  }
  
	@Test
	public void test() {
		 
		  DogInsurance.insertPetName("Ben");
		  DogInsurance.clickFemale();
		  //DogInsurance.clickMale();
		  DogInsurance.clickDogAgeYear("10");
		  DogInsurance.clickDogAgeMonth("10");
		  DogInsurance.clickCrossbreedNo();
		  //DogInsurance.clickCrossbreedYes();
		  DogInsurance.insertDogBreed("Yorkshire Terrier");
		  DogInsurance.clickChippedYes();
		  //DogInsurance.clickChippedNo();
		  DogInsurance.insertHowMuchPayed("50");
		  //DogInsurance.clickDidNotPay();
		  //DogInsurance.clickNuteredYes();
		  DogInsurance.clickNuteredNo();
		  //DogInsurance.clickPreExistingConditionYes();
		  DogInsurance.clickPreExistingConditionNo();
		  DogInsurance.clickAccidentOnly();
		  DogInsurance.clickAccidentOnly1000Cover();
		  //DogInsurance.clickAccidentOnly2000Cover();
		  //DogInsurance.clickAccidentsAndIllness();
		  //DogInsurance.clickUpto12Months();
		  //DogInsurance.clickUpto12Months1000Cover();
		  //DogInsurance.clickUpto12Months2000Cover();
		  //DogInsurance.clickUptoVetFeeLimit();
		  //DogInsurance.selectUptoVetFeeLimitAmountOfCover("1000");
		  //DogInsurance.clickLifeTime();
		  //DogInsurance.selectLifetimeAmountOfCover("1000");
		  DogInsurance.clickCalendarDay();
		  //DogInsurance.clickPaymentAnnual();
		  DogInsurance.clickPaymentMonthly();
		  DogInsurance.clickButtonNext();
		  DogInsurance.clickTitleMr();
		  DogInsurance.insertFirstName("Ben");
		  DogInsurance.insertLastNameName("Emporium");
		  DogInsurance.selectDobDay("1");
		  DogInsurance.selectDobMonth("January");
		  DogInsurance.selectDobYear("1979");
		  DogInsurance.insertAddressNameNumber("1");
		  DogInsurance.insertPostCode("yo26 9ss");
		  DogInsurance.clickFindAddress();
		  //DogInsurance.clickChangeAddress();
		  //DogInsurance.clickEnterAddressManualy();
		  //DogInsurance.insertManualAddressLine1("1 Thorpe Green Lane");
		  //DogInsurance.insertManualAddressLine2("Thorpe Underwood");
		  //DogInsurance.insertManualAddressTownCity("York");
		  //DogInsurance.insertManualAddressPostcode("YO26 9SS");
		  //DogInsurance.clickBackToPostcodeSearch();
		  //DogInsurance.insertEmailAddress("test@emporium.co.uk");
		  //DogInsurance.clickContactViaEmail();
		  //DogInsurance.clickContactViaPhone();
		  //DogInsurance.clickContactViaText();
		  //DogInsurance.clickContactViaPost();
		  DogInsurance.clickContactViaNoContact();
		  //DogInsurance.clickContactViaPrivacyPolicy();
		  //DogInsurance.clickYourDataPrivacyAndCookiePolicy();
		  //DogInsurance.clickYourDataPrivacyPolicy();
		  //DogInsurance.clickAboutUs();
		  //DogInsurance.clickTermsAndConditions();
		  //DogInsurance.clickRewardsTermsAndConditions();
		  //DogInsurance.clickContactUs();
		  DogInsurance.clickIAgree();
		  //DogInsurance.clickBack();
		  DogInsurance.clickGetQuotes();
		  
		  
		  
	  }
  
	 @AfterTest
	 public void afterTest() {
	  }
 

}

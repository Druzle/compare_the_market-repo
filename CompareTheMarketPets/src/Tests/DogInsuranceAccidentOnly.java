package Tests;

import static org.testng.Assert.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Helpers.ExcelHelper;
import page_object.AgrigatedPage;
import page_object.DogPage;
import page_object.landing_Page;


public class DogInsuranceAccidentOnly {
	public WebDriver driver;
	 private String baseUrl;
	 landing_Page selectPage;
	 DogPage DogInsurance;
	 AgrigatedPage Agrigated;
	 String File_Path="E://eclipse//git_repository//compare_the_market-repo//CompareTheMarketPets//";
	 String File_Name="AccidentOnly.xlsx";
	 
	 @BeforeClass(alwaysRun=true) 
	 public void setup() throws Exception{
		 //ExcelHelper.setExcelFile(File_Name,"AgregatedData");
		 ExcelHelper.setExcelFile(File_Path+File_Name,"AgregatedData");
		 
	 }
	 
	 @BeforeMethod(alwaysRun=true)
	  public void beforeTest() {
		 
		 driver = new ChromeDriver();
		 baseUrl="https://www.comparethemarket.com/";
		 System.out.println("BeforeTest");
		 DogInsurance = new DogPage(driver);
		 selectPage = new landing_Page(driver);
		 Agrigated=new AgrigatedPage(driver);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get(baseUrl);
		 selectPage.clickHomeAndPet();
		  selectPage.clickDogInsurance();
		  selectPage.clickStartAQuote();

	  }
	 
	 @DataProvider(name="AgregateData")
	 public Object[][] AgregatedData(){
		 Object[][] testData=ExcelHelper.getTestData("AgregatedDataTest");
		 System.out.println(testData);
		return testData;
	 }
	 
	 @Test(testName="AgregatedList",dataProvider="AgregateData",groups= {"SmokeTest"})
		public void AgregatedList(String petName, String gender, String petAgeYear, String petAgeMonth, String crossBreed, String dogBreed, String chipped, String howMuchPaid, String nutered, String existingCondition, String policyType, String vetFees, String coverAmount, String calanderDay, String paymentPeriod, String title, String firstName, String lastName, String dobDay, String dobMonth,  String dobYear, String houseNumber, String postCode, String email, String contactBy) {

		  	DogInsurance.clickDog();
			  DogInsurance.insertPetName(petName);
			  
			  if(gender.equals("Female")) {
			  DogInsurance.clickFemale();
			  }
			  else {
				  DogInsurance.clickMale(); 
			  }
	
			  DogInsurance.clickDogAgeYear(petAgeYear);
			  DogInsurance.clickDogAgeMonth(petAgeMonth);
			  System.out.println(crossBreed + " No");
			  if(crossBreed.equals("No")) {
			  DogInsurance.clickCrossbreedNo();
			  }
			  else {
				  DogInsurance.clickCrossbreedYes();
			  }
			  
			  DogInsurance.insertDogBreed(dogBreed);
			  
			  if(chipped.equals("Y")) {
			  DogInsurance.clickChippedYes();
			  }
			  else {
				  DogInsurance.clickChippedNo();
			  }
				
			  if(howMuchPaid.equals("0")) {
			  DogInsurance.clickDidNotPay();
			  }
			  else {
				  DogInsurance.insertHowMuchPayed(howMuchPaid);
			  }
		  
			  if (nutered.equals("Y")) {
			  DogInsurance.clickNuteredYes();
			  }
			  else {
				  DogInsurance.clickNuteredNo();
			  }
		  
			  if (existingCondition.equals("N")){
			  DogInsurance.clickPreExistingConditionNo();
			  }
			  
			  if(policyType.equals("Accidents only")) {
				  DogInsurance.clickAccidentOnly();
			  		if (coverAmount.equals("1000")) {
			  			DogInsurance.clickAccidentOnly1000Cover();
			  		}
			  		else {
			  			DogInsurance.clickAccidentOnly2000Cover();
			  		}
			  }
			  
			  if(policyType.equals("Accidents and Illnesses")) {
				  DogInsurance.clickAccidentsAndIllness();
				  
				  if(vetFees.equals("upto12Months")) {
					  DogInsurance.clickUpto12Months();
					  
					  if (coverAmount.equals("1000")) {
						  DogInsurance.clickUpto12Months1000Cover();
				  		}
				  		else {
				  			DogInsurance.clickUpto12Months2000Cover();
				  		}
					  
				  }
				  
				  if(vetFees.equals("vetFeeLimit")) {
					  DogInsurance.clickUptoVetFeeLimit();
					  DogInsurance.selectUptoVetFeeLimitAmountOfCover(coverAmount);
					  
				  }
				  
				  if(vetFees.equals("lifeTime")) {
					  DogInsurance.clickLifeTime();
					  DogInsurance.selectLifetimeAmountOfCover("£1000 or more");
				  }
			  }
			  
			  DogInsurance.clickCalendarDay();
			  
			  if (paymentPeriod.equals("Monthly")) {
			  DogInsurance.clickPaymentMonthly();
			  }
			  else {
				  DogInsurance.clickPaymentMonthly();
			  }

			  DogInsurance.clickButtonNext();
			  
			  if (title.equals("Mr")) {
			  DogInsurance.clickTitleMr();
			  }
			  if(title.equals("Mrs")){
				  DogInsurance.clickTitleMrs();
			  }
			  if(title.equals("Ms")){
				  DogInsurance.clickTitleMs();
			  }
			  if(title.equals("Miss")){
				  DogInsurance.clickTitleMiss();
			  }
			  
			  DogInsurance.insertFirstName(firstName);
			  DogInsurance.insertLastNameName(lastName);
			  DogInsurance.selectDobDay(dobDay);
			  DogInsurance.selectDobMonth(dobMonth);
			  DogInsurance.selectDobYear(dobYear);
			  DogInsurance.insertAddressNameNumber(houseNumber);
			  DogInsurance.insertPostCode(postCode);
			  DogInsurance.clickFindAddress();
			  DogInsurance.insertEmailAddress(email);
			  
			  if (contactBy.equals("Email")) {
				  DogInsurance.clickContactViaEmail();
			  }
			  if (contactBy.equals("Phone")) {
				  DogInsurance.clickContactViaPhone();
			  }
			  if (contactBy.equals("Text")) {
				  DogInsurance.clickContactViaText();
			  }
			  if (contactBy.equals("Post")) {
				  DogInsurance.clickContactViaPost();
			  }
			  if (contactBy.equals("No contact")) {
				  DogInsurance.clickContactViaNoContact();
			  }
			  DogInsurance.clickIAgree();
			  DogInsurance.clickGetQuotes();
			  
			  String retrieve=Agrigated.getNameOfPet();
			  assertEquals(retrieve, petName);
			  
			  retrieve=Agrigated.getBreedOfPet();
			  assertEquals(retrieve, dogBreed);
			  
			  retrieve=Agrigated.getTypeOfAnimal();
			  assertEquals(retrieve, "Dog");
			  
			  retrieve=Agrigated.getAgeOfPet();
			  assertEquals(retrieve, petAgeYear+" years " + petAgeMonth + " months");
			  
			  retrieve=Agrigated.getCrossBreedYesNo();
			  assertEquals(retrieve, "No");
			  
			  retrieve=Agrigated.getBreed();
			  assertEquals(retrieve, dogBreed);
			  
			  Date date = new Date();
				DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
				String reportDate = dateformat.format(date);
			  retrieve=Agrigated.getCoverStartDate();
			  
			  assertEquals(retrieve, reportDate);
			  
			  retrieve=Agrigated.getCoverFor();
			  assertEquals(retrieve, policyType);
			  
			  retrieve=Agrigated.getCoverType();
			  assertEquals(retrieve, vetFees);
			  
			  retrieve=Agrigated.getVetFeeLimit();
			  assertEquals(retrieve, "£"+coverAmount+" or more");
	 }
	 
	 @DataProvider(name="PetsNameValidationData")
	 public Object[][] PetsNameValidationData(){
		 Object[][] testData=ExcelHelper.getTestData("PetsNameValidationData");
		 System.out.println(testData);
		return testData;
	 }
	 
	@Test(testName="CollectiveErrorValidation_YourPet",groups= {"ErrorValidation"})
		public void CollectiveErrorValidation_YourPet() {
		 DogInsurance.clickPetDetailsNext();
		 
		 String[] retrieve = new String[3];
		 List<String>listRetrieve=DogInsurance.getErrorCollective();
		 assertEquals(listRetrieve.size(),4);
		  retrieve=DogInsurance.getErrorPetType();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(0), retrieve[2]);
		 
		  retrieve=DogInsurance.getErrorPetName();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(1), retrieve[2]);
		  
		  retrieve=DogInsurance.getErrorGender();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(2), retrieve[2]);
		  
		  retrieve=DogInsurance.getErrorPetAge();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(3), retrieve[2]);
	 }
	 
	 @Test(testName="ErrorValidationDog",groups= {"ErrorValidation"})
		public void ErrorValidationDog() {
		 DogInsurance.clickDog();
		 DogInsurance.clickPetDetailsNext();
		 
		 String[] retrieve = new String[2];
		  List<String>listRetrieve=DogInsurance.getErrorCollective();
		  assertEquals(listRetrieve.size(),3);
		  
		 retrieve=DogInsurance.getErrorPetName();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(0), retrieve[2]);
		  
		  retrieve=DogInsurance.getErrorGender();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(1), retrieve[2]);
		  
		  retrieve=DogInsurance.getErrorPetAge();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(2), retrieve[2]);	  
	 }
	 
	 @Test(testName="ErrorValidationPetsName",groups= {"ErrorValidation"})
		public void ErrorValidationPetsName() {
		 DogInsurance.clickDog();
		 DogInsurance.insertPetName("Ben");
		 DogInsurance.clickPetDetailsNext();

		 String[] retrieve = new String[3];
		 List<String>listRetrieve=DogInsurance.getErrorCollective();
		 assertEquals(listRetrieve.size(),2);
		 
		 retrieve=DogInsurance.getErrorGender();
		 assertEquals(retrieve[0], retrieve[1]);
		 assertEquals(listRetrieve.get(0), retrieve[2].replace("your pet", "Ben"));

		 retrieve=DogInsurance.getErrorPetAge();
		 assertEquals(retrieve[0], retrieve[1]);
		 assertEquals(listRetrieve.get(1), retrieve[2].replace("your pet", "Ben"));   
	 }
	 
	 @Test(testName="ErrorValidationAgeYear",groups= {"ErrorValidation"})
		public void ErrorValidationAgeYear() {
		 DogInsurance.clickDog();
		 DogInsurance.insertPetName("Ben");
		 DogInsurance.clickDogAgeYear("4");
		 DogInsurance.clickMale();
		 DogInsurance.clickPetDetailsNext();

		 String[] retrieve = new String[3];
		 List<String>listRetrieve=DogInsurance.getErrorCollective();
		 assertEquals(listRetrieve.size(),1);
		 
		  retrieve=DogInsurance.getErrorPetAge();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(0), retrieve[2].replace("your pet", "Ben"));	  
	 }
	 
	 @Test(testName="ErrorValidationAgeMonth",groups= {"ErrorValidation"})
		public void ErrorValidationAgeMonth() {
		 DogInsurance.clickDog();
		 DogInsurance.insertPetName("Ben");
		 DogInsurance.clickDogAgeMonth("4");
		 DogInsurance.clickMale();
		 DogInsurance.clickPetDetailsNext();

		 String[] retrieve = new String[3];
		 List<String>listRetrieve=DogInsurance.getErrorCollective();
		 assertEquals(listRetrieve.size(),1);
		 
		 retrieve=DogInsurance.getErrorAgeUnderOneYear();
		 assertEquals(retrieve[0],retrieve[1]);
		 assertEquals(listRetrieve.get(0), retrieve[2].replace("your pet", "Ben"));
	 }
	 
	 @Test(testName="CollectiveValidationMoreAbout",groups= {"ErrorValidation"})
		public void CollectiveValidationMoreAbout() {
		 DogInsurance.clickDog();
		 DogInsurance.insertPetName("Ben");
		 DogInsurance.clickMale();
		 DogInsurance.clickDogAgeYear("4");
		 DogInsurance.clickDogAgeMonth("4");
		 DogInsurance.clickPreExistingConditionNo();
		 DogInsurance.clickButtonNext();
		 
		 String[] retrieve = new String[3];
		  List<String>listRetrieve=DogInsurance.getErrorCollective();
		  assertEquals(listRetrieve.size(),7);
		  
		  retrieve=DogInsurance.getErrorCrossBreed();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(0), retrieve[2].replace("your pet", "Ben"));		  
		  
		  retrieve=DogInsurance.getErrorIsPetChipped();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(1), retrieve[2].replace("your pet", "Ben"));
		  
		  retrieve=DogInsurance.getErrorHowMuchPayed();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(2), retrieve[2].replace("your pet", "Ben"));
		  
		  retrieve=DogInsurance.getErrorPetNeutered();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(3), retrieve[2].replace("your pet", "Ben"));
		  
		  retrieve=DogInsurance.getErrorAccidentOnly();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(4), retrieve[2].replace("your pet", "Ben"));
		  
		  retrieve=DogInsurance.getErrorCoverStartDate();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(5), retrieve[2]);
		  
		  retrieve=DogInsurance.getErrorPaymentFrequency();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(6), retrieve[2].replace("your pet", "Ben"));
	 }
	 
	 @Test(testName="ErrorValidationCrossBreed",groups= {"ErrorValidation"})
		public void ErrorValidationCrossBreed() {
		 DogInsurance.clickDog();
		 DogInsurance.insertPetName("Ben");
		 DogInsurance.clickMale();
		 DogInsurance.clickDogAgeYear("4");
		 DogInsurance.clickDogAgeMonth("4");
		 DogInsurance.clickPreExistingConditionNo();
		 DogInsurance.clickButtonNext();
		 DogInsurance.clickCrossbreedNo();
		 DogInsurance.clickButtonNext();

		 String[] retrieve = new String[3];
		 List<String>listRetrieve=DogInsurance.getErrorCollective();
		 assertEquals(listRetrieve.size(),7);
		 
		  retrieve=DogInsurance.getErrorIsPetChipped();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(0), retrieve[2].replace("your pet", "Ben"));
		  
		  retrieve=DogInsurance.getErrorHowMuchPayed();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(1), retrieve[2].replace("your pet", "Ben"));
		  
		  retrieve=DogInsurance.getErrorPetNeutered();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(2), retrieve[2].replace("your pet", "Ben"));
		  
		  retrieve=DogInsurance.getErrorAccidentOnly();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(3), retrieve[2].replace("your pet", "Ben"));
		  
		  retrieve=DogInsurance.getErrorCoverStartDate();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(4), retrieve[2]);
		  
		  retrieve=DogInsurance.getErrorPaymentFrequency();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(5), retrieve[2].replace("your pet", "Ben"));
		  
			 retrieve=DogInsurance.getErrorDogBreed();
			  assertEquals(retrieve[0], retrieve[1]);
			  assertEquals(listRetrieve.get(6), retrieve[2].replace("your pet", "Ben"));
	 }
	 
	 @Test(testName="ErrorValidationDogBreed",groups= {"ErrorValidation"})
		public void ErrorValidationDogBreed() {
		 DogInsurance.clickDog();
		 DogInsurance.insertPetName("Ben");
		 DogInsurance.clickMale();
		 DogInsurance.clickDogAgeYear("4");
		 DogInsurance.clickDogAgeMonth("4");
		 DogInsurance.clickPreExistingConditionNo();
		 DogInsurance.clickButtonNext();
		 DogInsurance.clickCrossbreedNo();
		 DogInsurance.insertDogBreed("Yorkshire Terrier");
		 DogInsurance.clickButtonNext();

		 String[] retrieve = new String[3];
		 List<String>listRetrieve=DogInsurance.getErrorCollective();
		 assertEquals(listRetrieve.size(),6);
		 
		  retrieve=DogInsurance.getErrorIsPetChipped();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(0), retrieve[2].replace("your pet", "Ben"));
		  
		  retrieve=DogInsurance.getErrorHowMuchPayed();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(1), retrieve[2].replace("your pet", "Ben"));

		  retrieve=DogInsurance.getErrorPetNeutered();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(2), retrieve[2].replace("your pet", "Ben"));

		  retrieve=DogInsurance.getErrorAccidentOnly();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(3), retrieve[2].replace("your pet", "Ben"));

		  retrieve=DogInsurance.getErrorCoverStartDate();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(4), retrieve[2]);

		  retrieve=DogInsurance.getErrorPaymentFrequency();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(5), retrieve[2].replace("your pet", "Ben"));
	 }
	 
	 @Test(testName="ErrorValidationIsPetChipped",groups= {"ErrorValidation"})
		public void ErrorValidationIsPetChipped() {
		 DogInsurance.clickDog();
		 DogInsurance.insertPetName("Ben");
		 DogInsurance.clickMale();
		 DogInsurance.clickDogAgeYear("4");
		 DogInsurance.clickDogAgeMonth("4");
		 DogInsurance.clickPreExistingConditionNo();
		 DogInsurance.clickButtonNext();
		 DogInsurance.clickCrossbreedNo();
		 DogInsurance.insertDogBreed("Yorkshire Terrier");
		 DogInsurance.clickChippedYes();
		  
		 String[] retrieve = new String[3];
		  List<String>listRetrieve=DogInsurance.getErrorCollective();
		  assertEquals(listRetrieve.size(),5);
		  
		  retrieve=DogInsurance.getErrorHowMuchPayed();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(0), retrieve[2].replace("your pet", "Ben"));

		  retrieve=DogInsurance.getErrorPetNeutered();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(1), retrieve[2].replace("your pet", "Ben"));
	  
		  retrieve=DogInsurance.getErrorAccidentOnly();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(2), retrieve[2].replace("your pet", "Ben"));

		  retrieve=DogInsurance.getErrorCoverStartDate();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(3), retrieve[2]);

		  retrieve=DogInsurance.getErrorPaymentFrequency();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(4), retrieve[2].replace("your pet", "Ben"));
	 }
	 
	 @Test(testName="ErrorValidationHowMuchPayed",groups= {"ErrorValidation"})
		public void ErrorValidationHowMuchPayed() {
		 DogInsurance.clickDog();
		 DogInsurance.insertPetName("Ben");
		 DogInsurance.clickMale();
		 DogInsurance.clickDogAgeYear("4");
		 DogInsurance.clickDogAgeMonth("4");
		 DogInsurance.clickPreExistingConditionNo();
		 DogInsurance.clickButtonNext();
		 DogInsurance.clickCrossbreedNo();
		 DogInsurance.insertDogBreed("Yorkshire Terrier");
		 DogInsurance.clickChippedYes();
		 DogInsurance.insertHowMuchPayed("50");
		 DogInsurance.clickButtonNext();
		 
		  String[] retrieve = new String[3];
		  List<String>listRetrieve=DogInsurance.getErrorCollective();
		  assertEquals(listRetrieve.size(),4);
		  retrieve=DogInsurance.getErrorPetNeutered();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(0), retrieve[2].replace("your pet", "Ben"));

		  retrieve=DogInsurance.getErrorAccidentOnly();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(1), retrieve[2].replace("your pet", "Ben"));

		  retrieve=DogInsurance.getErrorCoverStartDate();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(2), retrieve[2]);

		  retrieve=DogInsurance.getErrorPaymentFrequency();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(3), retrieve[2].replace("your pet", "Ben"));
	 }
	 
	 @Test(testName="ErrorValidationDidNotPay",groups= {"ErrorValidation"})
		public void ErrorValidationDidNotPay() {
		 DogInsurance.clickDog();
		 DogInsurance.insertPetName("Ben");
		 DogInsurance.clickMale();
		 DogInsurance.clickDogAgeYear("4");
		 DogInsurance.clickDogAgeMonth("4");
		 DogInsurance.clickCrossbreedNo();
		 DogInsurance.insertDogBreed("Yorkshire Terrier");
		 DogInsurance.clickChippedYes();
		 DogInsurance.clickDidNotPay();
		 DogInsurance.clickPreExistingConditionNo();
		 DogInsurance.clickButtonNext();
		 
		  String[] retrieve = new String[3];
		  List<String>listRetrieve=DogInsurance.getErrorCollective();
		  assertEquals(listRetrieve.size(),4);
		  
		  retrieve=DogInsurance.getErrorPetNeutered();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(0), retrieve[2].replace("your pet", "Ben"));

		  retrieve=DogInsurance.getErrorAccidentOnly();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(1), retrieve[2].replace("your pet", "Ben"));

		  retrieve=DogInsurance.getErrorCoverStartDate();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(2), retrieve[2]);

		  retrieve=DogInsurance.getErrorPaymentFrequency();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(3), retrieve[2].replace("your pet", "Ben"));
	 }
	 
	 @Test(testName="ErrorValidationPetNeutered",groups= {"ErrorValidation"})
		public void ErrorValidationPetNeutered() {
		 DogInsurance.clickDog();
		 DogInsurance.insertPetName("Ben");
		 DogInsurance.clickMale();
		 DogInsurance.clickDogAgeYear("4");
		 DogInsurance.clickDogAgeMonth("4");
		 DogInsurance.clickCrossbreedNo();
		 DogInsurance.insertDogBreed("Yorkshire Terrier");
		 DogInsurance.clickChippedYes();
		 DogInsurance.clickDidNotPay();
		 DogInsurance.clickNuteredNo();
		 DogInsurance.clickPreExistingConditionNo();
		 DogInsurance.clickButtonNext();
		 
		  String[] retrieve = new String[3];
		  List<String>listRetrieve=DogInsurance.getErrorCollective();
		  assertEquals(listRetrieve.size(),3);
		  
		  retrieve=DogInsurance.getErrorAccidentOnly();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(0), retrieve[2].replace("your pet", "Ben"));

		  retrieve=DogInsurance.getErrorCoverStartDate();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(1), retrieve[2]);

		  retrieve=DogInsurance.getErrorPaymentFrequency();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(2), retrieve[2].replace("your pet", "Ben"));
	 }
	 
	 @Test(testName="ErrorValidationAccidentOnly",groups= {"ErrorValidation"})
		public void ErrorValidationAccidentOnly() {
		 DogInsurance.clickDog();
		 DogInsurance.insertPetName("Ben");
		 DogInsurance.clickMale();
		 DogInsurance.clickDogAgeYear("4");
		 DogInsurance.clickDogAgeMonth("4");
		 DogInsurance.clickCrossbreedNo();
		 DogInsurance.insertDogBreed("Yorkshire Terrier");
		 DogInsurance.clickChippedYes();
		 DogInsurance.clickDidNotPay();
		 DogInsurance.clickNuteredNo();
		 DogInsurance.clickPreExistingConditionNo();
		 DogInsurance.clickAccidentOnly();
		 DogInsurance.clickButtonNext();
		 
		  String[] retrieve = new String[3];
		  List<String>listRetrieve=DogInsurance.getErrorCollective();
		  assertEquals(listRetrieve.size(),3);
		  
		  retrieve=DogInsurance.getErrorCoverAmount();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(0), retrieve[2].replace("your pet", "Ben"));

		  retrieve=DogInsurance.getErrorCoverStartDate();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(1), retrieve[2]);

		  retrieve=DogInsurance.getErrorPaymentFrequency();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(2), retrieve[2].replace("your pet", "Ben"));
	 }
	 
	 @Test(testName="ErrorValidationAccidentOnly1000Cover",groups= {"ErrorValidation"})
		public void ErrorValidationAccidentOnly1000Cover() {
		 DogInsurance.clickDog();
		 DogInsurance.insertPetName("Ben");
		 DogInsurance.clickMale();
		 DogInsurance.clickDogAgeYear("4");
		 DogInsurance.clickDogAgeMonth("4");
		 DogInsurance.clickCrossbreedNo();
		 DogInsurance.insertDogBreed("Yorkshire Terrier");
		 DogInsurance.clickChippedYes();
		 DogInsurance.clickDidNotPay();
		 DogInsurance.clickNuteredNo();
		 DogInsurance.clickPreExistingConditionNo();
		 DogInsurance.clickAccidentOnly();
		 DogInsurance.clickAccidentOnly1000Cover();
		 DogInsurance.clickButtonNext();
		 
		  String[] retrieve = new String[3];
		  List<String>listRetrieve=DogInsurance.getErrorCollective();
		  assertEquals(listRetrieve.size(),2);
		  
		  retrieve=DogInsurance.getErrorCoverStartDate();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(0), retrieve[2]);

		  retrieve=DogInsurance.getErrorPaymentFrequency();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(1), retrieve[2].replace("your pet", "Ben"));
	 }
	 
	 @Test(testName="ErrorValidationAccidentOnly2000Cover",groups= {"ErrorValidation"})
		public void ErrorValidationAccidentOnly2000Cover() {
		 DogInsurance.clickDog();
		 DogInsurance.insertPetName("Ben");
		 DogInsurance.clickMale();
		 DogInsurance.clickDogAgeYear("4");
		 DogInsurance.clickDogAgeMonth("4");
		 DogInsurance.clickCrossbreedNo();
		 DogInsurance.insertDogBreed("Yorkshire Terrier");
		 DogInsurance.clickChippedYes();
		 DogInsurance.clickDidNotPay();
		 DogInsurance.clickNuteredNo();
		 DogInsurance.clickPreExistingConditionNo();
		 DogInsurance.clickAccidentOnly();
		 DogInsurance.clickAccidentOnly2000Cover();
		 DogInsurance.clickButtonNext();
		 
		  String[] retrieve = new String[3];
		  List<String>listRetrieve=DogInsurance.getErrorCollective();
		  assertEquals(listRetrieve.size(),2);
		  
		  retrieve=DogInsurance.getErrorCoverStartDate();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(0), retrieve[2]);

		  retrieve=DogInsurance.getErrorPaymentFrequency();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(1), retrieve[2].replace("your pet", "Ben"));
	 }
	 
	 @Test(testName="ErrorValidationAccidentsAndIllnesses",groups= {"ErrorValidation"})
		public void ErrorValidationAccidentsAndIllnesses() {
		 DogInsurance.clickDog();
		 DogInsurance.insertPetName("Ben");
		 DogInsurance.clickMale();
		 DogInsurance.clickDogAgeYear("4");
		 DogInsurance.clickDogAgeMonth("4");
		 DogInsurance.clickCrossbreedNo();
		 DogInsurance.insertDogBreed("Yorkshire Terrier");
		 DogInsurance.clickChippedYes();
		 DogInsurance.clickDidNotPay();
		 DogInsurance.clickNuteredNo();
		 DogInsurance.clickPreExistingConditionNo();
		 DogInsurance.clickAccidentOnly();
		 DogInsurance.clickAccidentsAndIllness();
		 DogInsurance.clickButtonNext();
		 
		  String[] retrieve = new String[3];
		  List<String>listRetrieve=DogInsurance.getErrorCollective();
		  assertEquals(listRetrieve.size(),3);
		  
		  retrieve=DogInsurance.getErrorAccidentsAndIllnesses();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(0), retrieve[2].replace("your pet", "Ben"));
		  
		  retrieve=DogInsurance.getErrorCoverStartDate();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(1), retrieve[2]);

		  retrieve=DogInsurance.getErrorPaymentFrequency();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(2), retrieve[2].replace("your pet", "Ben"));
	 }
	 
	 @Test(testName="ErrorValidationAccidentsAndIllnessesUpto12Months",groups= {"ErrorValidation"})
		public void ErrorValidationAccidentsAndIllnessesUpto12Months() {
		 DogInsurance.clickDog();
		 DogInsurance.insertPetName("Ben");
		 DogInsurance.clickMale();
		 DogInsurance.clickDogAgeYear("4");
		 DogInsurance.clickDogAgeMonth("4");
		 DogInsurance.clickCrossbreedNo();
		 DogInsurance.insertDogBreed("Yorkshire Terrier");
		 DogInsurance.clickChippedYes();
		 DogInsurance.clickDidNotPay();
		 DogInsurance.clickNuteredNo();
		 DogInsurance.clickPreExistingConditionNo();
		 DogInsurance.clickAccidentOnly();
		 DogInsurance.clickAccidentsAndIllness();
		 DogInsurance.clickUpto12Months();
		 DogInsurance.clickButtonNext();
		 
		  String[] retrieve = new String[3];
		  List<String>listRetrieve=DogInsurance.getErrorCollective();
		  assertEquals(listRetrieve.size(),3);
		  
		  retrieve=DogInsurance.getErrorAccidentsAndIllnesses_UpTo12Months_CoverAmount();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(0), retrieve[2].replace("your pet", "Ben"));
		  
		  retrieve=DogInsurance.getErrorCoverStartDate();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(1), retrieve[2]);

		  retrieve=DogInsurance.getErrorPaymentFrequency();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(2), retrieve[2].replace("your pet", "Ben"));
	 }
	 
	 @Test(testName="ErrorValidationAccidentsAndIllnessesUptoVetFeeLimit",groups= {"ErrorValidation"})
		public void ErrorValidationAccidentsAndIllnessesUptoVetFeeLimit() {
		 DogInsurance.clickDog();
		 DogInsurance.insertPetName("Ben");
		 DogInsurance.clickMale();
		 DogInsurance.clickDogAgeYear("4");
		 DogInsurance.clickDogAgeMonth("4");
		 DogInsurance.clickCrossbreedNo();
		 DogInsurance.clickChippedYes();
		 DogInsurance.clickDidNotPay();
		 DogInsurance.clickNuteredNo();
		 DogInsurance.insertDogBreed("Yorkshire Terrier");
		 DogInsurance.clickPreExistingConditionNo();
		 DogInsurance.clickAccidentOnly();
		 DogInsurance.clickAccidentsAndIllness();
		 DogInsurance.clickUptoVetFeeLimit();
		 DogInsurance.clickButtonNext();
		 
		  String[] retrieve = new String[3];
		  List<String>listRetrieve=DogInsurance.getErrorCollective();
		  assertEquals(listRetrieve.size(),3);
		  
		  retrieve=DogInsurance.getErrorAccidentsAndIllnesses_UpVetFeeLimit();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(0), retrieve[2].replace("your pet", "Ben"));
		  
		  retrieve=DogInsurance.getErrorCoverStartDate();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(1), retrieve[2]);

		  retrieve=DogInsurance.getErrorPaymentFrequency();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(2), retrieve[2].replace("your pet", "Ben"));
	 }
	 
	 @Test(testName="ErrorValidationAccidentsAndIllnessesLifetime",groups= {"ErrorValidation"})
		public void ErrorValidationAccidentsAndIllnessesLifetime() {
		 DogInsurance.clickDog();
		 DogInsurance.insertPetName("Ben");
		 DogInsurance.clickMale();
		 DogInsurance.clickDogAgeYear("4");
		 DogInsurance.clickDogAgeMonth("4");
		 DogInsurance.clickCrossbreedNo();
		 DogInsurance.clickChippedYes();
		 DogInsurance.clickDidNotPay();
		 DogInsurance.clickNuteredNo();
		 DogInsurance.insertDogBreed("Yorkshire Terrier");
		 DogInsurance.clickPreExistingConditionNo();
		 DogInsurance.clickAccidentsAndIllness();
		 DogInsurance.clickLifeTime();
		 DogInsurance.clickButtonNext();
		 
		  String[] retrieve = new String[3];
		  List<String>listRetrieve=DogInsurance.getErrorCollective();
		  assertEquals(listRetrieve.size(),3);
		  
		  retrieve=DogInsurance.getErrorAccidentsAndIllnesses_Lifetime();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(0), retrieve[2].replace("your pet", "Ben"));
		  
		  retrieve=DogInsurance.getErrorCoverStartDate();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(1), retrieve[2]);

		  retrieve=DogInsurance.getErrorPaymentFrequency();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(2), retrieve[2].replace("your pet", "Ben"));
	 }
	 
	 @Test(testName="ErrorValidationCoverStartDate",groups= {"ErrorValidation"})
		public void ErrorValidationCoverStartDate() {
		 DogInsurance.clickDog();
		 DogInsurance.insertPetName("Ben");
		 DogInsurance.clickMale();
		 DogInsurance.clickDogAgeYear("4");
		 DogInsurance.clickDogAgeMonth("4");
		 DogInsurance.clickCrossbreedNo();
		 DogInsurance.clickChippedYes();
		 DogInsurance.clickDidNotPay();
		 DogInsurance.clickNuteredNo();
		 DogInsurance.insertDogBreed("Yorkshire Terrier");
		 DogInsurance.clickPreExistingConditionNo();
		 DogInsurance.clickAccidentOnly();
		 DogInsurance.clickAccidentOnly1000Cover();
		 DogInsurance.clickCalendarDay();
		 DogInsurance.clickButtonNext();

		 
		  String[] retrieve = new String[3];
		  List<String>listRetrieve=DogInsurance.getErrorCollective();
		  assertEquals(listRetrieve.size(),1);
		  
		  retrieve=DogInsurance.getErrorPaymentFrequency();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(0), retrieve[2].replace("your pet", "Ben"));
	 }
	 
	 @Test(testName="ErrorValidationPaymentMonthly",groups= {"ErrorValidation"})
		public void ErrorValidationPaymentMonthly() {
		 DogInsurance.clickDog();
		 DogInsurance.insertPetName("Ben");
		 DogInsurance.clickMale();
		 DogInsurance.clickDogAgeYear("4");
		 DogInsurance.clickDogAgeMonth("4");
		 DogInsurance.clickCrossbreedNo();
		 DogInsurance.clickChippedYes();
		 DogInsurance.clickDidNotPay();
		 DogInsurance.clickNuteredNo();
		 DogInsurance.insertDogBreed("Yorkshire Terrier");
		 DogInsurance.clickPreExistingConditionNo();
		 DogInsurance.clickAccidentOnly();
		 DogInsurance.clickAccidentOnly1000Cover();
		 DogInsurance.clickCalendarDay();
		 DogInsurance.clickPaymentMonthly();
		 DogInsurance.clickButtonNext();
		 DogInsurance.clickGetQuotes();

		 
		  String[] retrieve = new String[3];
		  List<String>listRetrieve=DogInsurance.getErrorCollectiveDetails();
		  assertEquals(listRetrieve.size(),7);
		  
		  retrieve=DogInsurance.getErrorTitle();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(0), retrieve[2]);
		  
		  retrieve=DogInsurance.getErrorFirstName();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(1), retrieve[2]);
		  
		  retrieve=DogInsurance.getErrorLastName();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(1), retrieve[2]);
		  
		  retrieve=DogInsurance.getErrorDOBDay();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(2), retrieve[2]);
		  
		  retrieve=DogInsurance.getErrorDOBMonth();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(2), retrieve[2]);
		  
		  retrieve=DogInsurance.getErrorDOBYear();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(2), retrieve[2]);
		  
		  retrieve=DogInsurance.getErrorDOBYear();
		  assertEquals(retrieve[0], retrieve[1]);
		  assertEquals(listRetrieve.get(2), retrieve[2]);
	 }
	 
	 
	 
  @AfterMethod(alwaysRun=true)
  public void afterTest() {
	  //driver.quit();
  }

}

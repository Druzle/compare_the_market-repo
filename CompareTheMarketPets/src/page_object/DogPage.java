package page_object;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hamcrest.core.IsNull;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DogPage {
	WebDriver driver;

	@FindBy(css = "#PetInsurance_YourPet_YourPetsDetails_TypeOfAnimal > div:nth-child(2) > label > span > span.Radio__button_3hZZy > span")
	WebElement dog;

	@FindBy(id = "PetName_Input")
	WebElement petName;

	@FindBy(css = "#PetInsurance_YourPet_YourPetsDetails_GenderOfAnimal > div:nth-child(1) > label > span > span")
	WebElement male;

	@FindBy(css = "#PetInsurance_YourPet_YourPetsDetails_GenderOfAnimal > div:nth-child(2) > label > span > span")
	WebElement female;

	@FindBy(id = "PetAgeYear")
	WebElement dogAgeYear;

	@FindBy(id = "PetAgeMonth")
	WebElement dogAgeMonth;
	
	@FindBy(css = "#PetInsurance_YourPet > section:nth-child(5) > div > div > div > div > div > button")
	WebElement petDetailsNext;

	@FindBy(css = "#PetInsurance_YourPet_MoreAboutPet_DogCrossBreed > div:nth-child(1) > label > span")
	WebElement crossbreedYes;

	@FindBy(css = "#PetInsurance_YourPet_MoreAboutPet_DogCrossBreed > div:nth-child(2) > label > span")
	WebElement crossbreedNo;

	@FindBy(css = "#DogBreed > div.Question__answer_1IvoI > div.Question__answer__field_1jxS8 > div > input")
	WebElement dogBreed;
	
	@FindBy(xpath = "//*[contains(text(), 'Best Choice')]")
	WebElement selectBreed;
	
	@FindBy(css = "#PetInsurance_YourPet_MoreAboutPet_IsPetChipped > div:nth-child(1) > label > span")
	WebElement chippedYes;

	@FindBy(css = "#PetInsurance_YourPet_MoreAboutPet_IsPetChipped > div:nth-child(2) > label > span")
	WebElement chippedNo;

	@FindAll({ @FindBy(id = "HowMuchPayed") })
	public List<WebElement> howMuchPayed;

	@FindBy(css = "#HowMuchPayed > div.Question__answer_1IvoI > div.Question__answer__field_1jxS8 > div > label > span")
	WebElement didNotPay;

	@FindBy(css = "#PetInsurance_YourPet_MoreAboutPet_IsPetNeuteredOrSpayed > div:nth-child(1) > label > span")
	WebElement nuteredYes;

	@FindBy(css = "#PetInsurance_YourPet_MoreAboutPet_IsPetNeuteredOrSpayed > div:nth-child(2) > label > span")
	WebElement nuteredNo;

	@FindBy(css = "#PetInsurance_YourPet_MoreAboutPet_PreExistingConditions > div:nth-child(1) > label > span")
	WebElement preExistingConditionYes;

	@FindBy(css = "#PetInsurance_YourPet_MoreAboutPet_PreExistingConditions > div:nth-child(2) > label > span")
	WebElement preExistingConditionNo;

	@FindBy(css="#PetInsurance_YourPet > div:nth-child(3) > section > div > section > div:nth-child(7) > div > div.Subset__content_1Ipoh > div > p")
	WebElement messageExistingCondition;
	
	@FindBy(css = "#CoverType > div:nth-child(1) > label > span")
	WebElement accidentOnly;

	@FindBy(css = "#AccidentsOnly_CoverAmount > div:nth-child(1) > label > span")
	WebElement accidentOnly£1000CoverOrMore;

	@FindBy(css = "#AccidentsOnly_CoverAmount > div:nth-child(2) > label > span")
	WebElement accidentOnly£2000CoverOrMore;

	@FindBy(css = "#CoverType > div:nth-child(2) > label > span")
	WebElement accidentsAndIllness;

	@FindBy(css = "#AccidentsAndIllnesses_VetFeesCoverDuration > label:nth-child(1) > span")
	WebElement upto12Months;

	@FindBy(css = "#AccidentsAndIllnesses_UpTo12Months_CoverAmount > div:nth-child(1) > label > span")
	WebElement upto12Months£1000CoverOrMore;

	@FindBy(css = "#AccidentsAndIllnesses_UpTo12Months_CoverAmount > div:nth-child(2) > label > span")
	WebElement upto12Months£2000CoverOrMore;

	@FindBy(css = "#AccidentsAndIllnesses_VetFeesCoverDuration > label:nth-child(2) > span")
	WebElement uptoVetFeeLimit;

	@FindBy(css = "#AccidentsAndIllnesses_VetFeesCoverDuration > label:nth-child(3) > span")
	WebElement lifeTime;

	@FindAll({ @FindBy(id = "AccidentsAndIllnesses_UpToVetFeeLimit_CoverAmount") })
	public List<WebElement> uptoVetFeeLimitAmountOfCover;

	@FindAll({ @FindBy(id = "AccidentsAndIllnesses_Lifetime_CoverAmount") })
	public List<WebElement> lifetimeAmountOfCover;

	@FindBy(id = "CoverStartDate")
	WebElement calendar;

	@FindBy(css = "#PetInsurance_YourPet_PetPolicy_PaymentFrequency > div:nth-child(1) > label > span")
	WebElement paymentAnnual;

	@FindBy(css = "#PetInsurance_YourPet_PetPolicy_PaymentFrequency > div:nth-child(2) > label > span")
	WebElement paymentMonthly;

	@FindBy(css = "#PetInsurance_YourPet > section:nth-child(5) > div > div > div > div > div > button")
	WebElement buttonNext;

	@FindBy(css = "#PetInsurance_YourDetails_YourDetails_Title > div:nth-child(1) > label > span")
	WebElement titleMr;

	@FindBy(css = "#PetInsurance_YourDetails_YourDetails_Title > div:nth-child(2) > label > span")
	WebElement titleMrs;

	@FindBy(css = "#PetInsurance_YourDetails_YourDetails_Title > div:nth-child(3) > label > span")
	WebElement titleMs;

	@FindBy(css = "#PetInsurance_YourDetails_YourDetails_Title > div:nth-child(4) > label > span")
	WebElement titleMiss;

	@FindBy(id = "PetInsurance_YourDetails_YourDetails_FirstName")
	WebElement firstName;

	@FindBy(id = "PetInsurance_YourDetails_YourDetails_Surname")
	WebElement lastName;

	@FindBy(id = "PetInsurance_YourDetails_YourDetails_DateOfBirth_Day")
	WebElement dobDay;

	@FindBy(id = "PetInsurance_YourDetails_YourDetails_DateOfBirth_Month")
	WebElement dobMonth;

	@FindBy(id = "PetInsurance_YourDetails_YourDetails_DateOfBirth_Year")
	WebElement dobYear;

	@FindBy(id = "house")
	WebElement addressNameNumber;

	@FindBy(id = "postcode")
	WebElement addressPostCode;

	@FindBy(id = "PetInsurance_YourDetails_YourDetails_FindMyAddress_")
	WebElement findAddress;

	@FindBy(id = "PetInsurance_YourDetails_YourDetails_ChangeAddress_")
	WebElement changeAddress;

	@FindBy(id = "switcher")
	WebElement enterAddressManualy;

	@FindBy(id = "line1")
	WebElement manualAddressLine1;

	@FindBy(id = "line2")
	WebElement manualAddressLine2;

	@FindBy(id = "line3")
	WebElement manualAddressLine3;

	@FindBy(id = "line4")
	WebElement manualAddressTownCity;

	@FindBy(id = "postcode")
	WebElement manualAddressPostcode;

	@FindBy(id = "switcher")
	WebElement backToPostcodeSearch;

	@FindBy(id = "PetInsurance_YourDetails_ContactDetails_EmailAddress")
	WebElement emailAddress;

	@FindBy(css = "#PetInsurance_YourDetails_ContactDetails_ContactPreferences > div:nth-child(1) > label > span > span.CheckboxToggle__button__mark_1ZY8n")
	WebElement contactViaEmail;

	@FindBy(css = "#PetInsurance_YourDetails_ContactDetails_ContactPreferences > div:nth-child(2) > label > span > span.CheckboxToggle__button__mark_1ZY8n")
	WebElement contactViaPhone;

	@FindBy(css = "#PetInsurance_YourDetails_ContactDetails_ContactPreferences > div:nth-child(3) > label > span > span.CheckboxToggle__button__mark_1ZY8n")
	WebElement contactViaText;

	@FindBy(css = "#PetInsurance_YourDetails_ContactDetails_ContactPreferences > div:nth-child(4) > label > span > span.CheckboxToggle__button__mark_1ZY8n")
	WebElement contactViaPost;

	@FindBy(css = "#PetInsurance_YourDetails_ContactDetails_ContactPreferences > div:nth-child(5) > label > span")
	WebElement contactViaNoContact;

	@FindBy(css = "#PetInsurance_YourDetails_ContactDetails_PrivacyPolicyLink > span")
	WebElement contactViaPrivacyPolicy;

	@FindBy(css = "#PetInsurance_YourDetails_YourData_PrivacyAndCookiePolicyLink > span")
	WebElement yourDataPrivacyAndCookiePolicy;

	@FindBy(css = "#PetInsurance_YourDetails_YourData_PrivacyPolicyLink > span")
	WebElement yourDataPrivacyPolicy;

	@FindBy(css = "#PetInsurance_YourDetails_Assumptions_AboutUsLink > span")
	WebElement aboutUs;

	@FindBy(css = "#PetInsurance_YourDetails_Assumptions_TermsAndConditionsLink > span")
	WebElement termsAndConditions;

	@FindBy(css = "#PetInsurance_YourDetails_Assumptions_RewardsTermsAndConditionsLink > span")
	WebElement rewardsTermsAndConditions;

	@FindBy(css = "#PetInsurance_YourDetails_Assumptions_ContactUsLink > span")
	WebElement contactUs;

	@FindBy(css = "#IAgree > div > div.Question__answer__field_1jxS8 > fieldset > label > span > span.CheckboxToggle__button__mark_1ZY8n")
	WebElement iAgree;

	@FindBy(id = "backButton")
	WebElement back;

	@FindBy(css = "#PetInsurance_YourDetails > div > section:nth-child(5) > div > div > div.Submitter__Buttons_6hJeZ > div.Submitter__actions_39u1S > div > button")
	WebElement getQuotes;
	
	@FindBy(id = "PetInsurance_YourQuotes")
	WebElement waitPageLoad;
	
	@FindBy(id = "TypeOfAnimal_error_message")
	WebElement errorPetType;
	
	@FindBy(id = "PetName_error_message")
	WebElement errorPetName;
	
	@FindBy(id = "GenderOfAnimal_error_message")
	WebElement errorGender;
	
	@FindBy(id = "AgeOfAnimal_error_message")
	WebElement errorPetAge;
	
	@FindBy(css = "#AgeOfAnimal > div.Question__answer_1IvoI > div.Question__answer__field_1jxS8 > p")
	WebElement errorAgeUnderOneYear;
	
	@FindBy(id = "DogCrossBreed_error_message")
	WebElement errorCrossBreed;
	
	@FindBy(id = "DogBreed_error_message")
	WebElement errorDogBreed;
	
	@FindBy(id = "IsPetChipped_error_message")
	WebElement errorIsPetChipped;
	
	@FindBy(id = "HowMuchPayed_error_message")
	WebElement errorHowMuchPayed;
	
	@FindBy(id = "IsPetNeuteredOrSpayed_error_message")
	WebElement errorPetNeutered;
	
	@FindBy(id = "CoverType_error_message")
	WebElement errorAccidentOnly;
	
	@FindBy(id = "AccidentsAndIllnesses_VetFeesCoverDuration_error_message")
	WebElement errorAccidentsAndIllnesses;
	
	@FindBy(id = "AccidentsAndIllnesses_UpTo12Months_CoverAmount_error_message")
	WebElement errorAccidentsAndIllnesses_UpTo12Months_CoverAmount;
	
	@FindBy(id = "AccidentsAndIllnesses_UpToVetFeeLimit_CoverAmount_error_message")
	WebElement errorAccidentsAndIllnesses_UpToVetFeeLimit_CoverAmount;
	
	@FindBy(id = "AccidentsAndIllnesses_Lifetime_CoverAmount_error_message")
	WebElement errorAccidentsAndIllnesses_Lifetime_CoverAmount;
	
	@FindBy(id = "AccidentsOnly_CoverAmount_error_message")
	WebElement errorCoverAmount;
	
	@FindBy(id = "CoverStartDate_error_message")
	WebElement errorCoverStartDate;
	
	@FindBy(id = "PaymentFrequency_error_message")
	WebElement errorPaymentFrequency;
	
	@FindBy(id = "Title_error_message")
	WebElement errorTitle;
	
	@FindBy(id = "undefined_error_message")
	WebElement errorFirstName;
	
	@FindBy(id = "undefined_error_message")
	WebElement errorLastName;
	
	@FindBy(id = "DateOfBirth_error_message")
	WebElement errorDOBDay;
	
	@FindBy(id = "DateOfBirth_error_message")
	WebElement errorDOBMonth;
	
	@FindBy(id = "DateOfBirth_error_message")
	WebElement errorDOBYear;
	
	@FindBy(className = "styles_input-section__error-message__2BMFd")
	WebElement errorNoPostcode;
	
	@FindBy(className = "styles_input-section__error-message__2BMFd")
	WebElement errorIncorrectPostcode;
	
	@FindBy(id = "Address_error_message")
	WebElement errorGenericPostcode;
	
	@FindAll({ @FindBy(className = "YourPet_error-item__2FucJ") })
	public List<WebElement> errorCollective;
	
	@FindBys({ @FindBy(css = "section.sc-bdVaJa.kKZaFe.Error"),
	@FindBy(tagName = "p")})
	public List<WebElement> errorCollectiveDetails;
	
	public DogPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickDog() {
		dog.click();
	}

	public void insertPetName(String name) {
		petName.sendKeys(name);
	}

	public void clickMale() {
		male.click();
	}

	public void clickFemale() {
		female.click();
	}

	public void clickDogAgeYear(String year) {
		Select drpdYear = new Select(dogAgeYear);
		drpdYear.selectByVisibleText(year);
	}

	public void clickDogAgeMonth(String month) {
		Select drpdYear = new Select(dogAgeMonth);
		drpdYear.selectByVisibleText(month);
	}
	
	public void clickPetDetailsNext() {
		petDetailsNext.click();
	}

	public void clickCrossbreedYes() {
		crossbreedYes.click();
	}

	public void clickCrossbreedNo() {
		crossbreedNo.click();
	}

	public void insertDogBreed(String breed) {
		dogBreed.sendKeys(breed);
		
		dogBreed.sendKeys(Keys.ARROW_DOWN);
		dogBreed.sendKeys(Keys.ENTER);
	}

	public void clickChippedYes() {
		chippedYes.click();
	}

	public void clickChippedNo() {
		chippedNo.click();
	}

	public void insertHowMuchPayed(String amount) {
		WebElement item = howMuchPayed.get(1);
		item.sendKeys(amount);
	}

	public void clickDidNotPay() {
		didNotPay.click();
	}

	public void clickNuteredYes() {
		nuteredYes.click();
	}

	public void clickNuteredNo() {
		nuteredNo.click();
	}

	public void clickPreExistingConditionYes() {
		preExistingConditionYes.click();
	}

	public void clickPreExistingConditionNo() {
		preExistingConditionNo.click();
	}
	
	public String preExistingConditionMessage() {
	String message=messageExistingCondition.getText();
	return message;
	}

	public void clickAccidentOnly() {
		accidentOnly.click();
	}

	public void clickAccidentOnly1000Cover() {
		accidentOnly£1000CoverOrMore.click();
	}

	public void clickAccidentOnly2000Cover() {
		accidentOnly£2000CoverOrMore.click();
	}

	public void clickAccidentsAndIllness() {
		accidentsAndIllness.click();
	}

	public void clickUpto12Months() {
		upto12Months.click();
	}

	public void clickUpto12Months1000Cover() {
		upto12Months£1000CoverOrMore.click();
	}

	public void clickUpto12Months2000Cover() {
		upto12Months£2000CoverOrMore.click();
	}

	public void clickUptoVetFeeLimit() {
		uptoVetFeeLimit.click();
	}

	public void selectUptoVetFeeLimitAmountOfCover(String amount) {
		Select drpdAmountOfCover = new Select(uptoVetFeeLimitAmountOfCover.get(1));
		drpdAmountOfCover.selectByVisibleText(amount);
	}

	public void clickLifeTime() {
		lifeTime.click();
	}

	public void selectLifetimeAmountOfCover(String amount) {
		Select drpdCover = new Select(lifetimeAmountOfCover.get(1));
		drpdCover.selectByVisibleText(amount);
	}

	public void clickCalendarDay() {
		WebElement attribute = null;
		attribute = clickCalendarDay1();
		attribute.click();
	}

	public void clickPaymentAnnual() {
		paymentAnnual.click();
	}

	public void clickPaymentMonthly() {
		paymentMonthly.click();
	}

	public void clickButtonNext() {
		new Actions(driver).moveToElement(buttonNext).perform();
		//WebDriverWait wait = new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.elementToBeClickable(buttonNext));
		buttonNext.click();
	}

	public void clickTitleMr() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(titleMr));
		titleMr.click();
	}

	public void clickTitleMrs() {
		titleMrs.click();
	}

	public void clickTitleMs() {
		titleMs.click();
	}

	public void clickTitleMiss() {
		titleMiss.click();
	}

	public void insertFirstName(String frstName) {
		firstName.sendKeys(frstName);
	}

	public void insertLastNameName(String lstName) {
		lastName.sendKeys(lstName);
	}

	public void selectDobDay(String day) {
		Select drpdDay = new Select(dobDay);
		drpdDay.selectByVisibleText(day);
	}

	public void selectDobMonth(String month) {
		Select drpdMonth = new Select(dobMonth);
		drpdMonth.selectByVisibleText(month);
	}

	public void selectDobYear(String year) {
		Select drpdYear = new Select(dobYear);
		drpdYear.selectByVisibleText(year);
	}

	public void insertAddressNameNumber(String nameNumber) {
		addressNameNumber.sendKeys(nameNumber);
	}

	public void insertPostCode(String postCode) {
		addressPostCode.sendKeys(postCode);
	}

	public void clickEnterAddressManualy() {
		enterAddressManualy.click();
	}

	public void insertManualAddressLine1(String addr1) {
		manualAddressLine1.sendKeys(addr1);
	}

	public void insertManualAddressLine2(String addr2) {
		manualAddressLine2.sendKeys(addr2);
	}

	public void insertManualAddressLine3(String addr3) {
		manualAddressLine3.sendKeys(addr3);
	}

	public void insertManualAddressTownCity(String addr4) {
		manualAddressTownCity.sendKeys(addr4);
	}

	public void insertManualAddressPostcode(String postCode) {
		manualAddressPostcode.sendKeys(postCode);
	}

	public void clickFindAddress() {
		findAddress.click();
	}

	public void clickChangeAddress() {
		changeAddress.click();
	}

	public void clickBackToPostcodeSearch() {
		backToPostcodeSearch.click();
	}

	public void insertEmailAddress(String email) {
		emailAddress.sendKeys(email);
	}

	public void clickContactViaEmail() {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(contactViaEmail));
		contactViaEmail.click();
	}

	public void clickContactViaPhone() {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(contactViaPhone));
		contactViaPhone.click();
	}

	public void clickContactViaText() {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(contactViaText));
		contactViaText.click();
	}

	public void clickContactViaPost() {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(contactViaPost));
		contactViaPost.click();
	}

	public void clickContactViaNoContact() {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(contactViaNoContact));
		contactViaNoContact.click();
	}

	public void clickContactViaPrivacyPolicy() {
		contactViaPrivacyPolicy.click();
	}

	public void clickYourDataPrivacyAndCookiePolicy() {
		yourDataPrivacyAndCookiePolicy.click();
	}

	public void clickYourDataPrivacyPolicy() {
		yourDataPrivacyPolicy.click();
	}

	public void clickAboutUs() {
		aboutUs.click();
	}

	public void clickTermsAndConditions() {
		termsAndConditions.click();
	}

	public void clickRewardsTermsAndConditions() {
		rewardsTermsAndConditions.click();
	}

	public void clickContactUs() {
		contactUs.click();
	}

	public void clickIAgree() {
		iAgree.click();
	}

	public void clickBack() {
		back.click();
	}
	
	public String[] getErrorPetType() {
		String[] reported = new String[3];
		reported[0]=errorPetType.getText();
		reported[1]="Please answer this question in order to proceed.";
		reported[2]="What type of animal is your pet? Please answer this question in order to proceed.";
		return reported;
	}
	
	public String[] getErrorPetName() {
		String[] reported = new String[3];
		reported[0]=errorPetName.getText();
		reported[1]="Please answer this question in order to proceed.";
		reported[2]="What is your pet's name? Please answer this question in order to proceed.";
		return reported;
	};
	
	public String[] getErrorGender() {
		String[] reported = new String[3];
		reported[0]=errorGender.getText();
		reported[1]="Please answer this question in order to proceed.";
		reported[2]="Is your pet male or female? Please answer this question in order to proceed.";
		return reported;
	}
	
	public String[] getErrorPetAge() {
		String[] reported = new String[3];
		reported[0]=errorPetAge.getText();
		reported[1]="Your pet’s age must contain both year and month values.";
		reported[2]="How old is your pet? Please answer this question in order to proceed.";
		return reported;
	}
	
	public String[] getErrorAgeUnderOneYear() {
		String[] reported = new String[3];
		reported[0]=errorAgeUnderOneYear.getText();
		reported[1]="If your pet is under 1 year old, please choose 0 years.";
		reported[2]="How old is your pet? Please answer this question in order to proceed.";
		return reported;
	}
	
	public String[] getErrorCrossBreed() {
		String[] reported = new String[3];
		reported[0]=errorCrossBreed.getText();
		reported[1]="Please answer this question in order to proceed.";
		reported[2]="Is your pet a crossbreed? Please answer this question in order to proceed.";
		return reported;
	}
	
	public String[] getErrorDogBreed() {
		String[] reported = new String[3];
		reported[0]=errorDogBreed.getText();
		reported[1]="Please enter your pet breed and choose from the list displayed.";
		reported[2]="What breed is your pet? Please type the first 3 letters Please answer this question in order to proceed.";
		return reported;
	}
	
	public String[] getErrorIsPetChipped() {
		String[] reported = new String[3];
		reported[0]=errorIsPetChipped.getText();
		reported[1]="Please answer this question in order to proceed.";
		reported[2]="Has your pet been chipped? Please answer this question in order to proceed.";
		return reported;
	}
	
	public String[] getErrorHowMuchPayed() {
		String[] reported = new String[3];
		reported[0]=errorHowMuchPayed.getText();
		reported[1]="Please answer this question in order to proceed.";
		reported[2]="How much did you pay or donate for your pet? Please answer this question in order to proceed.";
		return reported;
	}
	
	public String[] getErrorPetNeutered() {
		String[] reported = new String[3]; 
		reported[0]=errorPetNeutered.getText();
		reported[1] ="Please answer this question in order to proceed.";
		reported[2]="Has your pet been neutered or spayed? Please answer this question in order to proceed.";
		return reported;
	}
	
	public String[] getErrorAccidentOnly() {
		String[] reported = new String[3];
		reported[0]=errorAccidentOnly.getText();
		reported[1]="Sorry there is a problem with this answer.";
		reported[2]="What would you like to cover your pet for? Please answer this question in order to proceed.";
		return reported;
	}
	
	public String[] getErrorAccidentsAndIllnesses() {
		String[] reported = new String[3];
		reported[0]=errorAccidentsAndIllnesses.getText();
		reported[1]="Please answer this question in order to proceed.";
		reported[2]="If your pet was diagnosed with a new condition, how long would you want vet fees to be covered for? Please answer this question in order to proceed.";
		return reported;
	}
	
	public String[] getErrorAccidentsAndIllnesses_UpTo12Months_CoverAmount() {
		String[] reported = new String[3];
		reported[0]=errorAccidentsAndIllnesses_UpTo12Months_CoverAmount.getText();
		reported[1]="Sorry there is a problem with this answer.";
		reported[2]="In the unfortunate event you had to claim for your pet, what amount of cover would you want for the claim? Please answer this question in order to proceed.";
		return reported;
	}
	
	public String[] getErrorAccidentsAndIllnesses_UpVetFeeLimit() {
		String[] reported = new String[3];
		reported[0]=errorAccidentsAndIllnesses_UpToVetFeeLimit_CoverAmount.getText();
		reported[1]="Sorry there is a problem with this answer.";
		reported[2]="In the unfortunate event you had to claim for your pet, what amount of cover would you want for the claim? Please answer this question in order to proceed.";
		return reported;
	}
	
	public String[] getErrorAccidentsAndIllnesses_Lifetime() {
		String[] reported = new String[3];
		reported[0]=errorAccidentsAndIllnesses_Lifetime_CoverAmount.getText();
		reported[1]="Sorry there is a problem with this answer.";
		reported[2]="In the unfortunate event you had to claim for your pet, what amount of cover would you want for the claim? Please answer this question in order to proceed.";
		return reported;
	}
	
	public String[] getErrorCoverAmount() {
		String[] reported = new String[3];
		reported[0]=errorCoverAmount.getText();
		reported[1]="Sorry there is a problem with this answer.";
		reported[2]="In the unfortunate event you had to claim for Ben's injury from an accident, what amount of cover would you want for the claim? Please answer this question in order to proceed.";
		return reported;
	}
	
	public String[] getErrorCoverStartDate() {
		String[] reported = new String[3];
		reported[0]=errorCoverStartDate.getText();
		reported[1]="Please answer this question in order to proceed.";
		reported[2]="Within the next 30 days, when would you like cover to start? Please answer this question in order to proceed.";
		return reported;
	}
	
	public String[] getErrorPaymentFrequency() {
		String[] reported = new String[3];
		reported[0]=errorPaymentFrequency.getText();
		reported[1]="Please answer this question in order to proceed.";
		reported[2]="How do you wish to pay for your pet's insurance? Please answer this question in order to proceed.";
		return reported;
	}
	
	public String[] getErrorTitle() {
		String[] reported = new String[3];
		reported[0]=errorTitle.getText();
		reported[1]="Please answer this question in order to proceed.";
		reported[2]="What is your title? Please answer this question in order to proceed.";
		return reported;
	}
	
	public String[] getErrorFirstName() {
		String[] reported = new String[3];
		reported[0]=errorFirstName.getText();
		reported[1]="You seem to have entered too few or too many letters. Please enter a name made up from between 2 and 15 letters.";
		reported[2]="First name and Last name Please answer this question in order to proceed.";
		return reported;
	}
	
	public String[] getErrorLastName() {
		String[] reported = new String[3];
		reported[0]=errorFirstName.getText();
		reported[1]="You seem to have entered too few or too many letters. Please enter a name made up from between 2 and 15 letters.";
		reported[2]="First name and Last name Please answer this question in order to proceed.";
		return reported;
	}
	
	public String[] getErrorDOBDay() {
		String[] reported = new String[3];
		reported[0]=errorDOBDay.getText();
		reported[1]="Please answer this question in order to proceed.";
		reported[2]="Your date of birth Please answer this question in order to proceed.";
		return reported;
	}
	
	public String[] getErrorDOBMonth() {
		String[] reported = new String[3];
		reported[0]=errorDOBDay.getText();
		reported[1]="Please answer this question in order to proceed.";
		reported[2]="Your date of birth Please answer this question in order to proceed.";
		return reported;
	}
	
	public String[] getErrorDOBYear() {
		String[] reported = new String[3];
		reported[0]=errorDOBDay.getText();
		reported[1]="Please answer this question in order to proceed.";
		reported[2]="Your date of birth Please answer this question in order to proceed.";
		return reported;
	}
	
	public String[] getErrorNoPostCode() {
		String[] reported = new String[5];
		reported[0]=errorNoPostcode.getText();
		reported[1]=errorGenericPostcode.getText();
		reported[2]="Oops! We can't find your address. Please check the postcode or enter your address manually";
		reported[3]="Please answer this question in order to proceed.";
		reported[4]="Your current address Please answer this question in order to proceed.";
		return reported;
	}
	
	public String[] getErrorIncorrectPostCode() {
		String[] reported = new String[5];
		reported[0]=errorIncorrectPostcode.getText();
		reported[1]=errorGenericPostcode.getText();
		reported[2]="The address you have selected has no house number or house name, please try again";
		reported[3]="Please answer this question in order to proceed.";
		reported[4]="Your current address Please answer this question in order to proceed.";
		return reported;
	}
	
	
	
	

	public List<String> getErrorCollective() {
		List <String> listError=new ArrayList<String>();
		for(int i=0; i<errorCollective.size(); i++){
			listError.add(errorCollective.get(i).getText());
			
		}
		return listError;
	}
	
	public List<String> getErrorCollectiveDetails() {
		List <String> listError=new ArrayList<String>();
		for(int i=0; i<errorCollectiveDetails.size(); i++){
			listError.add(errorCollectiveDetails.get(i).getText());
			
		}
		return listError;
	}

	public void clickGetQuotes() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getQuotes.click();
		WebDriverWait wait = new WebDriverWait(driver, 120);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(waitPageLoad));
	}

	public WebElement clickCalendarDay1() {
		Date date = new Date();
		DateFormat dateformat = new SimpleDateFormat("d");
		String dayOfMonth = dateformat.format(date);
		WebElement attribute = null;
		for (int section = 2; section <= 7; section++) {
			for (int day = 1; day <= 7; day++) {
				WebElement sec = driver.findElement(By.cssSelector("#CoverStartDate > div:nth-child(3) > div:nth-child("
						+ section + ") > button:nth-child(" + day + ")"));
				String visible = sec.getAttribute("tabindex");
				if ((sec.getText().equals(dayOfMonth)) && (visible == null)  ) {
					attribute = driver.findElement(By.cssSelector("#CoverStartDate > div:nth-child(3) > div:nth-child("
							+ section + ") > button:nth-child(" + day + ")"));
				}
			}
		}
		return attribute;
	}
	
	
	

	public WebElement agrigatedList() {
		return aboutUs;

	}

}

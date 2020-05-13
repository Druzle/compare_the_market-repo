package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgrigatedPage {
	WebDriver driver;
	
	@FindBy(css = "#PetInsurance_YourQuotes > section > div > section > div > div.RiskSummary_summary-wrapper__upper-section__HNyKS > p > b:nth-child(1)")
	WebElement nameOfPet;
	
	@FindBy(css = "#PetInsurance_YourQuotes > section > div > section > div > div.RiskSummary_summary-wrapper__upper-section__HNyKS > p > b:nth-child(2)")
	WebElement breedOfPet;
	
	@FindBy(css = "#PetInsurance_YourQuotes > section > div > section > div > div.RiskSummary_expandable-section__wrapper__3b1HY > div.RiskSummary_expandable-section__risk-info-wrapper__B9CEi > div:nth-child(1) > ul > li:nth-child(1) > strong")
	WebElement typeOfAnimal;
	
	@FindBy(css = "#PetInsurance_YourQuotes > section > div > section > div > div.RiskSummary_expandable-section__wrapper__3b1HY > div.RiskSummary_expandable-section__risk-info-wrapper__B9CEi > div:nth-child(1) > ul > li:nth-child(2) > strong")
	WebElement ageOfPet;
	
	@FindBy(css = "#PetInsurance_YourQuotes > section > div > section > div > div.RiskSummary_expandable-section__wrapper__3b1HY > div.RiskSummary_expandable-section__risk-info-wrapper__B9CEi > div:nth-child(1) > ul > li:nth-child(3) > strong")
	WebElement crossBreedYesNo;
	
	@FindBy(css = "#PetInsurance_YourQuotes > section > div > section > div > div.RiskSummary_expandable-section__wrapper__3b1HY > div.RiskSummary_expandable-section__risk-info-wrapper__B9CEi > div:nth-child(1) > ul > li:nth-child(4) > strong")
	WebElement breed;
	
	@FindBy(css = "#PetInsurance_YourQuotes > section > div > section > div > div.RiskSummary_expandable-section__wrapper__3b1HY > div.RiskSummary_expandable-section__risk-info-wrapper__B9CEi > div:nth-child(2) > ul > li:nth-child(1) > strong")
	WebElement coverStartDate;
	
	@FindBy(css = "#PetInsurance_YourQuotes > section > div > section > div > div.RiskSummary_expandable-section__wrapper__3b1HY > div.RiskSummary_expandable-section__risk-info-wrapper__B9CEi > div:nth-child(2) > ul > li:nth-child(2) > strong")
	WebElement coverFor;
	
	@FindBy(css = "#PetInsurance_YourQuotes > section > div > section > div > div.RiskSummary_expandable-section__wrapper__3b1HY > div.RiskSummary_expandable-section__risk-info-wrapper__B9CEi > div:nth-child(2) > ul > li:nth-child(3) > strong")
	WebElement coverType;
	
	@FindBy(css = "#PetInsurance_YourQuotes > section > div > section > div > div.RiskSummary_expandable-section__wrapper__3b1HY > div.RiskSummary_expandable-section__risk-info-wrapper__B9CEi > div:nth-child(2) > ul > li:nth-child(4) > strong")
	WebElement vetFeeLimit;
	
	
	
	public AgrigatedPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getNameOfPet() {
		String reported=nameOfPet.getText();
		return reported;
	}
	
	public String getBreedOfPet() {
		String reported=breedOfPet.getText();
		return reported;
	}
	
	public String getTypeOfAnimal() {
		String reported=typeOfAnimal.getText();
		return reported;
	}
		
		public String getAgeOfPet() {
			String reported=ageOfPet.getText();
			return reported;
	}
		
		public String getCrossBreedYesNo() {
			String reported=crossBreedYesNo.getText();
			return reported;
	}
		
		public String getBreed() {
			String reported=breed.getText();
			return reported;
	}
		
		public String getCoverStartDate() {
			String reported=coverStartDate.getText();
			return reported;
	}
		
		public String getCoverFor() {
			String reported=coverFor.getText();
			return reported;
	}
		
		public String getCoverType() {
			String reported=coverType.getText();
			return reported;
	}
		
		public String getVetFeeLimit() {
			String reported=vetFeeLimit.getText();
			return reported;
	}
	
	
	
	
	
}

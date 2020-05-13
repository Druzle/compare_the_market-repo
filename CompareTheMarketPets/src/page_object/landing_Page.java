package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landing_Page {

WebDriver driver;
	
	@FindBy(css="body > div.gbl-wrp > header > nav > ul > li.mn__insurance > ul > li:nth-child(2) > div.mn__sbhdr-itm-hdr > span")
	WebElement HomeAndPet;

	@FindBy(id="Market_HomePage_Meganav_HomePet_DogInsurance")
	WebElement dogInsurance;
	
	@FindBy(id="PetInsurance_PetInsurance-DogInsurance_DogHeroBlock_StartAQuote")
	WebElement startAQuote;
	
	public landing_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickHomeAndPet() {
		HomeAndPet.click();
	}
	
	public void clickDogInsurance() {
		dogInsurance.click();
	}
	
	public void clickStartAQuote() {
		startAQuote.click();
	}
}

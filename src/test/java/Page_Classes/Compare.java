package Page_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Compare {

	WebDriver driver;
	

	  public Compare(WebDriver driver) {
	
		  
		 this.driver = driver;
		 
		 PageFactory.initElements(driver, this); 
		 
	}
	
	


	@FindBy(css = "[id=\"cpid12609415\"]") 
		private WebElement Add_to_Compare1;
	  
	  
	  @FindBy(css = "[id=\"cpid12610389\"]") 
		private WebElement Add_to_Compare2;
	  
	  
	  @FindBy(css = "[id=\"cpid937676\"]") 
        private WebElement Add_to_Compare3;
	  
	  
	  @FindBy(css = "[class=\"button_1 compareFancyBox\"]") 
		private WebElement compareButton;
	  
	  @FindBy(css = "[onclick=\"compare.getMoreProductsToCompare('brand', '2', 0, event )\"]") 
		private WebElement selectBrand;
	  
	  @FindBy(css = "[onclick=\"compare.getMoreProductsToCompare('brand', '3', 0, event )\"]") 
		private WebElement selectBrand2;
	
	  @FindBy(css = "[class=\"dropDownCompare\"]") 
		private WebElement selectBrand3;
	  
	  
	  
	  
	  
	  
	  
	  
	  public WebElement getAdd_to_Compare1() {
		return Add_to_Compare1;
	}

	public WebElement getAdd_to_Compare2() {
		return Add_to_Compare2;
	}
	
	public WebElement getAdd_to_Compare3() {
		return Add_to_Compare3;
	}

	public WebElement getCompareButton() {
		return compareButton;
	}

	public WebElement getSelectBrand() {
		return selectBrand;
	}

	public WebElement getSelectBrand2() {
		return selectBrand2;
	}

	public WebElement getSelectBrand3() {
		return selectBrand3;
	}
	  
}

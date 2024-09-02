package Page_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	WebDriver driver;
	

	 public Home_Page(WebDriver driver) {
	
		 
		 this.driver = driver;
		 
		 PageFactory.initElements(driver, this); 
		 
	}
	
	
	 @FindBy(css = "[class=\"arrowNav\"]") 
	 private WebElement dropDown;
	 
	
	 @FindBy(xpath = "(//a[@href=\"/shop-online/computers-peripherals.html\"])[1]") 
	 private WebElement  Tablets_Computers;
	 
	
	 @FindBy(css = "[class=\"cate_mother\"]") 
	 private WebElement  Tablets;
	 
	 
	 
	 @FindBy(css = "[title=\"Non-Calling Tablets\"]") 
	 private WebElement  Non_Calling;
	 
	 
	
	 
	 
	 
	 public WebElement getDropDown() {
		return dropDown;
	}


	public WebElement getTablets_Computers() {
		return Tablets_Computers;
	}



	public WebElement getTablets() {
		return Tablets;
	}



	public WebElement getNon_Calling() {
		return Non_Calling;
	}

 
	 
}

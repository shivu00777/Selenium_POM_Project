package Page_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoncalTablets {

	WebDriver driver;
	

	  public NoncalTablets(WebDriver driver) {
	
		  
		 this.driver = driver;
		 
		 PageFactory.initElements(driver, this); 
		 
	}
	
	  @FindBy(css = "[id=\"iscod\"]") 
		private WebElement Click_COD;  	
	 		
	  
	  @FindBy(css = "[name=\"I KALL\"]") 
		private WebElement Click_Ikall ;  
	  
	 
	  @FindBy(css = "[name=\"fromPriceRange\"]") 
		private WebElement fromPriceRange ;  
	  
	  
	  @FindBy(css = "[name=\"toPriceRange\"]") 
		private WebElement toPriceRange ;  
	  
	  
	  @FindBy(css = "[onclick=\"productSearch.setPriceRange(false)\" ]") 
			private WebElement ClickonGo ; 
	  
	  
	  @FindBy(css = "[id=\"sortByFilter\"]") 
			private WebElement sort ; 
	  
	  
	  @FindBy(css = "[name=\"isexoutStock\"]") 
		private WebElement outStock ; 
	  
	  
	  
	  @FindBy(css = "[onclick=\"productSearch.setPersonalisedFilter(false);\"]") 
		private WebElement setClick ; 
	  
	  
	  //Test 4
	  
	  @FindBy(css = "[name=\"isfreeship\"]") 
		private WebElement  Products_With_Free_Shipping ; 
	  
	  @FindBy(css = "[name=\"pincode\"]") 
		private WebElement pincodeSendKeys ; 
	  
	  @FindBy(css = "[onclick=\"productSearch.setPersonalisedFilter(false);\"]") 
		private WebElement setClick2 ; 
	  
	 
	  @FindBy(linkText = "Clear All [x]") 
		private WebElement clearAllclick ; 
	  
	  
	  

	  
	  
	  
	  
	    
	  	public WebElement getClick_COD() {
		return Click_COD;
 
	}
	  
	  	public WebElement getClick_Ikall() {
		return Click_Ikall;
	}

	  	public WebElement getfromPriceRange() {
		return fromPriceRange;
	  	
	}	
		public WebElement gettoPriceRange() {
		return toPriceRange;	
	
	}
	
		public WebElement getClickonGo() {
			return ClickonGo;	
	  
	}

		public WebElement getsort() {
			return sort;	
	  
	}

		public WebElement getoutStock() {
			return outStock;	
	  
	}
		
		public WebElement getsetClick() {
			return setClick;	
	  
	}
		
		
		// Test 4
		
		public WebElement getProducts_With_Free_Shipping() {
			return Products_With_Free_Shipping;	
	  
	}
		
		public WebElement getpincodeSendKeys() {
			return pincodeSendKeys;	
	  
	}
			
		public WebElement getsetClick2() {
			return setClick2;	
	  
	}
		
		public WebElement getclearAllclick() {
			return clearAllclick;	
	  
	}
	
		
		// Search by Brand
		
		
		 @FindBy(css = "[placeholder=\"search brand\"]") 
			private WebElement brandSendKeys ; 
		
		
		 public WebElement getbrandSendKeys() {
				return brandSendKeys;	
		
		 }
		
		
		 
		 
		@FindBy(css = "src=\"//images.naptol.com/usr/local/csp/staticContent/product_images/horizontal/185x185/I-Kall-Education-&-Entertainment-Tablet-(N7)-1.jpg\"") 
			private WebElement brandClick ; 
		
		
		 public WebElement getbrandClick() {
				return brandClick;	
		
		 }
		 
		 
		 
		
		 @FindBy(css = "[name=\"iBall\"]") 
			private WebElement productClick ; 
		
		
		 public WebElement getproductClick() {
				return productClick;	
		
		 }
		
		 
		 
		 // Price

		 @FindBy(css = "[name=\"4001 - 6000\"]") 
			private WebElement Click4001_6000 ; 
		
		
		 public WebElement getClick4001_6000() {
				return Click4001_6000;	
		
		 }
		
		
		 

		 @FindBy(css = "[name=\"14001 - 22000\"]") 
			private WebElement Click14001_22000; 
		
		
		 public WebElement getClick14001_22000() {
				return Click14001_22000;	
		
		 }
		
		 
		 

		 @FindBy(css = "[name=\"fromPriceRange\"]") 
			private WebElement fromPriceRange2; 
		
		
		 public WebElement getfromPriceRange2() {
				return fromPriceRange2;	
		
		 }
		 
		
		 
		 @FindBy(css = "[name=\"toPriceRange\"]") 
			private WebElement toPriceRange2; 
		
		
		 public WebElement gettoPriceRange2() {
				return toPriceRange2;	
		
		 }
		
		 
		 
		 
		 @FindBy(xpath = "(//a[@class=\"button_1\"])[1]") 
			private WebElement clickset; 
		
		
		 public WebElement getclickset() {
				return clickset;	
		
		 }
		 
		 
		 
		 
		 
		 
		 
		 // WiFi
		 
		 @FindBy(css = "[name=\"Wi-Fi\"]") 
			private WebElement Wi_FiClcik; 
		
		
		 public WebElement getWi_FiClcik() {
				return Wi_FiClcik;	
				
		 }
		 
		 
		 
		@FindBy(css = "[id=\"sortByFilter\"]") 
			private WebElement sortByFilterSelect; 
				
				
		 public WebElement getsortByFilterSelect() {
			return sortByFilterSelect;	
		
		 }



		 
		 
		 
		 // OS
		 
		 
		 @FindBy(css = "[name=\"Android\"]") 
			private WebElement AndroidClick; 
				
				
		 public WebElement getAndroidClick() {
			return AndroidClick;	
		
		 }







		 // Processor
		 
		 @FindBy(css = "[name=\"Quad Core\"]") 
			private WebElement QuadCoreClick; 
				
				
		 public WebElement getQuadCoreClick() {
			return QuadCoreClick;	
		
		 }

		 
		 @FindBy(css = "[name=\"Single Core\"]") 
			private WebElement SingleCoreClick; 
			
			
		 public WebElement getSingleCoreClick() {
			return SingleCoreClick;	
		
		 }


		 
		 
		 
		 
		 

		 // Camera
		 
		 @FindBy(css = "[name=\"Rear + Front\"]") 
			private WebElement RearFrontClick; 
				
				
		 public WebElement getRearFrontClick() {
			return RearFrontClick;	
		
		 }
		 

		 
		 
		 
		 
		 // WishList
		 
		 @FindBy(css = "[style=\"float: right;\"]") 
			private WebElement wish2Click; 
				
				
		 public WebElement getwish2Click() {
			return wish2Click;	
		
		 }
		
		
		@FindBy(css = " [title=\"Close\"]") 
			private WebElement CloseClick; 
				
				
		 public WebElement getCloseClick() {
			return CloseClick;	
		
		 }
		 
		 
		 
		 
		 // Cart
		 
		 @FindBy(css = "[id=\"header_search_shopping_cart_count\"]") 
			private WebElement cartClick; 
				
				
		 public WebElement getcartClick() {
			return cartClick;	
		
		 }
		 
		 
		 
		 @FindBy(css = "[class=\"red_button2\"]") 
			private WebElement continueClick; 
				
				
		 public WebElement getcontinueClick() {
			return continueClick;	
		
		 }
		 
		
		 
		 
		 
		// Recent Item 
		
		 @FindBy(css = "[name=\"header_search_text\"]") 
			private WebElement recentSendkeys; 
						
						
		public WebElement getrecentSendkeys() {
			return recentSendkeys;	
				
		 }
			
		
		
		
		@FindBy(css = "[class=\"werHiring\"]") 
			private WebElement hiringClick; 
					
					
		public WebElement gethiringClick() {
			return hiringClick;	
			
	 }
		
		
		@FindBy(css = "[onclick=\"javascript:login.openTrackLink();\"]") 
		private WebElement trackorderClick; 
				
				
		public WebElement gettrackorderClick() {
		return trackorderClick;	
		
		}
		
		
		
		
		
		
		
		// Home
		
		@FindBy(css = "[class=\"bcPlusIcon\"]") 
			private WebElement homeClick; 
								
								
		public WebElement gethomeClick() {
			return homeClick;	
						
		 }
		
}

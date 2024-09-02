package Tests;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Generics.Base_Class;
import Page_Classes.Home_Page;
import Page_Classes.NoncalTablets;




public class Final_Test extends Base_Class {
	
	NoncalTablets Noncal_Tablets;
	
	Home_Page HomePage; 
	
	Page_Classes.Compare compare;
	
	
	
	
	
	// ScreenShot Method
	public  void captureScreenshot(WebDriver driver, int A) throws IOException {
		TakesScreenshot Ss = (TakesScreenshot)driver;
		
		// Using getscreenshotAs() Function to take screenshot in Tests

		File screenShot = Ss.getScreenshotAs(OutputType.FILE);
		
		File Screenshot = new File("/Users/shivamsharma/eclipse-workspace/Selenium_POM_Project/target/Screenshot"+A+".png");
		
		FileUtils.copyFile(screenShot, Screenshot); 
	}
	
	
	
	
	// Startup Method
	public void start_up() {
		
		// Home_Page Elements
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		HomePage = new Home_Page(driver);
		
		Noncal_Tablets = new NoncalTablets(driver);
		
		compare = new Page_Classes.Compare(driver);
		
		HomePage.getDropDown().click();

		HomePage.getTablets_Computers().click();
				
		HomePage.getTablets().click();

		HomePage.getNon_Calling().click();
		
	}
	
	
	


	@Test(priority = 1)
	public void filter_1() throws InterruptedException, IOException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		test.log(LogStatus.PASS, "Opening Non_calling tablets");
		
		Noncal_Tablets = new NoncalTablets(driver);
		
		start_up();
		
		// NoncalTablets Page Elements
		
		Noncal_Tablets.getClick_COD().click();
		
		Noncal_Tablets.getClick_Ikall().click();

		Noncal_Tablets.getfromPriceRange().sendKeys(From_val);

		Noncal_Tablets.gettoPriceRange().sendKeys(to_val);

		Noncal_Tablets.getClickonGo().click();
		
		Thread.sleep(2000);
				
		
		captureScreenshot(driver, 1);
		
		
	}
	
	
	
	@Test(priority = 2)
	public void filter_2() throws InterruptedException, IOException {
	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Noncal_Tablets = new NoncalTablets(driver);
		
		HomePage = new Home_Page(driver);
		
		start_up();
		
		// NoncalTablets Page Elements
				
		Noncal_Tablets.getoutStock().click();
		
		Noncal_Tablets.getsetClick().click();
		
		
		// Assertion
		
		Assert.assertEquals(driver.findElement(By.cssSelector("[class=\"errorMsg\"]")).getText(),"No product found for this filter combination, remove some of the filters to see products");
		
		
		captureScreenshot(driver, 2);
		
	}
	
	
	
	
	
	@Test(priority = 3)
	public void filter_3() throws InterruptedException, IOException  {
	
		start_up();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		// Short item through dropDown
		WebElement dropdown = Noncal_Tablets.getsort();
		Select select = new Select(dropdown);
		select.selectByVisibleText("Most Popular");

	
		// Assertion
		Assert.assertEquals(driver.findElement(By.cssSelector("[id=\"loading_Pagination\"]")).getText(),"No more results to display.");
	
		captureScreenshot(driver, 3);
		
	}

	
	
	
	@Test(priority = 4)
	public void filter_4() throws InterruptedException, IOException  {
		
		start_up();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Noncal_Tablets.getProducts_With_Free_Shipping().click();
		
		Noncal_Tablets.getpincodeSendKeys().sendKeys(Pincode);
		
		Noncal_Tablets.getsetClick2().click();
		
		Noncal_Tablets.getclearAllclick().click();
		
		Assert.assertEquals(driver.findElement(By.cssSelector("[id=\"loading_Pagination\"]")).getText(),"No more results to display.");

		captureScreenshot(driver, 4);
	}
	
	
	
	
	@Test(priority = 5)
	public void Compare() throws InterruptedException  {
		
		start_up();
		
		test.log(LogStatus.PASS, "Opening Non_calling tablets");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		compare.getAdd_to_Compare1().click();
		
		compare.getAdd_to_Compare2().click();
		
		compare.getCompareButton().click();
		
		WebElement dropdown = compare.getSelectBrand();
		Select select = new Select(dropdown);
		select.selectByVisibleText("I KALL");
		
		WebElement dropdown2 = compare.getSelectBrand2();
		Select select2 = new Select(dropdown2);
		select2.selectByVisibleText("iBall");
		
		Assert.assertEquals(driver.findElement(By.linkText("I Kall Education & Entertainment Tablet (N7)")).getText(),"I Kall Education & Entertainment Tablet (N7)");
	
		Assert.assertEquals(driver.findElement(By.linkText("I Kall Entertainment & Education Wi-Fi Tablet with")).getText(),"I Kall Entertainment & Education Wi-Fi Tablet with");
		
		Assert.assertNotEquals(driver.findElement(By.linkText("I Kall Entertainment & Education Wi-Fi Tablet with")).getText(),"I Kall  & Education Wi-Fi Tablet with");
		
		Thread.sleep(2000);
		
	}
		
	
	
	
	@Test(priority = 6)
	public void Compare2() throws InterruptedException  {
		
		start_up();
		
		test.log(LogStatus.PASS, "Opening Non_calling tablets");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		compare.getAdd_to_Compare1().click();
		
		compare.getAdd_to_Compare2().click();
		
		compare.getAdd_to_Compare3().click();
		
		compare.getCompareButton().click();
		
		WebElement dropdown = compare.getSelectBrand3();
		Select select = new Select(dropdown);
		select.selectByVisibleText("iBall");
	
		Assert.assertEquals(driver.findElement(By.linkText("iBall Tablet Slide i7011")).getText(),"iBall Tablet Slide i7011");
		
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 7)
	public void Brands() throws InterruptedException, IOException  {
		
		start_up();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Noncal_Tablets.getbrandSendKeys().sendKeys(Brand);
		
		Actions act = new Actions(driver);
		
		WebElement item = driver.findElement(By.cssSelector("[src=\"//images.naptol.com/usr/local/csp/staticContent/product_images/horizontal/185x185/I-Kall-Education-&-Entertainment-Tablet-(N7)-1.jpg\"]"));
		
		act.moveToElement(item).build().perform();
		
		act.click(item).build().perform();
		
		captureScreenshot(driver, 9);
		
	}
	
	@Test(priority = 8)
	public void Price() throws InterruptedException  {
		
		start_up();
		
		test.log(LogStatus.PASS, "Opening Non_calling tablets");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Noncal_Tablets.getClick4001_6000().click();
		
		Noncal_Tablets.getClick4001_6000().click();

		Noncal_Tablets.getClick14001_22000().click();
				
		Noncal_Tablets.getClick14001_22000().click();
		
		Noncal_Tablets.getfromPriceRange2().sendKeys(From_val2);
		
		Noncal_Tablets.gettoPriceRange2().sendKeys(to_val2);
		
		Noncal_Tablets.getclickset().click();
		
		Assert.assertEquals(driver.findElement(By.cssSelector("[id=\"loading_Pagination\"]")).getText(),"No more results to display.");
		
		
		
	}

	
	
	
	
	@Test(priority = 9)
	public void Features() throws InterruptedException  {
	
		start_up();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Noncal_Tablets.getWi_FiClcik().click();
		
		Thread.sleep(1000);
		
		WebElement dropdown = Noncal_Tablets.getsortByFilterSelect();
		Select select = new Select(dropdown);
		select.selectByVisibleText("Highest Rated");
		
		Assert.assertNotEquals(driver.findElement(By.cssSelector("[id=\"loading_Pagination\"]")).getText(),"No more  to display.");
	
		Thread.sleep(1000);
		
	}
	
	
	
	
	
	@Test(priority = 9)
	public void OS() throws InterruptedException, IOException  {
		
		start_up();
		
		test.log(LogStatus.PASS, "Opening Non_calling tablets");
		
		Noncal_Tablets.getAndroidClick().click();
		
		captureScreenshot(driver, 5);
		
	}
	
	
	
	
	
	
	@Test(priority = 10)
	public void Processor() throws InterruptedException, IOException  {
		
		start_up();
		
		test.log(LogStatus.PASS, "Opening Non_calling tablets");
		
		Noncal_Tablets.getQuadCoreClick().click();
		
		Thread.sleep(1000);
		
		Noncal_Tablets.getQuadCoreClick().click();
		
		Thread.sleep(1000);
	
		Noncal_Tablets.getSingleCoreClick().click();
		
		Thread.sleep(1000);
		
		Noncal_Tablets.getSingleCoreClick().click();
		
		Thread.sleep(1000);
		
		captureScreenshot(driver, 6);
		
	}



	
	
	@Test(priority = 11)
	public void Camera() throws InterruptedException, IOException  {
		
		start_up();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Noncal_Tablets.getRearFrontClick().click();
		
		captureScreenshot(driver, 7);
		
	
	}
		
		

	@Test(priority = 12)
	public void Wishlist() throws InterruptedException  {
		
		start_up();
		
		Noncal_Tablets.getRearFrontClick().click();
		
		Thread.sleep(1000);
		
		Noncal_Tablets.getwish2Click().click();
		
		Thread.sleep(1000);
		
		Noncal_Tablets.getCloseClick().click();

		Thread.sleep(1000);
	}



	

	@Test(priority = 13)
	public void cart() throws InterruptedException  {
		
		start_up();
		
		test.log(LogStatus.PASS, "Opening Non_calling tablets");
		
		Noncal_Tablets.getcartClick().click();

		Thread.sleep(1000);		
				
		Noncal_Tablets.getcontinueClick().click();
		
		Thread.sleep(1000);		
		
		
	}


	
	
	
	
	@Test(priority = 14)
	public void recent() throws InterruptedException  {
		
		start_up();
 
		Noncal_Tablets.getrecentSendkeys().sendKeys(Search);

		Thread.sleep(1000);
		
		
		Noncal_Tablets.gethiringClick().click();
		
		Thread.sleep(1000);
		
		Noncal_Tablets.gettrackorderClick().click();
		
		Thread.sleep(1000);
		
		Noncal_Tablets.getCloseClick().click();

		Thread.sleep(1000);
		
	}


	@Test(priority = 15)
	public void home() throws InterruptedException, IOException  {
		
		start_up();
		
		Noncal_Tablets.gethomeClick().click();
		
		Thread.sleep(1000);
		
		captureScreenshot(driver, 8);
		
		
	}
		
		













}

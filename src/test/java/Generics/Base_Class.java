package Generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Base_Class {
	
	
	protected WebDriver driver;
	
	protected String webSiteURL;
	protected String From_val;
	protected String to_val;
	protected ExtentReports report;
	protected String Pincode;
	protected ExtentTest test;
	protected String Brand;
	protected String From_val2;
	protected String to_val2;
	protected String Search;
	
	
	@BeforeClass
	public void configReport() {
	
		report = new ExtentReports("/Users/shivamsharma/eclipse-workspace/Selenium_POM_Project/target/report.html");
		test = report.startTest("Noncallingtabletsreport");
		
	}
	
	
	
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		
		test.log(LogStatus.PASS, "Browser is opening");
		
		driver = new ChromeDriver();
		
		Properties properties = new Properties();
		
		FileInputStream File = new FileInputStream("/Users/shivamsharma/eclipse-workspace/Selenium_POM_Project/src/test/resources/Config.properties");
		
		
		properties.load(File);
		webSiteURL = properties.getProperty("URL");
		From_val = properties.getProperty("from_val");
		to_val = properties.getProperty("to_val");
		Pincode = properties.getProperty("pincode");
		Brand = properties.getProperty("brand");
		From_val2 = properties.getProperty("from_val2");
		to_val2 = properties.getProperty("to_val2");
		Search = properties.getProperty("search");
		
		
		Thread.sleep(2000);
		
		test.log(LogStatus.PASS, "Url entered");
		
		driver.get(webSiteURL);
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
		
	}


	@AfterClass
public void flush() {
		
		report.flush();	
		
		report.endTest(test);
		
	}
	
}

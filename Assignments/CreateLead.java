package week2.day1.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {

		// To Set Path for Driver
		WebDriverManager.chromedriver().setup();
		// step 1:Launch the ChromeBrowser
		ChromeDriver driver = new ChromeDriver();
		// step 2:Launch the application
		// URL Loading(leafTap)
		driver.get("http://leaftaps.com/opentaps/control/login");
		// step3:To maximize the window
		driver.manage().window().maximize();
		// step 4:find the user name and value
		// sendKeys pass the input value
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		// step5: Find the password and value
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// step6:find the login button and click
		driver.findElement(By.className("decorativeSubmit")).click();
		// step7:Click the CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		// click the lead
		driver.findElement(By.linkText("Leads")).click();
		// click create lead
		driver.findElement(By.linkText("Create Lead")).click();
		// Give input to Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		// Give First name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aysha");
		// Give Last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Patkar");
		//Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		//Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Wanna work as employee");
		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("makecareer@tesleaf.com");
		//Select State/Province as NewYork Using Visible Text
		WebElement dropDown5 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));// ctrl+2+l
		Select source5 = new Select(dropDown5);
		source5.selectByVisibleText("India");
		// Select value as Employee in Source Using SelectbyVisible text
		WebElement dropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));// ctrl+2+l
		Select source = new Select(dropDown);
		source.selectByVisibleText("Employee");
		// Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValuee
		WebElement dropDown1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select source1 = new Select(dropDown1);
		source1.selectByValue("9001");
		//  Select value as Corporation in OwnerShip field Using SelectbyIndex
		WebElement dropDown2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select source2 = new Select(dropDown2);
		source2.selectByIndex(5);
		// Select value as India in Country Field Using SelectbyVisibletext
		WebElement dropDown4 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));// ctrl+2+l
		Select source4 = new Select(dropDown4);
		source4.selectByVisibleText("India");
		// click the create lead button through locator
		driver.findElement(By.className("smallSubmit")).click();
		// get the title in resulting page
		System.out.println(driver.getTitle());
	}
}

package week2.day1.classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeDropdown {
	public static void main(String[] args) {

		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		// 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		// 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// 5. Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();

		// 6. Click on create Lead Button
		driver.findElement(By.linkText("Create Lead")).click();

		// 7. Enter CompanyName using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		// 8. Enter FirstName using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aysha");

		// 9. Enter LastName using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Patkar");

		// 10. Select value as Employee in Source Using SelectbyVisible text
		WebElement dropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));// ctrl+2+l
		Select source = new Select(dropDown);
		source.selectByVisibleText("Employee");

		// 11. Select value as Pay Per Click Advertising in MarketingCampaignId Using
		// SelectbyValue
		WebElement dropDown1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select source1 = new Select(dropDown1);
		source1.selectByValue("9001");

		// 12.Select value as Telecommunications from the bottom (size-2) in Industry
		// using SelectByIndex
		// WebElement dropDown3 =
		// driver.findElement(By.id("createLeadForm_industryEnumId"));
		// Select source3 = new Select(dropDown3);
		// source3.selectByIndex(index);

		// 13. Select value as Corporation in OwnerShip field Using SelectbyIndex
		WebElement dropDown2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select source2 = new Select(dropDown2);
		source2.selectByIndex(5);

		// 14. Select value as India in Country Field Using SelectbyVisibletext
		WebElement dropDown4 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));// ctrl+2+l
		Select source4 = new Select(dropDown4);
		source4.selectByVisibleText("India");

		// 15. Click on create Lead Button Using name Locator
		driver.findElement(By.name("")).click();

		// 16. Get the Title of the resulting Page
		System.out.println(driver.getTitle());
	}
}
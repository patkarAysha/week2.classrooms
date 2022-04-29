package week2.day1.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) {

		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		// ChromeDriver driver=new ChromeDriver();
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
		// 5. Click on Accounts Button
		driver.findElement(By.linkText("Accounts")).click();
		// . Click on Create Account
		driver.findElement(By.linkText("Create Account")).click();
		// 7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		// 8. Enter DEscriptiion as "Selenium Automation Tester"
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		// 9. Enter LocalName Field Using Xpath Locator
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Not Applicable");
		// 10. Enter SiteName Field Using Xpath Locator
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Do not Know");
		// 11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
		// ###driver.findElement(By.xpath("//td[@class='titleCell' and @id='annualRevenue']")).sendKeys("2L");

		// 12. Select Industry as ComputerSoftware
		WebElement dropDown = driver.findElement(By.name("industryEnumId"));// ctrl+2+l
		Select source = new Select(dropDown);
		source.selectByVisibleText("Computer Software");
		// 13. Select OwnerShip as S-Corporation using SelectByVisibletext
		WebElement dropDown1 = driver.findElement(By.name("ownershipEnumId"));// ctrl+2+l
		Select source1 = new Select(dropDown1);
		source1.selectByVisibleText("S-Corporation");
		// 14. Select Source as Employee using SelectByValue
		WebElement dropDown2 = driver.findElement(By.id("dataSourceId"));// ctrl+2+l
		Select source2 = new Select(dropDown2);
		source2.selectByValue("LEAD_EMPLOYEE");
		// 15. Select Marketing Campaign as eCommerce Site Internal Campaign using
		// SelectbyIndex
		WebElement dropDown3 = driver.findElement(By.id("marketingCampaignId"));
		Select source3 = new Select(dropDown3);
		source3.selectByIndex(6);
		// 16. Select State/Province as Texas using SelectByValue
		WebElement dropDown4 = driver.findElement(By.id("generalStateProvinceGeoId"));// ctrl+2+l
		Select source4 = new Select(dropDown4);
		source4.selectByValue("TX");
		// 17. Click on Create Account using Xpath Locator
		driver.findElement(By.className("smallSubmit")).click();
	}

}
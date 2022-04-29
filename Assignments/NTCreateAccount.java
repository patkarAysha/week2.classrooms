package week2.day1.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		WebElement dropDown = driver.findElement(By.id("currencyUomId"));
		Select source = new Select(dropDown);
		source.selectByValue("INR");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("NRI Account");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Not Applicable");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Do not Know");
		driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("10000");

		// 12. Select Industry as ComputerSoftware
		WebElement dropDown1 = driver.findElement(By.name("industryEnumId"));//ctrl+2+l
	    Select source1 = new Select(dropDown1);
	    source1.selectByVisibleText("Computer Software");
		// 13. Select OwnerShip as S-Corporation using SelectByVisibletext
	    WebElement dropDown2 = driver.findElement(By.name("ownershipEnumId"));//ctrl+2+l
	    Select source2 = new Select(dropDown2);
	    source2.selectByVisibleText("S-Corporation");
		// * 14. Select Source as Employee using SelectByValue
	    WebElement dropDown3 = driver.findElement(By.id("dataSourceId"));//ctrl+2+l
	    Select source3 = new Select(dropDown3);
	    source3.selectByValue("LEAD_EMPLOYEE");

		// 15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
	    WebElement dropDown4 =driver.findElement(By.id("marketingCampaignId"));
	    Select source4 = new Select(dropDown4);
	    source4.selectByIndex(6);
		// * 16. Select State/Province as Texas using SelectByValue
	    WebElement dropDown5 = driver.findElement(By.id("generalStateProvinceGeoId"));//ctrl+2+l
	    Select source5 = new Select(dropDown5);
	    source5.selectByValue("TX");
		/*
		 * 17. Click on Create Account using Xpath Locator
		 * 
		 * 18. Get the Text of Error Message Displayed (hint: Red Texts)
		 */

	}

}
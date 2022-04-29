package week2.day1.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {

	public static void main(String[] args) {

		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		// 2. Enter UserName and Password Using Id Locator
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		// 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// 5. Click on Accounts Button
		driver.findElement(By.linkText("Accounts")).click();

		// 6. Click on Find Accounts
		driver.findElement(By.linkText("Find Accounts")).click();

		// 7. Enter AccountName as "Credit Limited Account"
		//driver.findElement(By.xpath("//input[@name='accountName']")).sendKeys("Credit Limited Account");
		//input[@name='accountName']
		//8. Click on Find Accounts using xpath Locator
		driver.findElement(By.xpath("//input[@id='selected']")).click();
		driver.findElement(By.linkText("href=\"/crmsfa/control/viewAccount?partyId=accountlimit100\"")).click();
		// 9. Click on the edit Button
		driver.findElement(By.linkText("href=\"/crmsfa/control/updateAccountForm?partyId=accountlimit100\"")).click();
		//10. Get the Text of Account Name and verify

		
		/*
		 * 
		 * 
		 * /*
		 * 
		 * /* 
		 * 
		 * /* 11. Get the Text of Description
		 * 
		 * /* 12. Get the title of the page and verify it.
		 */

	}

}
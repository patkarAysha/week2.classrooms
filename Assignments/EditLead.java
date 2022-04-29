package week2.day1.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {

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
		// Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		// Enter Description Field Using any Locator of your choice
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Wanna work as employee");
		// Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("makecareer@tesleaf.com");
		// Select State/Province as NewYork Using Visible Text
		WebElement dropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select source = new Select(dropDown);
		source.selectByVisibleText("New York");
		// click the create lead button through locator
		driver.findElement(By.className("smallSubmit")).click();
		// Click on edit button
		driver.findElement(By.className("subMenuButton")).click();
		// Clear the Description Field using .clear()
		driver.findElement(By.id("createLeadForm_description")).clear();
		// Fill ImportantNote Field with Any text
		driver.findElement(By.name("importantNote")).sendKeys("Plz pay attention");
		// Click on update button
		driver.findElement(By.className("smallSubmit")).click();
		// Get the Title of Resulting Page. refer the video using driver.getTitle()
		System.out.println(driver.getTitle());
		// Click on Duplicate button
		driver.findElement(By.linkText("Duplicate Lead")).click();
		// Clear the CompanyName Field using .clear() And Enter new CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafGround");
		// Click on Create Lead Button
		driver.findElement(By.className("smallSubmit")).click();
		// Get the Title of Resulting Page(refer the video) using driver.getTitle()
		System.out.println(driver.getTitle());
	}
}
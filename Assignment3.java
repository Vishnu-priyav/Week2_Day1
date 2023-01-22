package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();	
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vishnupriya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("VK");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vishnu");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computerscience");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Learn Selenium");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vishnupriya1@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vishnu");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());		


	}

}

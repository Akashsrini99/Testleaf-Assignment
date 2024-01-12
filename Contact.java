package week.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Contact {

	public static void main(String[] args) {
		//To open chrome browser
		ChromeDriver driver =new ChromeDriver();
		//To Load the link
	    driver.get("http://leaftaps.com/opentaps/control/login");
	    //To maximize the chrome window
	    driver.manage().window().maximize();
	    //To Enter the username and password
	    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    //To click the submit button
	    driver.findElement(By.className("decorativeSubmit")).click();
	    //To click the link to go into next page
	    driver.findElement(By.partialLinkText("CRM/SFA")).click();
	    //To click the contact link
	    driver.findElement(By.linkText("Contacts")).click();
	    //To click the create contact link
	    driver.findElement(By.linkText("Create Contact")).click();
	    //To Enter the first name,last name,first local name
	    driver.findElement(By.id("firstNameField")).sendKeys("Akash");
	    driver.findElement(By.id("lastNameField")).sendKeys("S");
	    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Ak");
	    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("S");
	    driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Marketing Sales");
	    driver.findElement(By.id("createContactForm_description")).sendKeys("Availability Of Courses");
	    driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Ak1@gamil.com");
	    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Ak");
	    WebElement source=driver.findElement(By.name("generalStateProvinceGeoId"));
	    Select obj=new Select(source);
	    obj.selectByVisibleText("New York");
	    driver.findElement(By.name("submitButton")).click();
	    driver.findElement(By.linkText("Edit")).click();
	    driver.findElement(By.id("updateContactForm_description")).clear();
	    driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Details Changed");
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    String title=driver.getTitle();
	    System.out.println(title);
	}

}

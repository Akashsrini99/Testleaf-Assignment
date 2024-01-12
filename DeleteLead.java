package week.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//To open chrome browser
				ChromeDriver driver =new ChromeDriver();
				//To Load the link
			    driver.get("http://leaftaps.com/opentaps/control/login");
			    //To maximize the chrome window
			    driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			    //To Enter the username and password
			    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			    driver.findElement(By.id("password")).sendKeys("crmsfa");
			    //To click the submit button
			    driver.findElement(By.className("decorativeSubmit")).click();
			    //To click the link to go into next page
			    driver.findElement(By.partialLinkText("CRM/SFA")).click();
			    //To click the Lead link
			    driver.findElement(By.linkText("Leads")).click();
			    driver.findElement(By.linkText("Find Leads")).click();
			    driver.findElement(By.xpath("//span[text()='Phone']")).click();
			    driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
			    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			  Thread.sleep(2000);
			   WebElement Text=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
			   String text=Text.getText();
			   Text.click();
			   // driver.findElement(By.xpath("//a[text()='Delete']")).click();
			    
			    driver.findElement(By.linkText("Find Leads")).click();
			    driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
			    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			    
			    String record = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
				System.out.println(record);
				
				if(record.contains("No records")) {
					System.out.println("Deleted");
				}
				else {
					System.out.println("Not deleted");
				}

			    
	}

}

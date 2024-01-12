package week.day3;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	 
	    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Nalini");
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    driver.findElement(By.xpath("//a[text()='10069']")).click();
	    
	    String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		String companyName = "Techy Savage";
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		String verifyCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
        if (companyName.equals(verifyCompanyName)) {
			System.out.println("verified");
		}
		else {
			System.out.println("not verified");
		}
		driver.close();
		System.out.println("Browser is closed");
	}

}

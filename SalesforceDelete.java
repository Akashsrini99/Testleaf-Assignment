package week.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class SalesforceDelete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Qeagle@123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		WebElement element = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click();", element);
		Thread.sleep(600);
		driver.findElement(By.xpath("//input[@name='Account-search-input']")).sendKeys("Akash Dev",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Akash Dev']")).click();
		
		driver.findElement(By.xpath("//span[text()='Show more actions']/preceding-sibling::lightning-primitive-icon")).click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("(//span[@dir='ltr']/parent::button)[4]")).click();
		System.out.println("Account Deleted");
}
}



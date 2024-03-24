package week.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class SalesforceEdit {

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
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='Account-search-input']")).sendKeys("Akash",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Akash']")).click();
		
		driver.findElement(By.xpath("//span[text()='Show more actions']/preceding-sibling::lightning-primitive-icon")).click();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).clear();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Akash Dev");
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
		driver.close();
}
}



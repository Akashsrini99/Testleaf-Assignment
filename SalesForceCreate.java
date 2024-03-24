package week.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SalesForceCreate {

	public static void main(String[] args) {
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
		
		WebElement element1 = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click();", element1);
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Akash");
		WebElement element2 = driver.findElement(By.xpath("//legend [text()='Shipping Address']"));
		Actions builder = new Actions(driver);
		builder.scrollToElement(element2).perform();
		
		driver.findElement(By.xpath("(//span[text()='--None--'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Public']")).click();
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
		String text = driver.findElement(By.xpath("//lightning-formatted-text[text()='Akash']")).getText();
		if (text.equals("Akash")) {
			System.out.println("Account Verified");
		}else
			System.out.println("Account Not Verified");
	}

}

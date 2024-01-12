package week.day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		//To Load the link
	    driver.get("http://www.amazon.in/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("5G Mobiles",Keys.ENTER);
	    Thread.sleep(5000);
		List<WebElement> priceList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		for (int i=0; i<priceList.size(); i++) {
			System.out.println(priceList.get(i).getText());
		}
		driver.close();
	}

}

package week.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		//To Load the link
	    driver.get("https://www.myntra.com/");
	    driver.manage().window().maximize();
	    
	    WebElement Kid=driver.findElement(By.xpath("//a[text()='Kids']"));
	    Actions actions=new Actions(driver);
	    actions.moveToElement(Kid).perform();
	    
	    driver.findElement(By.xpath("//a[text()='Shirts']")).click();
	    
	    Thread.sleep(5000);
		List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		List<Integer> mobileprice=new ArrayList<Integer>();
		for (int i=0; i<priceList.size(); i++) {
			
			String text=priceList.get(i).getText();
			String replace=text.replaceAll("[^0-9]","");
			int parseInt=Integer.parseInt(replace);
			System.out.println(replace);
			mobileprice.add(parseInt);
		}
		Integer min=Collections.min(mobileprice);
		System.out.println("Minimum price: "+min);
		
		Integer max=Collections.max(mobileprice);
		System.out.println("Minimum price: "+max);
	}
	}



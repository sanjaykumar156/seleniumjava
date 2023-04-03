package assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.utility.RandomString;

public class TestAdvisor {

	public static void main(String[] args) {
	
		
		//open the chromebrowser
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tripadvisor.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("Club Mahindra",Keys.ENTER);
		 
		 driver.findElement(By.xpath("//span[normalize-space()='Club Mahindra Madikeri, Coorg']")).click();
		 
		 driver.findElement(By.xpath("//span[@class='biGQs _P ttuOS'][normalize-space()='Review']")).click();
		 
		 Set<String>  windowids = driver.getWindowHandles();
		 System.out.println(windowids);
		 List<String> ids = new ArrayList(windowids);
		 
		 String parentid = ids.get(0);
		 String childid = ids.get(1);
		 
		 driver.switchTo().window(childid);
		 driver.findElement(By.xpath("//span[@class='biGQs _P ttuOS'][normalize-space()='Review']")).click();
		//span[@class='HYSjf u']//label[1]//*[name()='svg']//*[name()='path' and contains(@d,'M 12 0C5.3')]
		//span[@class='HYSjf u']//label[2]//*[name()='svg']//*[name()='path' and contains(@d,'M 12 0C5.3')]
		
		 Actions action = new Actions(driver);
		 WebElement we =  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/span[1]/span[1]/label[2]/*[name()='svg'][1]/*[name()='path'][1]"));
		 action.moveToElement(we).click().build().perform();
		 
		 
		 WebElement random = driver.findElement(By.xpath("//textarea[@id='review-text']"));
		RandomString.make(5);
		 driver.quit();
		
		 
		 
		 
		 
		
	}

}

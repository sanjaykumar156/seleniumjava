package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions act = new Actions(driver);
		
		WebElement bank = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement Account = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		
		//amount account in debit side
		
		WebElement firstamount = driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		WebElement debtamount = driver.findElement(By.cssSelector("ol[id='amt7'] li[class='placeholder']"));
		
		//credit side
		WebElement secondamount = driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
		WebElement secondaccount = driver.findElement(By.cssSelector("ol[id='amt8'] li[class='placeholder']"));
		
		//sales
		
		WebElement sales= driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
		WebElement salesaccount = driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
		
		act.dragAndDrop(bank, Account).build().perform();
		act.dragAndDrop(firstamount, debtamount).build().perform();
		act.dragAndDrop(secondamount, secondaccount).build().perform();
		act.dragAndDrop(sales, salesaccount).build().perform();
				
		
	
	

	}

}

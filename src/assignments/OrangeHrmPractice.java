package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrmPractice {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	     
	     
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     driver.findElement(By.name("username")).sendKeys("Admin");
	     driver.findElement(By.name("password")).sendKeys("admin123");
	     driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	     
	     
	     //validation
	     String actualtext = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).getText();
	     
	     
	     if(actualtext.equals("Dashboard")) {
	    	 System.out.println("test passed");
	     }else {
	    	 driver.quit();
	     }
	     
	     driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[1]/a")).click();
	     JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("window.scrollBy(0,250);");
//	     try {
//	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox']"))).click();
	    List< WebElement> sel = driver.findElements(By.xpath("//input[@type='checkbox']"));
	     
	     
	    
			System.out.println(sel);
//			js.executeScript("arguments[0].click();", sel);
			for(WebElement we:sel){
				js.executeScript("arguments[0].click();", sel);
				}
//			 for(int i = 0; i<sel.size(); i++) {
//				
//				 sel.get(i).click();
//				
//			 }
//	     }catch(Exception e){
//	    	System.out.println(e.getCause());
//	    	 e.getStackTrace();
//	    	 
//	     }
	     
	   WebElement username=   driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']"));
	     username.sendKeys("sanjay");
//	     WebElement drp = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]"));
//	     Select drop = new Select(drp);
//	     drop.selectByVisibleText("Admin");
	     driver.findElement((By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]"))).click();
	     List<WebElement> drp = driver.findElements(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]"));
	     drp.size();
//	     for(int j=0; j<drp.size(); j++) {
//	    	 drp.get(i).getText().equals("Admin");
//	    	 drp.get(i).click();
	     }
	

	}


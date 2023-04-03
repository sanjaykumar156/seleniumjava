package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

public class New {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--focus']")).click();
		List<WebElement> drp = driver.findElements(By.xpath("//div[@role='option']"));
		drp.size();
		for (int i = 0; i < drp.size(); i++) {
			drp.get(i).getText().equals("Part-Time Internship");
			drp.get(i).click();

		}
	}

}

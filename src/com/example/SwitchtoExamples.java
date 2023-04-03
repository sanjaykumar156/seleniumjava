package com.example;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoExamples {

	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("testing");
		driver.findElement(By.className("wikipedia-search-button")).click();
		
		List<WebElement> searchresult = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
		System.out.println(searchresult.size());
		
		for(WebElement links: searchresult) {
			System.out.println(links.getText());
			links.click();
			
		}
		Set<String> windowids = driver.getWindowHandles();
		for(String wind: windowids) {
			String title=driver.switchTo().window(wind).getTitle();
			System.out.println(title);
		}
		driver.quit();
	
		
		
		

	}

}

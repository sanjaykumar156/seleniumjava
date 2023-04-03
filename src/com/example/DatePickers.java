package com.example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickers {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		
		driver.get("http://webdriveruniversity.com/Datepicker/index.html");
		driver.manage().window().maximize();
		
		
		
		String monthyear = "March 2024";
		String day = "20";
		
		driver.findElement(By.xpath("//input[@type='text']")).click();
		
		
		
		while(true) {
			String yr = driver.findElement(By.xpath("//div[1]//th[@class='datepicker-switch']")).getText();
			System.out.println(yr);
			
		
			
			if(yr.equals(monthyear)) {
				break;
			}
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][normalize-space()='»']")).click();
		}
		
		
		List<WebElement> date = driver.findElements(By.xpath("//tbody/tr/td[@class='today day'  or @class='day' or @class='active day']"));
		
		for(int i =0; i<date.size(); i++) {
			if(date.get(i).getText().equals(day)) {
				date.get(i).click();
				break;
			}
			
			
			
		}
		driver.quit();
//		for(WebElement all: date) {
//			if(all.getText().equals(day)) {
//				all.click();
//				break;
//			}
//		}

	}

}

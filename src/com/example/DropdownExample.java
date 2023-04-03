package com.example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.abhibus.com/");
		WebElement drop = driver.findElement(By.xpath("//li/a[1][@role='button']"));
		Select drp = new Select(drop);
		drp.selectByVisibleText("Print Booking");
//		List<WebElement> abhi = driver.findElements(By.xpath("//li/a[1][@role='button']"));
//		System.out.println(abhi.size());
//		
//		for(int i=0; i<abhi.size(); i++) {
//			if(abhi.get(i).getText().equals("Print Booking")) {
//				abhi.get(i).click();
		//tbody/tr/td[6]
//			}
//			
//		}

	}

}

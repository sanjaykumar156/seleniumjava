package com.example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://arms.sse.saveetha.com/Login.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
				

		driver.findElement(By.id("txtusername")).sendKeys("191812014");
		driver.findElement(By.id("txtpassword")).sendKeys("reach");
		driver.findElement(By.id("btnlogin")).click();
		driver.findElement(By.linkText("My Profile")).click();
		driver.findElement(By.linkText("Edit Profile")).click();
		driver.findElement(By.xpath("//select[@id='cphbody_ddlGraduationType']//option")).click();
		
			List<WebElement> course = driver.findElements(By.xpath("//select[@id='cphbody_ddlGraduationType']//option"));	
			System.out.println(course.size());
			course.size();
			for(int i=0; i<course.size(); i++) {
				if(course.get(i).getText().equals("ELECTRONIC AND COMMUNICATION ENGINEERING")) {
					course.get(i).click();

				
				
				 }
		
			}
		
		
		
		
		
		
		
		
//		List<WebElement> ele = driver.findElements(By.xpath("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));
//		System.out.println(ele.size());
//		for(int i=0; i<4; i++) {
		
//			ele.get(i).click();
			
			
		}
	

	}



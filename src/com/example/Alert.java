package com.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Alert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		//alert with accept and dismiss
//		driver.findElement(By.xpath("//li[2]/button")).click();
//		wait.until(ExpectedConditions.alertIsPresent());
//		org.openqa.selenium.Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.dismiss();
//		driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		//alert with textbox
		
		driver.findElement(By.xpath("//li[3]/button")).click();
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		
		
		alert.sendKeys("sanjay you are very talanted");
		alert.accept();
		String actualtext = driver.findElement(By.xpath("//p[@id='result']")).getText();
		String expectedtext = "You entered: sanjay you are very talanted";
		
		if(actualtext.equals(expectedtext)) {
			System.out.println("test passed" +actualtext);
		}else {
			System.out.println("test failed");
		}
		 

	}

}

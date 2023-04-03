package com.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttentucationPopup {

	public static void main(String[] args) {
		//http://Admin:admin123@the-internet.herokuapp.com/basic_auth
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		String text = driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')]")).getText();
		if(text.contains("Congratulations! You must have the proper credentials.")) {
			System.out.println("test passed");
		}else {
			System.out.println("test failed");
		}
		

	}

}

package com.example;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BlazeDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		String actualtext = driver.findElement(By.xpath("//div[@class='container']/h1")).getText();
		String expectedtext = "Welcome to the Simple Travel Agency!";
		
		if(actualtext.equals(expectedtext)) {
			System.out.println("test passed");
		}else {
			driver.quit();
		}
		
		WebElement drp =  driver.findElement(By.name("fromPort"));
		Select dropdown = new Select(drp);
		dropdown.selectByVisibleText("Paris");
		
		WebElement drp1 = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select dp1 = new Select(drp1);
		dp1.selectByVisibleText("London");
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		//tbody/tr["+r+"]/td[6]
		
		int rows=driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
		System.out.println("number of rows in table:"+rows); //5
	
	//6 - capture prices then store in array
		
		String pricesArr[]=new String[rows];   //0-4
		
		for(int r=1;r<=rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[6]")).getText();
			pricesArr[r-1]=price; //adding price into array
		}
		
	//7- Sort prices then find lower price value
		
		for(String arrvalue:pricesArr)
		{
			System.out.println(arrvalue);
		}
		
		Arrays.sort(pricesArr); // this will able to sort strings. so no need to convert to number
		String lowestPrice=pricesArr[0];
		System.out.println("Lower price:"+lowestPrice);
		
	//8- Find record in table having lower price
		
		for(int r=1;r<=rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[6]")).getText();
			
			if(price.equals(lowestPrice))
			{
				driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[1]//input")).click();
				break;
			}

		}
	
	
        
		
		
		

	}

}

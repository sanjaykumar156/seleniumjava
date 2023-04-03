package com.example;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExamples2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("selenium");
		driver.findElement(By.className("wikipedia-search-button")).click();
		driver.findElement(By.linkText("Selenium")).click();
		
		Set<String> windowids= driver.getWindowHandles();
		List<String> id = new ArrayList(windowids);
		String parentwindowid = id.get(0);
		String ChildWindowid = id.get(1);
		
		driver.switchTo().window(ChildWindowid);
		WebElement ele = driver.findElement(By.xpath("//span[@class='mw-page-title-main']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');",ele);
		
		driver.close();
		
		driver.switchTo().window(parentwindowid);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
		
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.err.println(text);
		
		List<WebElement> elements = driver.findElements(By.xpath("//select[@id='speed']/option"));
		elements.size();
		for(int i=0; i<elements.size(); i++) {
			if(elements.get(i).getText().equals("Fast")) {
				elements.get(i).click();
				Thread.sleep(4000);
			}
		}
		
		
		driver.switchTo().frame("frame-one1434677811");
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Sanjay");
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-2']")).sendKeys("kumar");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,900);");
		Thread.sleep(4000);
		List<WebElement> boxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		boxes.size();
		for(int i=0; i<boxes.size(); i++) {
			boxes.get(i).getText();
			boxes.get(i).click();
		}
		
		
		
//		for(String ids:windowids ) {
//			String title = driver.switchTo().window(ids).getTitle();
//			if(title.equals("Selenium - Wikipedia")) {
//				driver.getTitle();
//				driver.close();
//			}
//		}
		

}
}

package com.example;
import java.time.Duration;
import java.time.Instant;

import javax.swing.text.Highlighter.Highlight;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator.ForTotal;


public class Testlibraries {

	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bankofbaroda.in/");
		driver.findElement(By.xpath("//a[.='Accounts'][1]")).click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/nav/a/img"))).perform();
		System.out.println(act);
//		
//		Select dd = new Select(dp)
//		dd.selectByIndex(0);
//		WebElement dp
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//		driver.get("https://www.bankofbaroda.in/");
//		jsExecutor.executeScript("document.getElementsByClassName('bob-custom-dropdown bob-login-dropdown bob-logincc-div')[0]**");
//		Thread.sleep(3000);
//		Select Dropdowns = new Select((WebElement) jsExecutor);
//		Dropdowns.selectByIndex(1);
//		jsExecutor.executeScript("document.getElementById(\"txtpassword\").value=\"reach\";");
//		Thread.sleep(3000);
//		jsExecutor.executeScript("document.getElementById(\"btnlogin\").click;");
//		Thread.sleep(3000);
//		jsExecutor.executeScript("document.getElementById(\"txtusername\").style.border='10px pink solid';");
//		jsExecutor.executeScript("document.getElementById(\"txtpassword\").style.border='10px brown solid';");
//		jsExecutor.executeScript("document.getElementById(\"btnlogin\").style.border='10px green dotted';");
//		jsExecutor.executeScript("document.getElementById(\"txtusername\").style.ackground='yellow';");
//		jsExecutor.executeScript("document.getElementById(\"txtpassword\").style.background='pink';");
//		jsExecutor.executeScript("document.getElementById(\"btnlogin\").click();");
//		jsExecutor.executeScript("document.getElementById(\"spprofile\");");
//		System.out.println(jsExecutor);
//		jsExecutor.executeScript("window.scrollTo(0,100)");
//		System.err.println(driver.getTitle());
		
		
//		driver.get("http://arms.sse.saveetha.com/Login.aspx");
//		driver.findElement(By.xpath("//input[@name='txtusername']")).sendKeys("191812014");
//		driver.findElement(By.id("txtpassword")).sendKeys("reach");
//		driver.findElement(By.id("btnlogin")).click();
//		Actions actions = new Actions(driver);
//		actions.moveToElement(driver.findElement(By.id("spprofile"))).perform();
//		driver.findElement(By.xpath("//i[@class='icon-user']")).click();
//		WebElement courseElement = driver.findElement(By.id("cphbody_ddlacademic"));
//		Select courseNameDropdown = new Select(courseElement);
//		courseNameDropdown.selectByIndex(5);
//		Thread.sleep(3000);
//		WebElement ProgramElement = driver.findElement(By.id("cphbody_ddlGraduationType"));
//      Select ProgramDropDown = new Select(ProgramElement);
//      ProgramDropDown.selectByIndex(11); 
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='cphbody_rbtgender_1']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("cphbody_dateofbirth")).click();
//		Thread.sleep(3000);
////		driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[1]/td[.=30]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//html/body/div/div[1]/table/thead/tr[2]/th[3]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[3]/td[4]")).click();
//		System.err.println(driver.getTitle());
		
		
		
		
		
		
		
         
	}

	

}

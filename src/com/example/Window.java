package com.example;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window {

	public static void main(String[] args) throws InterruptedException {
	
		
		
		

		
		    //System.setProperty("webdriver.ie.driver","E:\\Library\\IEDriverServer.exe");
		    WebDriver driver = new EdgeDriver();
		    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		    driver.get("https://70.91.43.177/rcsnewjs");
		    driver.get("javascript:document.getElementById('overridelink').click();");
		    driver.manage().window().maximize();
		    driver.findElement(By.id("txtUserId")).clear();
		    driver.findElement(By.id("txtUserId")).sendKeys("rcsadmin");
		    driver.findElement(By.id("txtPassword")).sendKeys("delasoft");
		    driver.findElement(By.id("btnLogin")).click();
		    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		    driver.findElement(By.id("__tab_TabContainer1_TabPanel3")).click();
		    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		    String MainWindow = driver.getWindowHandle();
		    String Childwindow = MainWindow;
		    String ChildWindow1 = Childwindow;
		    String ChildWindow2 = ChildWindow1;
		    try
		    {
		    driver.findElement(By.id("TabContainer1_TabPanel3_dmwmOutdoorAdvertising_btnAddPermits")).click();
		    }
		    catch(Exception e)
		    {

		    }

		    for (String Handle : driver.getWindowHandles())
		    {
		        if (!Childwindow.equals(Handle))
		        {
		            Childwindow = Handle;
		            driver.switchTo().window(Childwindow);
		            Thread.sleep(5000);
		        }

		    }

		     try
		     {
		     driver.findElement(By.id("btnSelectOwner")).click();

		     }
		     catch(Exception e)
		     {

		     }

		    for (String Handle1 : driver.getWindowHandles())
		    {
		        if (!ChildWindow1.equals(Handle1))
		        {
		            ChildWindow1 = Handle1;
		            driver.switchTo().window(ChildWindow1);
		            Thread.sleep(5000);
		        }

		    }
		      

		     driver.findElement(By.xpath("html/body/form/div[3]/table/tbody/tr[1]/td/div/table/tbody/tr[4]/td/div/div[2]/div/table/tbody/tr[11]/td[5]/a")).click();
		     Thread.sleep(2000);
		     driver.switchTo().window(Childwindow);
		     Thread.sleep(4000);

		}

		

	}



package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

public class DatePickers {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.globalsqa.com/demo-site/datepicker/#Simple%20Date%20Picker");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		WebElement input = driver.findElement(By.id("datepicker"));
		input.click();
		//div[@class='single_tab_div resp-tab-content resp-tab-content-active']
		String month = "February";
		String year = "2019";
		String date = "4";
		
		while(true) {
			String mo = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mo.equals(month)) {
				if(yr.equals(year)) {
					break;
				}
			}
			driver.findElement(By.xpath("//a[@title='Prev']")).click();
		}
		
		//a[@class='ui-state-default']|//a[@class='ui-state-default ui-state-highlight']
		List<WebElement> dates = driver.findElements(By.xpath("//a[@class='ui-state-default']|//a[@class='ui-state-default ui-state-highlight']"));
		
			if(dates.contains("30")) {
				
			}
			for(int i=0;i<dates.size();i++) {
				if(dates.get(i).getText().equals(date)) {
					dates.get(i).click();
				}
			}
			
		
		
		
		
		
	

	}

}

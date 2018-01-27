package SeleniumBaiscs;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NormalDropDownHandling {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "/Users/prabesh/Downloads/chromedriver");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		 WebElement month=driver.findElement(By.id("month"));
		
		Select select = new Select(month);
		
		select.selectByIndex(9); 
		
		select.selectByVisibleText("Dec");
		
		List<WebElement> monthList =driver.findElements(By.xpath("//Select[@id='month']//option"));
		
		System.out.println(monthList.size());
		
		for(int i=0;i<monthList.size();i++){
			
			System.out.println("The month is :"+ monthList.get(i).getText());
			if(monthList.get(i).getText().equals("Mar")){
				System.out.println(monthList.get(3).getText());
				monthList.get(i).click();
				break;
			}
			
		}
		
	
		
		
		
		
	}

}

package SeleniumBaiscs;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/prabesh/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		WebElement link=driver.findElement(By.linkText("Good PopUp #1"));
		
		link.click();
		
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String> it=handles.iterator();
		
		String primaryid=it.next();
		
		System.out.println("The parent id is ::"+primaryid);
		
		String secondaryId=it.next();
		
		System.out.println("The Secon=dary window id is :"+secondaryId);
		
		driver.switchTo().window(secondaryId);
		
		String secTitle=driver.getTitle();	
		
		System.out.println("The title is "+secTitle);
		
		driver.switchTo().window(primaryid);
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
		
		
		
		
		

		
	}

}

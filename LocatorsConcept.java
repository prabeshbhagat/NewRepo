package SeleniumBaiscs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "/Users/prabesh/Downloads/chromedriver");
		
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://login.live.com");
	
//	//Locators:1)Id
//	WebElement email=driver.findElement(By.id("i0116"));
//	
//	email.sendKeys("prabesh14@outlook.com");
//	
//	WebElement  nxt_btn=driver.findElement(By.id("idSIButton9"));
//	
//	nxt_btn.click();
	
//	//Locators:2)Name
//	WebElement email=driver.findElement(By.name("loginfmt"));
//	
//	email.sendKeys("prabesh14@outlook.com");
//	
//	WebElement  nxt_btn=driver.findElement(By.name(""));
//	
//	nxt_btn.click();
//	
	//Locators: 3)xpath
//	WebElement email=driver.findElement(By.xpath("//input[@id='i0116']"));
//	
//	email.sendKeys("prabesh14@outlook.com");
//	
//	WebElement  nxt_btn=driver.findElement(By.xpath("//input[@id='idSIButton9']"));
//	
//	nxt_btn.click();
//	
//	//Locators :4)Css selector Cascaded style sheet
//	driver.findElement(By.cssSelector("#i0116")).sendKeys("prabesh14@outlook.com");
//	
////	driver.findElement(By.cssSelector("#idSIButton9")).click(); //WebDriverException:
//	
//	//Locators :5)Link Text :Only for links
////	driver.findElement(By.linkText("Terms of use")).click();
//	
//	//Locators :6)Partial Link text : not recommended
////	driver.findElement(By.partialLinkText("Terms")).click();
	
	//Locators :7)Class Name : : not recommended ,as its not unique
	driver.findElement(By.className("btn btn-block btn-primary")).click();
	
	
	
	
	
	
	
	
	
	}
}

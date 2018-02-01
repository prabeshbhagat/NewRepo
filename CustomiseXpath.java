package SeleniumBaiscs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomiseXpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/prabesh/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.freecrm.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Naveenk");
		driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("test@123");
		
		WebElement loginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		Thread.sleep(5000);
		driver.switchTo().frame("intercom-borderless-frame");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'intercom-blocks')]"))).build().perform();
		driver.findElement(By.xpath("//div[contains(@class,'intercom-borderless-dismiss-button')]//span")).click();
		
		//Thread.sleep(5000);
		driver.switchTo().frame("mainpanel");
//		driver.findElement(By.xpath("//a[contains(text(),'Arpit Kho')]//parent::td[@class='datalistrow']//"
//				+ "preceding-sibling::td//input[@type='checkbox']")).click();
		
//		String text=driver.findElement(By.xpath("//a[contains(text(),'Features')]")).getText();
//		System.out.println(text);
//		
		
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox' and @name='contact_id']"));
		System.out.println(checkbox.size());
		for(int i=1;i<checkbox.size();i=i+4){
			checkbox.get(i).click();
		}
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}

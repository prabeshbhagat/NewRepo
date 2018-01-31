package SeleniumBaiscs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAlngTask {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "/Users/prabesh/Downloads/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.co.in");
		List<WebElement> langList=driver.findElements(By.xpath("//div[@id='_eEe']/a"));
		
		for(int i=0;i<langList.size();i++){
			langList.get(i).click();
			langList=driver.findElements(By.xpath("//div[@id='_eEe']/a"));
			driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
			langList=driver.findElements(By.xpath("//div[@id='_eEe']/a"));

		}
		
		
		
//		driver.findElement(By.xpath("//a[contains(text(),'हिन्दी')]")).click();
//		//		driver.findElement(By.xpath("//a[contains(text(),'বাংলা')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'తెలుగు')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'मराठी')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'தமிழ்')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'ગુજરાતી')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'ಕನ್ನಡ')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'മലയാളം')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'ਪੰਜਾਬੀ')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
//		
		

	}

}

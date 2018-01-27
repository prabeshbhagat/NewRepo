package SeleniumBaiscs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "/Users/prabesh/Downloads/chromedriver");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		
		driver.findElement(By.name("files[]")).sendKeys("/Users/prabesh/Desktop/GoToMeeting 000.png");
		
		
		
		
	}

}

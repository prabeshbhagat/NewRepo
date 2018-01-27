package SeleniumBaiscs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebDriverCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/prabesh/Downloads/chromedriver");
		
		WebDriver driver =new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS );//wait for page to load not for element
		
		driver.get("https://www.learncodeonline.in/");
		
		driver.navigate().refresh();
		
	}

}

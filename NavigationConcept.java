package SeleniumBaiscs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/prabesh/Downloads/chromedriver");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://google.com");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("http://cricbuzz.com");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		
		
	}

}

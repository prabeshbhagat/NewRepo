package SeleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonBooks {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/home/justdial/Desktop/Driver/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.click();
		searchBox.sendKeys("java books");
		driver.findElement(By.xpath("//input[@type='submit' and @class='nav-input' ]")).click();
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='s-results-list-atf']//li"));
		Thread.sleep(5000);

		System.out.println("The Number of reults for the serach is : " + list.size());
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i).getText();
			System.out.println("----------------------------------");
			System.out.println(i + "----->" + str);
			System.out.println("----------------------------------");

		}
		// System.out.println(driver.getTitle());

		// Actions act= new Actions(driver);
		// act.moveToElement()

	}

}

package SeleniumBaiscs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/prabesh/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("https://www.freecrm.com");
		driver.findElement(By.name("username")).sendKeys("prabesh");
		driver.findElement(By.name("password")).sendKeys("test123");

		// login button
		WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
		// loginButton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginButton);

		driver.switchTo().frame("mainpanel");
		WebElement company = driver.findElement(By.xpath("//a[contains(text(),'Companies')]"));
		WebElement contacts = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		WebElement Call = driver.findElement(By.xpath("//a[contains(text(),'Call')]"));
		WebElement Docs = driver.findElement(By.xpath("//a[contains(text(),'Docs')]"));

		// company.click();
		Thread.sleep(2000);

		Actions act = new Actions(driver);

		act.moveToElement(contacts).build().perform();
		act.moveToElement(Call).build().perform();
		Thread.sleep(2000);
		act.moveToElement(Docs).build().perform();
		act.moveToElement(company).build().perform();

		WebElement subMenu = driver.findElement(By.xpath("//a[contains(text(),'New Company')]"));
		subMenu.click();

	}

}

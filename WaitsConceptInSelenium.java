package SeleniumBaiscs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsConceptInSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/prabesh/Downloads/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		//implicitly wait-its a global wait applicable for all the elements used by driver
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com");
		driver.findElement(By.name("username")).sendKeys("prabesh");
		driver.findElement(By.name("password")).sendKeys("test123");
	

		// login button
		WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
		// loginButton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginButton);
		
		//implicitly wait-Global wait(applicable for all the elements in the driver).
		
		//Explicit wait :is specific to elements its a dynamic wait
		//it is used to tell selenium webdriver to wait for certain conditions (Conditions is expected conditions)
		//Or
		//to wait for certain time-if not available within that throw an exception i.e Element Not found/Element not visible Exception
		//Explicitly wait can be used by two classes WebDriver Wait  & Expected Conditions
		driver.switchTo().frame("mainpanel");
		
		
		WebDriverWait wait =new WebDriverWait(driver,10);
		WebElement text=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'User: Prabesh Bhagat ')] ")));
		//WebElement text=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//td[contains(text(),'User: Prabesh Bhagat ')] "))));
		System.out.println("The txt is :"+text.getText());
		WebElement setup=driver.findElement(By.xpath("//a[@class='topnavlink']"));
		clickOn(driver,setup,20);
		WebElement text1=driver.findElement(By.xpath("//input[@name='search']"));
		sendKeysValue(driver,text1,20,"asdf");
		
	}
	
		

	

		
//		
		
		
//		/*
//		 * custom clickOn method: click on element on the basis of some
//		 * ExpectedConditions to avoid StaleElementReferenceException
//		 */
		public static void clickOn(WebDriver driver ,WebElement element,int timeout){
			new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).
			until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			
		}

//
// /*
// * custom sendKeyValue method: enter value in element on the basis of some
// * ExpectedConditions to avoid StaleElementReferenceException
// */
	public static void sendKeysValue(WebDriver driver, WebElement element, int timeout, String value) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(value);

	}
//
}

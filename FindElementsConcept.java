package SeleniumBaiscs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/prabesh/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.justdial.com/Free-Listing");

		// List<WebElement> links=driver.findElements(By.tagName("a"));
		//
		// System.out.println("Total links present in the page"+links.size());
		// //number of links in the page
		//
		// for (int i=0;i<links.size();i++){
		// System.out.println(links.get(i).getText());
		//
		// Thread.sleep(2000);
		// if(links.get(i).getText().equals("Pricing")){
		// links.get(i).click();
		//// System.out.println(links.get(i).getText());
		// break;

		// }
		// }

		// total text fields present in the field
		List<WebElement> textboxes = driver.findElements(By.tagName("input"));

		System.out.println(textboxes.size());

		// Worst approach :reason:cannot enter same values in all the fields
		// for(int i=0;i<textboxes.size();i++){
		// textboxes.get(i).sendKeys("hello");
		// }

		// 4 same login button is there how to click on 3rd element

		// List<WebElement> loginButton=
		// driver.findElements(By.tagName("button"));
		// loginButton.get(2).click();
		//
		

	}
}

package SeleniumBaiscs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPopupAlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/prabesh/Downloads/chromedriver");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://register.rediff.com/utilities/newforgot/index.php?FormName=showlogin");
		
		driver.findElement(By.name("next")).click();
		
		Alert al=driver.switchTo().alert();
		
		String textMsg=al.getText();
		
		System.out.println(textMsg);
		
		//Validation
		if(textMsg.equals("Please enter your email ID")){
			System.out.println("Correct error message");
		}else{
			System.out.println("Incorrect message");
		}
		
		Thread.sleep(2000);
		
		al.accept();   //<<--for Ok button
		//al.dismiss(); <<---for cancel button 
	
		
		
		
		
		
		
		
		
		
		
		
	}

}

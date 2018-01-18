package SeleniumBaiscs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithBrowser {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "/Users/prabesh/Downloads/chromedriver");//path set
		
		WebDriver driver=new ChromeDriver(); //Launching a Browser
		
		driver.get("https://awwapp.com/#");// Hit URL
		
		String title=driver.getTitle(); //Fetching title
		
		System.out.println("The title of the element is : "+title); 
		
		//Validation part 
		if(title.equals("AWW App | Online Whiteboard for Realtime Visual Collaboration")){
			System.out.println("Correct title");
		}else{
			System.out.println("Incorrect title");
		}
		
		System.out.println("The current URL :"+driver.getCurrentUrl()); //Fetching URL
		
		String currentUrl=driver.getCurrentUrl();
		
		//Validation part
		if(currentUrl.contains("com/#")){
			System.out.println("The Url contains the com/# in if condition");
		}else{
			System.out.println("com/# isn not present in the Url");
		}
		
//		System.out.println("The complete page source is"+driver.getPageSource()); //Fetching page source
		
		driver.quit(); //Close the browser
		

	}

}

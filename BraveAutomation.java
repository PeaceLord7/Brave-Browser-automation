import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BraveAutomation {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		 
		    ChromeOptions options = new ChromeOptions();
		    
		    options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		 
		    WebDriver driver = new ChromeDriver();
		 
		    driver.manage().window().maximize();
		 
		    driver.get("https://www.google.com/");
		 
		    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 
//		    driver.quit();
	}

}

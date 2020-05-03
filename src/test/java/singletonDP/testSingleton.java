package singletonDP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testSingleton {
	public static WebDriver driver = null;
	
	private  testSingleton() {
		
	}


	public static void initialize() {
		if (driver == null) {
			if(defConstants.nameOfBrowser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(defConstants.nameOfBrowser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Automation\\Drivers\\geckodriver-v0.26.0-win32\\geckodriver.exe");
				driver = new ChromeDriver();
			}
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(defConstants.baseurl);
		
	}
	
	public static void quit() {
		System.out.println("Closing the browser");
		driver.quit();
		driver = null;
	}
	
	
}

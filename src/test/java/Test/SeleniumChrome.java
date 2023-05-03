package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class SeleniumChrome {
	public static void main(String[] args)  {
		
		try {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\MavenIntro\\target\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.facebook.com";
		driver.navigate().to(url);
		
		driver.manage().window().maximize();
		
		String cUrl = driver.getCurrentUrl();
		if (url.equals(cUrl)) {
			System.out.println("Both are Same");
			
		}
		else {
			System.out.println("Both are not same "+cUrl);
		}
		/*	driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.switchTo().newWindow(WindowType.TAB); 
		Thread.sleep(2000);
		driver.close();	
		driver.quit(); */
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	

}


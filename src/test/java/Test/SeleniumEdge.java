package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumEdge {
	
	public static void main(String[] args) throws Throwable {
		//System.setProperty("webdriver.edge.driver","C:\\Users\\ADMIN\\eclipse-workspace\\MavenIntro\\target\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
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

}

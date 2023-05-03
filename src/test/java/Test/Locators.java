package Test;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends KeyWords{
	public static void main(String[] args)  {
		try {
		
	/*	WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		String url = "https://www.facebook.com";
		driver.navigate().to(url);
		
		driver.manage().window().maximize();*/
			launch("https://www.facebook.com");
			maximize();
			
			List <WebElement> t = driver.findElements(By.tagName("a"));
			//System.out.println(t);
			for (int i = 0; i<t.size(); i++) {
				WebElement tb = t.get(i);
				String text = tb.getText();
				System.out.println(text);
				
			}
		
		
		/*WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Batman");
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("brucewayne1521");*/
		}
		catch (Exception e) {
		  System.out.println(e.toString());
		}
			
		
	}}

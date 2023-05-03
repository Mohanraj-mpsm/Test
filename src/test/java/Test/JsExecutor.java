package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JsExecutor extends KeyWords{
	
	public static void main(String[] args) {
		
		try {
		
		launch("https://www.facebook.com");
		maximize();
		
		WebElement id = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Batman')", id);
		js.executeScript("arguments[0].setAttribute('value','Robin')", pass);
		Object idg = js.executeScript("return arguments[0].getAttribute('value')", pass);
		
		System.out.println(idg);
		
		js.executeScript("arguments[0].click()", login);
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}

}

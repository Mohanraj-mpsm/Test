package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollUpDown extends KeyWords {
	
	public static void main(String[] args) {
		
		try {
		
		
		launch("https://www.flipkart.com");
		maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(4000);
		WebElement m = driver.findElement(By.xpath("//div[text()='Mobiles']"));
		WebElement bs = driver.findElement(By.xpath("//a[text()='Primebook Laptops']"));
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(true)", bs);
		Thread.sleep(4000);
		j.executeScript("arguments[0].scrollIntoView(false)", m);
		
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}

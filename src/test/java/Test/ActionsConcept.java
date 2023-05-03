package Test;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsConcept extends KeyWords {
	
	

	public static void main(String[] args) {
		try {
		
		launch("https://www.facebook.com");
		maximize();
		
		//WebElement fp = driver.findElement(By.xpath("//a[text()='Marketplace']"));
		
		WebElement login = driver.findElement(By.id("email"));
		login.sendKeys("Batman");
		Thread.sleep(3000);
		Actions ac = new Actions(driver);
		//ac.keyDown(Keys.SHIFT).sendKeys("Batman").keyUp(Keys.SHIFT);
		ac.doubleClick(login).contextClick().build().perform();
		
	Robot r = new Robot();
		for (int i = 0; i < 2; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		
	}
		catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}

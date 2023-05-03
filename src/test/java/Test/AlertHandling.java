package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertHandling extends KeyWords {
	
	public static void main(String[] args) {
		try {
			
			launch("https://demoqa.com/alerts");
			maximize();
			
			driver.findElement(By.id("alertButton")).click();
			Alert a = driver.switchTo().alert();
			Thread.sleep(3000);
			a.accept();
			
			Thread.sleep(2000);
			driver.findElement(By.id("confirmButton")).click();
			Thread.sleep(3000);
			a.dismiss();
			
			Thread.sleep(3000);
			
			driver.findElement(By.id("promtButton")).click();
			Thread.sleep(3000);
			String text = a.getText();
			System.out.println(text);
			
			a.sendKeys("Mohan");
			Thread.sleep(3000);
			a.accept();
			
			
		}
		
		catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e.toString());
		}
	}

}

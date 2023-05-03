package Test;

import org.openqa.selenium.By;

public class FramesConcept extends KeyWords{
	public static void main(String[] args) {
		try {
			launch("https://chercher.tech/practice/frames");
			maximize();
			driver.switchTo().frame("frame1");
			driver.switchTo().frame("frame3");
			
			driver.findElement(By.xpath("//input[@id='a']")).click();
			
			driver.switchTo().parentFrame();
			String text = driver.findElement(By.xpath("//b[@id='topic']")).getText();
			System.out.println(text);
			
			driver.switchTo().defaultContent();
			String t = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
			System.out.println(t);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}

}

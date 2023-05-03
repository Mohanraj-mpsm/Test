package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FlipkartTask extends KeyWords {
	
	public static void main(String[] args)  {
		try {
			launch("https://www.flipkart.com/");
			maximize();
			WebElement popup = driver.findElement(By.linkText("New to Flipkart? Create an account"));
			if (popup.isDisplayed()) {
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			}
			
			WebElement searchBar = driver.findElement(By.xpath("//input[@type='text']"));
			searchBar.click();
			searchBar.sendKeys("Redmi mobiles");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		
			
			//List<WebElement> mobiles = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
			//List<WebElement> mobiles = driver.findElements(By.xpath("//div[contains(@class,'_4rR01T')]"));
			
			//List<WebElement> mobiles = driver.findElements(By.xpath("//a[@class='_1fQZEK']"));
			//List <WebElement> mobiles = driver.findElements(By.className("_4rR01T"));
			//System.out.println(mobiles);
			
		/*for (WebElement mobi : mobiles) {
				WebElement name = mobi.findElement(By.xpath("//div[@class='_4rR01T']"));
				WebElement price = mobi.findElement(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
				System.out.println(name.getText()+ "    "+price.getText());
				
			}*/
			
		/*	for (int i = 0; i<mobiles.size(); i++) {
				WebElement m = mobiles.get(i);
				String text = m.getText();
				System.out.println(text);
				
			} */
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	

}

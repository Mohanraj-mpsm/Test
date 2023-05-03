package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends KeyWords {
	public static void main(String[] args) {
		try
		{
			
			launch("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
			maximize();
			
			
			//WebElement first = driver.findElement(By.xpath("//select[@id=\"first\"]"));
			
		/*	Select s = new Select(first);
			s.selectByIndex(2);
			Thread.sleep(3000);
			s.selectByValue("Microsoft");
			Thread.sleep(3000);
			s.selectByVisibleText("Google");
			Thread.sleep(3000);
			
			List<WebElement> k = s.getOptions();
			
			for (int i = 0; i < k.size(); i++) {
				WebElement w = k.get(i);
				String text = w.getText();
				if (text.equals("Yahoo")) {
					
					s.selectByVisibleText(text);
					
				}
				else {
					System.out.println("The Element present is "+text);
				}
			}*/
			
			
			WebElement second = driver.findElement(By.xpath("//select[@id='second']"));
			Select s = new Select(second);
			//boolean multiple = s.isMultiple();
		//	System.out.println(multiple);
			s.selectByIndex(0);
			s.selectByIndex(1);
			s.selectByIndex(2);
			
			
			List<WebElement> o = s.getOptions();
			for (int i = 0; i < o.size(); i++) {
				WebElement w = o.get(i);
				String t = w.getText();
				System.out.println(t);
				
			}
			s.deselectByIndex(1);
			System.out.println("  ");
			List<WebElement> g = s.getAllSelectedOptions();
			for (int i = 0; i < g.size(); i++) {
				WebElement e = g.get(i);
				String tt = e.getText();
				System.out.println(tt);
				
			}
			
			System.out.println(" ");
			WebElement fs = s.getFirstSelectedOption();
			String text = fs.getText();
			System.out.println(text);
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}

}
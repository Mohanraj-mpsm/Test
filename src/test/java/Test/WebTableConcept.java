package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTableConcept extends KeyWords {
	
	
	public static void main(String[] args) {
		try {
			
			launch("https://www.techlistic.com/p/demo-selenium-practice.html");
			maximize();
			
			List<WebElement> iTable = driver.findElements(By.tagName("table"));
			for (int i = 0; i < iTable.size(); i++) 
				//for (int i = 1; i < iTable.size(); i++)
			{
				
				WebElement table = iTable.get(i);
				WebElement tBody = table.findElement(By.tagName("tbody"));
				List<WebElement> iRow = tBody.findElements(By.tagName("tr"));
				for (int j = 0; j < iRow.size(); j++) 
				//	for (int j = 2; j <=2; j++)
				{
					WebElement row = iRow.get(j);
					List<WebElement> iData = row.findElements(By.tagName("td"));
				for (int k = 0; k <iData.size(); k++)
					//for (int k = 3; k <=3; k++)
					{
						WebElement data = iData.get(k);
						String text = data.getText();
						System.out.println(text);
						
					}
				}
				
			}
			
		} 
		catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}

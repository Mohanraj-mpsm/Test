package Test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main(String[] args) {
		
		try {
		File f = new File("D:\\RedmiMobiles.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook w= new XSSFWorkbook(f1);
		Sheet s = w.getSheet("Names and Prices");
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				System.out.println(c);
				
			}
			
		}
	
}
	catch (Exception e) {
		System.out.println(e.toString());
	}
	System.out.println("Succesfully read")	
	}
}
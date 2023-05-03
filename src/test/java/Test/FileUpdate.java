package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileUpdate {
	public static void main(String[] args) throws Throwable {
		File f = new File("D:\\ExcelWrite.xlsx");
		FileInputStream f2 = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f2);
		Sheet s = w.getSheet("Sheet1");
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			
			Row r = s.getRow(i);
			for (int j = 0; j <r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int ct = c.getCellType();
				if (ct==1) {
					String value = c.getStringCellValue();
					if (value.equals("Mohan")) {
						
						c.setCellValue("Raj");
						
					}
					
				}
				
			}
			
		}
		
		FileOutputStream f1 = new FileOutputStream(f);
		w.write(f1);
		f1.close();
	}}

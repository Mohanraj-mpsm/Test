package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileWrite {
	
	public static void main(String[] args) throws Throwable {
		File f = new File("D:\\ExcelWrite.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Sheet1");
		Row r = s.createRow(0);
		for (int i = 0; i < 10; i++) {
			Cell c = r.createCell(i);
			c.setCellValue("Mohan");
		}
		/*Cell c = r.createCell(0);
		c.setCellValue("Mohan");*/
		FileOutputStream f1 = new FileOutputStream(f);
		w.write(f1);
		f1.close();
	}

}

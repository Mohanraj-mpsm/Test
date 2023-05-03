package Test;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileFetch {
	
	public static void main(String[] args) throws Throwable {
		File f = new File("D:\\ExcelRead.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f1);
		Sheet s = w.getSheet("Sheet1");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int ct = c.getCellType();
				if (ct==1) {
					String value = c.getStringCellValue();
					System.out.println(value);
				}
				else if (ct==0) {
					if (DateUtil.isCellDateFormatted(c)) {
						Date d = c.getDateCellValue();
						SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
						String g = sd.format(d);
						System.out.println(g);
						
					}
					else {
						double n = c.getNumericCellValue();
						long l = (long) n;
						String valueOf = String.valueOf(l);
						System.out.println(valueOf);
					}
				}
			}
			
		}
		
	}

}

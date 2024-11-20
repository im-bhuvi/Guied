package org.XL;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorkbookDocument;

public class Xlread {
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\dell\\eclipse-workspace\\Guied\\XLsheet\\New Microsoft Excel Worksheet.xlsx");
		
		FileInputStream fi=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fi);
		
		Sheet sheet = w.getSheet("sheet1");
		
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(2);
	
		
		int cellType = cell.getCellType();
	
		
		if (cellType==1) {
			RichTextString value = cell.getRichStringCellValue();
			System.out.println(value);
		}
		else {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sd=new SimpleDateFormat("dd-mmm-yyyy");
				String format = sd.format(dateCellValue);
				System.out.println(format);
			}
			else {
				double numericCellValue = cell.getNumericCellValue();
				long num=(long)numericCellValue;
				String valueOf = String.valueOf(num);
				System.out.println(valueOf);
			}
		}
		
		
		
		
	}

}

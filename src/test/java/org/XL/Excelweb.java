package org.XL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bass.Bassclass;

public class Excelweb extends Bassclass {
	public static void main(String[] args) throws IOException {
		
		//adding data to already existing excel
		
		File f=new File("C:\\Users\\dell\\eclipse-workspace\\Guied\\XLsheet\\Excelweb.xlsx");
		FileInputStream st=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(st);
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.createRow(2);
		Cell cell = row.createCell(0);
		cell.setCellValue("bhuvanesh");
		
		FileOutputStream ot=new FileOutputStream(f);
		w.write(ot);
		
		//create a new excel sheet
		
//		File f=new File("C:\\Users\\dell\\eclipse-workspace\\Guied\\XLsheet\\Excelweb.xlsx");
//		Workbook w=new XSSFWorkbook();
//		Sheet sheet = w.createSheet("Sheet1");
//		Row row = sheet.createRow(2);
//		Cell cell = row.createCell(0);
//		cell.setCellValue("bhuvanesh");
//		
//		FileOutputStream ot=new FileOutputStream(f);
//		w.write(ot);
		
		
		//update in already existing file
		
//		File f=new File("C:\\Users\\dell\\eclipse-workspace\\Guied\\XLsheet\\Excelweb.xlsx");
//		FileInputStream st=new FileInputStream(f);
//		Workbook w=new XSSFWorkbook(st);
//		Sheet sheet = w.getSheet("Sheet1");
//		Row row = sheet.getRow(2);
//		Cell cell = row.getCell(0);
//      String value =cell.getStringCellvlue();
		
//		if (value.equals("bhuvanesh")) {
//			cell.setCellValue("bhuvi");
//		}
//		
//		FileOutputStream ot=new FileOutputStream(f);
//		w.write(ot);
		
		
	}

}

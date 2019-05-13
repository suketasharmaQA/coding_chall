package com.application.libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary 
{
	public void read_excel() throws FileNotFoundException
	{
		FileInputStream fis= new FileInputStream("G:\\Automation\\Assignment\\coding_chall\\data\\data.xlsx");
		//Workbook workbook = new XSSFWorkbook();
		Workbook wb = WorkbookFactory.create(fis); 
		Sheet s = wb.getSheet("searchSheet");
		
	}
}

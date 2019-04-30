package com.acti.helper;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.acti.Base.Driverscript;

public class ExcelConfig extends Driverscript {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public ExcelConfig(){
	
	try
	{
		File src = new File ("./acti-TestData/TestData.xlsx");
		fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
	}
	catch (Exception e)
	{
		System.out.println("Excel Not Found"+e.getMessage());
	}
	}
	//First get the active number of rows from the Excel
			public int getRowCount(int sheetNum)
			{
				int rowcount = wb.getSheetAt(sheetNum).getLastRowNum();
				rowcount=rowcount+1;
				return rowcount;
			}
			
			//This method is used to get data from the sheet and from the cell
			public String getData(int sheetNum,int row,int col)
			{
				sheet = wb.getSheetAt(sheetNum);
				String data = sheet.getRow(row).getCell(col).getStringCellValue();
				return data;
			}
}

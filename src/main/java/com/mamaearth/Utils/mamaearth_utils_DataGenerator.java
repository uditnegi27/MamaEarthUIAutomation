package com.mamaearth.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mamaearth.Base.mamaearth_Base;

public class mamaearth_utils_DataGenerator extends mamaearth_Base{
	
	
	
	/*** This functions will return the object[][]
	 * @throws IOException 
	 * 
	 * 
	 * ***/
	public static Object[][] address_details(String sheetName) throws IOException{
		
		FileInputStream file = null;
		
		try {
			file = new FileInputStream(prop.getProperty("sheetPath"));
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		@SuppressWarnings("resource")
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet(sheetName);
		
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(1).getLastCellNum();
		
		Object[][] data = new Object[rowCount][colCount];
		
		for(int i=0; i<rowCount; i++) {
			XSSFRow row = sheet.getRow(i+1);
			for(int j=0; j<colCount; j++) {
				XSSFCell cell = row.getCell(j);
				cell.setCellType(CellType.STRING);
				data[i][j] = cell.getStringCellValue();
			}
		}
		
		return data;
	}
	
	

}

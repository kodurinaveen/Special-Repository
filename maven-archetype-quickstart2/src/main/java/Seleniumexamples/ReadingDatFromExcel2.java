package Seleniumexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDatFromExcel2 {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		// TODO Auto-generated method stub

	String filePath="C:\\Users\\Venkat\\Downloads";
	String fileName="Story1.xlsx";
	String sheetName="Sheet1";
	
	File file=new File(filePath+"\\"+fileName);
	FileInputStream inputStream=new FileInputStream(file);
	Workbook workBook=null;
	String fileExtentionName=fileName.substring(fileName.indexOf("."));
	
	if(fileExtentionName.equals(".xlsx"))
	{
		workBook=new XSSFWorkbook(inputStream);
	}
	else if(fileExtentionName.equals(".xls"))
	{
		workBook=new HSSFWorkbook(inputStream);
	}
	
	Sheet sheet=workBook.getSheet(sheetName);
	
	int rowcount=sheet.getLastRowNum()- sheet.getFirstRowNum();
	for (int i=0;i<rowcount+1;i++)
	{
	   Row row=sheet.getRow(i);
	   
	   for(int j=0;j<row.getLastCellNum();j++)
	   {
		   System.out.println(row.getCell(j).getStringCellValue()+ "||");
	   }
	
	System.out.println();
	}

	
	}

}

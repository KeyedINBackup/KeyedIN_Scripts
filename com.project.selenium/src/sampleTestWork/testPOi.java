package sampleTestWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testPOi {
	
	public void readExcel(String FilePath, String Filename, String Sheetname) throws IOException{
	
		
	File file = new File(FilePath + "\\" + Filename);	
	FileInputStream input = new FileInputStream(file);
	Workbook gwbook = null;
	String FileExtension = Filename.substring(Filename.indexOf("."));
	if(FileExtension.equals("xls")){
		gwbook = new HSSFWorkbook(input);
		
	} else 
	{
		gwbook = new XSSFWorkbook(input);
	}
	Sheet s = gwbook.getSheet(Sheetname);
	int rowCount = s.getLastRowNum()-s.getFirstRowNum();
	for(int i=1; i<=rowCount; i++){
		Row row = s.getRow(i);
		for(int j=0; j<row.getLastCellNum();j++){
			System.out.println(row.getCell(j).getStringCellValue());
			
		}
		System.out.println();
		
	}
	}


public static void main(String...strings) throws IOException{
	testPOi test1 = new testPOi();
	String FilePath = "C:\\Users\\sakthivel\\Documents\\testdata";
	test1.readExcel(FilePath, "Datadriven.xlsx", "Sheet1");
	
}
}
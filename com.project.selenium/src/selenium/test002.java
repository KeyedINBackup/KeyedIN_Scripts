package selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;



import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class test002 {
	private static XSSFWorkbook ExcelWbook;
	private static XSSFSheet ExcelSheet;
	private static XSSFRow Row;
	private static XSSFCell Cell;
	
	public static void getExcelpath(String path, String Sheet)throws Exception{
		try{
			FileInputStream input = new FileInputStream(path);
			ExcelWbook = new XSSFWorkbook(input);
			ExcelSheet= ExcelWbook.getSheet(Sheet);
			
		} catch(Exception e){
			throw e;
		}
	}

	public static String getExceldata(int Rownum, int Colnum)throws Exception{
		try{
			Cell=ExcelSheet.getRow(Rownum).getCell(Colnum);
			String Cellvalue = Cell.getStringCellValue();
			return Cellvalue;
		}catch(Exception e){
			return "";
		}
	}
	public static void SetExcelValue(int Rownum, int Colnum, String result)throws Exception{
		try{
			Row=ExcelSheet.getRow(Rownum);
			Cell= Row.getCell(Colnum, Row.RETURN_BLANK_AS_NULL);
			if(Cell==null){
				Cell=Row.createCell(Colnum);
				Cell.setCellValue(result);
			}
			else{
				Cell.setCellValue(result);
			}
		 
		FileOutputStream out = new FileOutputStream("C:\\Selenium\\com.project.selenium\\src\\TestData\\Book1.xlsx");
		ExcelWbook.write(out);
		out.flush();
		out.close();
		}
		catch (Exception e){
			throw e;
		}
	}
}

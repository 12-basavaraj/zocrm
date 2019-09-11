package generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This method is used to handle files
 * @author basavaraj gundi
 *
 */
public class FileLib {
	/*this methodis used to read property value from common data file*/
	public String getKeyPropertyValue(String PropPath,String key) throws Throwable
	{
		FileInputStream readProp = new FileInputStream(PropPath);
		Properties Prop = new Properties();
		Prop.load(readProp);
		return Prop.getProperty(key, "Not Present");
	}
	/*This method is used to read the data from excel file*/
	public String getCellData(String excelpath,String sheet,int r,int c) throws Throwable
	{
		FileInputStream readexcel = new FileInputStream(excelpath);
		 Workbook wb = WorkbookFactory.create(readexcel);
		 String value = wb.getSheet(sheet).getRow(r).getCell(c).toString();
		wb.close();
		 return value;
		
	}
	
	/*this method is used to write the data in excel file*/
	public void setCellData(String excelpath,String sheet,int r,int c,String cellvalue) throws Throwable
	{
		FileInputStream readexcel = new FileInputStream(excelpath);
		 Workbook wb = WorkbookFactory.create(readexcel);
		 wb.getSheet(sheet).createRow(r).createCell(c).setCellValue(cellvalue);
		 
		FileOutputStream writeExcel = new  FileOutputStream(excelpath);
		wb.write(writeExcel);
		wb.close();
		
	}
	
	public int getRowCount(String excelpath,String sheet) throws Throwable
	{
		FileInputStream readexcel = new FileInputStream(excelpath);
		 Workbook wb = WorkbookFactory.create(readexcel);
		 int rowcount = wb.getSheet(sheet).getLastRowNum();
		return rowcount;
	}
	
	
	

}

package org.cts.test.Newmaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelNew {
public static void main(String[] args) throws IOException {
File loc=new File("C:\\Users\\karthick-jk\\eclipse-workspace\\Newmaven\\testdata\\Book2.xlsx");
FileInputStream s=new FileInputStream(loc);
Workbook w=new XSSFWorkbook(s);
Sheet s1=w.getSheet("sheet1");
    for(int i=0;i<s1.getPhysicalNumberOfRows();i++) {
    	Row r = s1.getRow(i);
    	for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
    		Cell c = r.getCell(j);
    	System.out.println(c);
    	int type = c.getCellType();
    	if(type==1) {
    		String value = c.getStringCellValue();
    		System.out.println(value);
    		
    	}
    	//date 
    	else if(type==0) {
    		if(DateUtil.isCellDateFormatted(c)) {
    			Date dateCellValue = c.getDateCellValue();
    			SimpleDateFormat sim=new SimpleDateFormat("dd-MMM-yy");
    			String format = sim.format(dateCellValue);
    			System.out.println(format);
    		}
    		else {
    			double numericCellValue = c.getNumericCellValue();
    			long l=(long)numericCellValue;
    			String value=String.valueOf(l);
    			System.out.println(value);
    			
    		}
    	}
    	
    	}
    	
    	
    	
    }

}
}

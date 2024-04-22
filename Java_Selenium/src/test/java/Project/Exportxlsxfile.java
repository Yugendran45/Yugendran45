package Project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.format.CellDateFormatter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Exportxlsxfile {
	
	
	
	@Test()
	public void Exportfile() throws IOException {
		FileInputStream file = new FileInputStream("D:\\Notepad\\datadriver.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		Sheet sheet =book.getSheet("Sheet1");
		Iterator<Row> iterator = sheet.iterator();
		while(iterator.hasNext()) {
			Row next = iterator.next();
			
			Iterator<Cell> cellIterator = next.cellIterator();
			while(cellIterator.hasNext()) {
				Cell next2 = cellIterator.next();
				System.out.println(next2);
				
			}
			
			
		}
		System.out.println("=====================================================================================");
	}
	
	@Test
	public void exportotherway() throws IOException {
		FileInputStream file = new FileInputStream("D:\\Notepad\\datadriver.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		Sheet sheet =book.getSheet("Sheet1");
		int row = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		
		for(int i=0; i<=row;i++ ) {
			Row row2 = sheet.getRow(i);

			for(int j =0;j<lastCellNum; j++) {
				Cell cell = row2.getCell(j);
				//String stringCellValue = cell.getStringCellValue();
				DataFormatter ddf = new DataFormatter();
				String formatCellValue = ddf.formatCellValue(cell);
				
				System.out.println(formatCellValue);
				
			
				
				
			}
		}
		
		
		
		
		
		
	
		
	}

}

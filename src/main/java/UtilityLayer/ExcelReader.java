package UtilityLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	protected static FileInputStream fis;
	protected static XSSFWorkbook workbook;
	protected static XSSFSheet sheet;

	public List<Map<String, String>> getAllSheetData(String ExcelPath, String SheetName) throws IOException {
		try {
			fis = new FileInputStream(ExcelPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(SheetName);

		int rowcount = sheet.getLastRowNum();

		List<Map<String, String>> RowTestData = new ArrayList<Map<String, String>>();
		for (int i = 1; i <= rowcount; i++) {
			int coloumcount = sheet.getRow(0).getLastCellNum();
			LinkedHashMap<String, String> columnTestData = new LinkedHashMap<String, String>();

			for (int j = 0; j < coloumcount; j++) {
				String columnheading = sheet.getRow(0).getCell(j).getStringCellValue();

				String cellvalue = sheet.getRow(i).getCell(j).getStringCellValue();
				columnTestData.put(columnheading, cellvalue);

			}
			RowTestData.add(columnTestData);

		}
		return RowTestData;

	}


}

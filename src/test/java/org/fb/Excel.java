package org.fb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException, IOException {

		File file = new File("C:\\Users\\user\\eclipse-workspace\\FrameWork\\Excel\\MavenExcel.xlsx");

		// Workbook w = new XSSFWorkbook(new FileInputStream(f));
		/*
		 * String stringCellValue =
		 * w.getSheet("Maven").getRow(0).getCell(0).getStringCellValue();
		 * System.out.println(stringCellValue);
		 */

		FileInputStream stream = new FileInputStream(file);

		Workbook Workbook = new XSSFWorkbook(stream);

		Sheet sheet = Workbook.getSheet("Maven");

		Row row = sheet.getRow(4);

		Cell cell = row.getCell(4);
		System.out.println(cell);

		System.out.println("*****************************");

		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println(rows);

		int cells = row.getPhysicalNumberOfCells();
		System.out.println(cells);

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row2 = sheet.getRow(i);
			for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
				Cell cell2 = row2.getCell(j);

				CellType type = cell2.getCellType();

				switch (type) {
				case STRING:
					String data = cell2.getStringCellValue();
					System.out.println(data);

					break;
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell2)) {
						Date clv = cell2.getDateCellValue();
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
						String format = dateFormat.format(clv);
						System.out.println(format);
					}else {
						double cellvalue = cell2.getNumericCellValue();
						BigDecimal b = BigDecimal.valueOf(cellvalue);
						String string = b.toString();
						System.out.println(string);
					}

				default:
					break;
				}

			}

		}

	}

}

package reusable;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {


    public static String retrevieData(String sheetName, int row , int column) throws IOException {
        String path= System.getProperty("user.dir");
        File filePath = new File(path +"/src/main/resources/Data/TestData.xlsx");
        FileInputStream fileInputStream = new FileInputStream(filePath);

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        String value =sheet.getRow(row).getCell(column).getStringCellValue(); // 0,0 --> learnmore
        return value;
    }

}

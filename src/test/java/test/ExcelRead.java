package test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utilities.Config;

import java.io.File;
import java.io.FileInputStream;

public class ExcelRead {
    public static void main(String[] args) throws Exception {
        File file = new File("src/Book1.xlsx");
        System.out.println(file.exists());
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet worksheet = workbook.getSheet("Employees");
        System.out.println(worksheet.getRow(2).getCell(1));
        System.out.println(worksheet.getRow(5).getCell(0));
        //to get physical number of rows used
        int usedRows = worksheet.getPhysicalNumberOfRows();
        System.out.println("number of used rows: " + usedRows);
        int lastUsedRow = worksheet.getLastRowNum();
        System.out.println("lastUsedRow: " + lastUsedRow);

        for (int i = 0; i < usedRows ; i++) {
            if (worksheet.getRow(i).getCell(0).toString().contains("nancy")){
                System.out.println(worksheet.getRow(i).getCell(2));
    }
        }
        String lastName = Config.getProperty("lastname");
        for (int i= 0 ; i<usedRows;i++){
            if(worksheet.getRow(i).getCell(1).toString().contains(lastName)){
                System.out.println("info for "+lastName+", "+worksheet.getRow(i).getCell(0)+
                       ", "+ worksheet.getRow(i).getCell(2));
            }
        }
        workbook.close();
        inputStream.close();
    }
}
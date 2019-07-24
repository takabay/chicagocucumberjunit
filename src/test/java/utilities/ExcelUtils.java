package utilities;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelUtils {

    private static XSSFWorkbook workbook;
    private static XSSFSheet sheet;
    private static XSSFRow row;
    private static XSSFCell cell;
    private static String pathStr;



    // method that opens the excel sheet
    public static void openExcelSheet(String path, String sheetName) {
        pathStr = path;
        try {
            FileInputStream excelFile = new FileInputStream(path);
            workbook = new XSSFWorkbook(excelFile);
            sheet = workbook.getSheet(sheetName);
        } catch (Exception e) {
            System.out.println("Excel file not found");
        }
    }

    // method that returns used rows
    public static int getUsedRows() {
        int rows = sheet.getPhysicalNumberOfRows();
        return rows;
    }

    // method that reads a value with the row and column
    public static String getData(int rowNum, int columnNum) {
        try {
            row = sheet.getRow(rowNum);
            cell = row.getCell(columnNum);
            return cell.toString();
        }
        catch(Exception e) {
            return "";
        }
    }

    // method that writes a value with the row and column
    public static void setData(String value, int rowNum, int columnNum) {
        if(rowNum > sheet.getPhysicalNumberOfRows()) {
            row = sheet.createRow(rowNum);
        }
        else {
            row = sheet.getRow(rowNum);
        }

        cell = row.getCell(columnNum);
        if(cell == null) {
            cell = row.createCell(columnNum);
        }
        else {
            cell = row.getCell(columnNum);
        }
        cell.setCellValue(value);
        try {
            FileOutputStream out = new FileOutputStream(pathStr);
            workbook.write(out);
            out.close();
        } catch (Exception e) {
            System.out.println("Value couln't write");
        }

    }
}
package test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcellWrite {
    public static void main(String[] args) throws Exception {

        XSSFWorkbook workbook;
        XSSFSheet worksheet;
        XSSFRow row;
        XSSFCell cell;

        String path = "src/Book1.xlsx";

        FileInputStream inputStream = new FileInputStream(path);
        workbook = new XSSFWorkbook(inputStream);
        worksheet = workbook.getSheet("Employees");
        row = worksheet.getRow(4);
        cell = row.getCell(0);
        System.out.println(cell);

        XSSFCell adamCell = worksheet.getRow(5).getCell(0);
        System.out.println("before "+adamCell);
        adamCell.setCellValue("trump");
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        System.out.println("after "+adamCell);


        //TODO: CHANGE JOB ID
        for (int i =0; i<=worksheet.getPhysicalNumberOfRows();i++){
            if (worksheet.getRow(i).getCell(0).toString().equals("trump")){
                System.out.println("befor election: "+worksheet.getRow(i).getCell(2));
                worksheet.getRow(i).getCell(2).setCellValue("President");
                System.out.println("After election: "+ worksheet.getRow(i).getCell(2));

  break;
            }
        }
        workbook.write(outputStream);
        outputStream.close();
        inputStream.close();
        workbook.close();
    }
}

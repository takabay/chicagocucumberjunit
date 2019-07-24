package test;

import utilities.ExcelUtils;

import java.io.File;

public class ExcelEsen {
    public static void main(String[] args) {
        String path = ".\\src\\test\\resources\\testData\\MOCK_DATA.xlsx";
        String sheetName = "data";
        File file = new File(path);
        System.out.println(file.exists());
        ExcelUtils.openExcelSheet(path,sheetName);
        System.out.println(ExcelUtils.getData(2,3));
        System.out.println(ExcelUtils.getUsedRows());


    }
}

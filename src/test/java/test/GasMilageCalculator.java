package test;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.GasMilagePages;
import utilities.Config;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class GasMilageCalculator {
    GasMilagePages gasObj;
    private WebDriver driver;
    XSSFWorkbook workbook;
    XSSFSheet worksheet;
    FileInputStream inputStream;
    FileOutputStream outputStream;

    @Before
    public void setUp()throws Exception{
        driver = Driver.getDriver();
      driver.get("https://www.calculator.net/gas-mileage-calculator.html");
      inputStream = new FileInputStream(Config.getProperty("gasmileagedata"));
       workbook = new XSSFWorkbook(inputStream);
       worksheet = workbook.getSheet("Sheet1");


    }

    @Test
    public void dataDrivenMileageCalTest()throws Exception{
        gasObj = new GasMilagePages();

        for (int rowNum = 1; rowNum<worksheet.getPhysicalNumberOfRows()-1;rowNum++) {
            XSSFRow currentRow = worksheet.getRow(rowNum);
            if (!currentRow.getCell(0).toString().equalsIgnoreCase("y")){
                if (currentRow.getCell(6)==null){
                    currentRow.createCell(6);
                }
                currentRow.getCell(6).setCellValue("skip requested");
                continue;
            }
            //double currentOdo= 112;
            double currentOdo = currentRow.getCell(1).getNumericCellValue();

            gasObj.currentOdometerReadingInput.clear();
            gasObj.currentOdometerReadingInput.sendKeys(String.valueOf(currentOdo));
            //  double previousOdo = 122;
            double previousOdo = currentRow.getCell(2).getNumericCellValue();
            gasObj.previousOdometerReadingInput.clear();
            gasObj.previousOdometerReadingInput.sendKeys(String.valueOf(previousOdo));
           // double gas = 7;
            double gas = currentRow.getCell(3).getNumericCellValue();
            gasObj.gasInput.clear();
            gasObj.gasInput.sendKeys(String.valueOf(gas));
            gasObj.calculateButton.click();
            double expectedResult = (currentOdo - previousOdo) / gas;
            String[] actualresult = gasObj.resultInGallon.getText().split(" ");
            DecimalFormat decimalFormat = new DecimalFormat("#0,00");
            decimalFormat.format(expectedResult);
            if(currentRow.getCell(4)==null){
                currentRow.createCell(4);
            }
            currentRow.getCell(4).setCellValue(decimalFormat.format(expectedResult));
            if (currentRow.getCell(5)==null){
                currentRow.createCell(5);
            }
            currentRow.getCell(5).setCellValue(actualresult[0]);
            if (String.valueOf(decimalFormat.format(expectedResult)).equals(actualresult[0])) {
                if(currentRow.getCell(6)==null){
                    currentRow.createCell(6);
                }
                currentRow.getCell(6).setCellValue("pass");
                System.out.println("Pass");
            } else {
                System.out.println("fail");
                if(currentRow.getCell(6)==null){
                    currentRow.createCell(6);
                }
                currentRow.getCell(6).setCellValue("fail");
            }
            if (currentRow.getCell(7)==null){
                currentRow.createCell(7);
            }
            currentRow.getCell(7).setCellValue(LocalDateTime.now().toString());
        }
        outputStream = new FileOutputStream(Config.getProperty("gasmileagedata"));
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        inputStream.close();
    }

}

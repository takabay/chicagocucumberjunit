package utilities;

import java.util.Map;

public class UserUtil {
    //method to get user email and password
    //returns email and password of a user based on role and location
    public Map<String,String> getUserCredentials(String role,String location){
        //read the excel file and get data
        String file = null;
    switch (location){
        case ApplicationConstants.IL:
            file = ".\\src\\test\\resources\\testData\\IlUsers.xlsx";
            break;
        case ApplicationConstants.DARK_SIDE:
            file = ".\\src\\test\\resources\\testData\\MOCK_DATA.xlsx";
            break;
    }
    //read the file based on filepath and get the data
      //  List<Map<String,String>> userData = new ExcelUtils(file,"data")

        return null;

    }
}

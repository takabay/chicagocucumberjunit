package test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Delete {
    @Test
    public void test(){
        Map map = new HashMap<>();
        map.put("employee_id", 23);
        map.put("first_name","lee");
        map.put("last_name","smith");
        map.put("email","EM"+24);
        map.put("phone_number","202.123.4567");
        map.put("salary", 24000);
        ArrayList list = new ArrayList();
        String a = "jani";
        list.add(map);
        list.add(a);


        System.out.println(list.size());
    }
}

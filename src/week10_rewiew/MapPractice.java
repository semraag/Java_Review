package week10_rewiew;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String,String> properties = new HashMap<>();

        properties.put("browser", "chrome");
        properties.put("url", "https://www.cydeo.com");
        properties.put("username", "admin");
        properties.put("password", "admin1234");

        System.out.println(properties);


        System.out.println( properties.get("browser") );

        System.out.println( properties.get("url"));

        System.out.println(properties.get("username"));

        System.out.println(properties.get("password"));


        System.out.println("--------------------------------------------");

        for (Map.Entry<String, String> eachEntry : properties.entrySet()) {
            System.out.println(eachEntry);
        } // isim.entrySet().for ile olusturuyoruz


        System.out.println("--------------------------------------------");

        for (String value : properties.values()) {
            System.out.println(value);
        } // isim,values().for ile olusturuyoruz
    }
}

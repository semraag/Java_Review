package week10_rewiew;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        List<String> attributesOfLogInPage = new ArrayList<>();

        attributesOfLogInPage.addAll(Arrays.asList( "username", "password", "login",
                "forgot password", "username", "password", "username"));
        System.out.println(attributesOfLogInPage);

     /*    List<String> uniqList =new ArrayList<>();

        for (int i = 0; i < attributesOfLogInPage.size(); i++) {
            if (!uniqList.contains(attributesOfLogInPage.get(i))){
                uniqList.add(attributesOfLogInPage.get(i));
            }      }
             System.out.println(uniqList);   */    // for loop ile


        // EGER TEKRARLI ELEMAN ISTEMOYORSAK SET E GIDEBILIRIZ
        Set<String>  unuiqueAttributes = new HashSet<>();
        unuiqueAttributes.addAll(attributesOfLogInPage);
        System.out.println(unuiqueAttributes); // [password, forgot password, login, username]



        System.out.println("----------------------------------");
          /* Set<String> str1 =new LinkedHashSet<>(Arrays.asList(str.split(""))); // [d, b, a, c]
        String uniqStr = "";
         for (String each : str1)
            uniqStr += each;
        System.out.println("\" "+uniqStr + " \"");   BU SEKILDE STRING GIBI GÖRÜNÜYOR */      // Bu sekilde tam olarak " dbca " seklinde görünüyor

        String str = "dddddbbbbbbbbbaaaaaaacccc";   //"dbac"

        System.out.println( new LinkedHashSet<>( Arrays.asList( str.split("") ) )  ); // split metodu Stringi
        // Array e ceviriyor

        System.out.println("-----------------------------------------");

        }



        }





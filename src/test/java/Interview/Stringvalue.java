package Interview;

import java.util.*;

public class Stringvalue {
    public static void main(String []rgs) {


      String str1="jyoti abc ranjan das";
      List<String> data=Arrays.asList("abc","ccd");

      System.out.println(str1.contains(data.toString()));

      Boolean value=data.stream().anyMatch(str1::contains);
        System.out.println(data.stream().anyMatch(str1::contains));
        System.out.println(data.stream().filter(str1::contains).findAny());
      data.stream().anyMatch(str1::contains);
    }

}

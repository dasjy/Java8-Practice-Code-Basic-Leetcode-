package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findClass {
    public static void main(String[] args)
    {
        List<String> data= new ArrayList();
        data.add("one two");
        data.add("one three");
        data.add("one four");
        data.add("one five");

        Boolean  result=data.stream().anyMatch(val -> {return val.equalsIgnoreCase("one");});
    System.out.println(result);

        Boolean  result2= data.stream().allMatch(val-> {return val.startsWith("two");});

        System.out.println(result2);
    }
}

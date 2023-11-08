package StreamAPI;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class foreach {

    public static void main(String[] args)
    {
        List<String> data= Arrays.asList("jyoti","Ranjan","Das");

        data.forEach( n->{
            System.out.println(n);
        });

    }
}

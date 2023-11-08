package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReducedClass {
    public static void main(String []args)
    {
        String name="JYOTI RANJAN DAS";
        List<String> data= List.of(name.split(" "));

        Optional<String> data2=data.stream().reduce((val1, val2)->{
            return val2+"   "+val1;
        });
        System.out.println(data2.get());

        List<String> s1=Arrays.asList("data","engineer");
        List<String> s2=Arrays.asList("data2","engineer2");

        Object arr[]=s2.toArray();
        System.out.println(arr.length);

        for(Object a:arr)
        {
            System.out.println(a);
        }

        List<List<String>> s3=Arrays.asList(s1,s2);

        System.out.println(s3.toString());
        System.out.println(s3.get(1).get(1));

        String str="123";
        String str2="[123]";

        if(str.equals(str2.replace("[","").replace("]","")))
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }


    }
}

package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class flatMapTest {

    public static void main(String[] args)
    {
        List<String> data1= Arrays.asList("aa","bb","cc");
        List<String> data2= Arrays.asList("dd","ee","ff");
        List<String> data3= Arrays.asList("gg","hh","ii");

        List<List<String>> allData =Arrays.asList(data1,data2,data3);
        System.out.println(allData);

        List<String> allData2=allData.stream().flatMap(str->str.stream()).collect(Collectors.toList())
                        .stream().map(data->data.toUpperCase(Locale.ROOT)).collect(Collectors.toList());
        System.out.println(allData2);


    }
}

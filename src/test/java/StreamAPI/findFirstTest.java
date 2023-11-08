package StreamAPI;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static Interview.StringReverse.reverseEachWord;


@Data
public class findFirstTest {
    public static void main(String[] args)
    {
        String name="jyoti ranjan das";
        List<String> data= Arrays.asList("das","jyoti","babul","ranjan");
        List<String> data2=new ArrayList<>();
        data2.add("jyo");
        data2.add("das");
        data2.add("oti");

        findFirstData(data);
        System.out.println(findFirstData(data));
        System.out.println(findAnyData(data));
        System.out.println(anyMatchTest(data,name));
        System.out.println(sortData(data));
        System.out.println(reverseSortData(data));

        List<String> data10=Arrays.asList(name.split(" "));
        data.stream().map(p->reverseEachWords(p)).forEach(System.out::println);
    }

    private static String reverseEachWords(String p) {

        StringBuffer str4=new StringBuffer(p);
        return str4.reverse().toString();
    }

    public static String findFirstData(List<String> data3){
        return data3.stream().filter(name->name.length()<4).findFirst().get();
    }
    public static String findAnyData(List<String> data3){
        return data3.stream().filter(name->name.length()<4).findAny().get();
    }
    public static Boolean anyMatchTest(List<String> data3, String data4)
    {
        return data3.stream().anyMatch(data4::equals);
    }
    public static List<String> sortData(List<String> data3)
    {
        return data3.stream().sorted().collect(Collectors.toList());
    }
    public static List<String> reverseSortData(List<String> data3)
    {
        return data3.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }


}

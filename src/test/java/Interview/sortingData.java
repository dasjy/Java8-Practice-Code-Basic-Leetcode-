package Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sortingData {
    public static void main(String []args)
    {
        int arr[]= {3,5,9,1,4,7,2};

        Arrays.sort(arr);

        List<Integer> num= Arrays.asList(1,2,3,4);
        num.stream().sorted().forEach(System.out::println);
        num.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        List<String> name= Arrays.asList("jyoti","ranjan","das");
        name.stream().sorted().forEach(System.out::println);
        name.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}

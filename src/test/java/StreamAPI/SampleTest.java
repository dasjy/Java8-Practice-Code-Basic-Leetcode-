package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SampleTest {
    public static void main(String[] args) {
        FilterCheck ftrCheck = new FilterCheck();

        List<String> data = Arrays.asList("jyoti", "Ranjan", "Das");

        System.out.println(data);

        List<String> data2 = Arrays.asList("jyoti", "Ranjan");

        System.out.println(data2);
    }
}

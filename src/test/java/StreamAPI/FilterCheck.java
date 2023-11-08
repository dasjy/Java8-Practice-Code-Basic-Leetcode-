package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class FilterCheck {
    public static void main(String[] args) {
/*        List<Integer> data=new ArrayList();

        for(int i=0; i<=20;i++)
        {
            data.add(i);
        }*/
        List<Integer> data = Arrays.asList(12, 11, 14, 16);
        System.out.println(data);

        List<Integer> filterOddData = data.stream()
                .filter(p -> p % 2 != 0)
                .collect(Collectors.toList());

        System.out.println(filterOddData);

        data.stream().filter(p -> p % 2 == 0).forEach(p -> System.out.println(p));

        List<String> names = Arrays.asList("jyoti", "ranjan", "das", "babul");

        names.stream().filter(str -> str.length() > 3 && str.length() < 7).forEachOrdered(System.out::println);

        names.stream().map(str -> str.toUpperCase()).forEachOrdered(System.out::print);


        ////////////////////////distintvt()///////////////////////////////////////

        List<String> cars=Arrays.asList("tata","mahindra","toyota","tata");

        cars.stream().distinct().forEach(System.out::println);

        long totalCar=cars.stream().distinct().count();

        System.out.println("totals distincts cars are" + totalCar);


        ////////////////////////////limit()/////////////////////////////////////
        cars.stream().limit(2).forEach(System.out::println);

        ///////////////////////Min(), Max()///////////////////////

        List<Integer> num=Arrays.asList(1,3,4,5,6,7,8,9,111,33,22);
        long counts=num.stream().filter(p->p%2==0).count();
        System.out.println("totals counts cars are" + counts);

        Optional<Integer> opt=num.stream().min((val1,val2)->{return  val1.compareTo(val2); });

        System.out.println("min" + opt.get());

        Optional<Integer> max=num.stream().max((val1,val2)->{return  val1.compareTo(val2); });

        System.out.println("max" + max.get());

        /////////////////Counts Words ///////////////////////////
        String str="jyoti ranjan das";

        List <String> str2=Arrays.asList(str);
        System.out.println("str2"+ str2);
        Long num2=str2.stream().count();
        System.out.println("str2"+ num);


    }


    public void test(String s) {System.out.println("click");
    }
}

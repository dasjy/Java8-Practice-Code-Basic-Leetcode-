package Interview;

import java.util.*;
import java.util.stream.Collectors;

public class duplicate {
    public static void main(String []rgs) {
        String[] arr = {"abc", "abc", "ccd","klm","ghi"};
        Arrays.stream(arr).distinct().forEach(System.out::println);
        Arrays.stream(arr).sorted().forEach(System.out::println);
        Arrays.stream(arr).sorted(Comparator.reverseOrder()).forEach(System.out::println);
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                System.out.println("data"+arr[i+1]);
            }
        }

        List<String> data=new ArrayList<>();

        for(String a:arr)
        {
            data.add(a);
        }

        System.out.println(data);

        data.stream().distinct().forEach(System.out::println);

        reverseString();
        firstTwoLargeVallue();

        prime();
    }

    private static void reverseString() {
        String str10="jyoti ranjan das";
        String str12=null;

        for(int i=0;i<str10.length();i++)
        {
            str12+=str10.charAt(str10.length()-1);
        }
        System.out.print("Reverse String is "+str12);
    }

    private static void firstTwoLargeVallue() {
        int[] arr={13,11,15,222,124,134};

        Arrays.sort(arr);
        System.out.print("max "+arr[arr.length-1]);
        System.out.print("Second max "+arr[arr.length-2]);
    }

    private static void prime()
    {
        System.out.println("Enter the nimber");
        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();
        int count=0;
        for(int i=2; i<num ;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("prime number");
        }
        else {
            System.out.println("not a prime number");
        }
    }

}

package Interview;

import java.util.Arrays;
import java.util.List;

public class StringReverse {

    public static void main(String[] args)
    {
        String str1="jyoti ranjan das";
        String str2="";

        for(int i= str1.length()-1;i>=0;i--)
        {
            str2+= str1.charAt(i);
        }
        System.out.println(str2);

        for(int i=0;i< str1.length()-1;i++)
        {
            str2+= str1.charAt(str1.length()-1-i);
        }
        System.out.println(str2);

       StringBuffer str3=new StringBuffer(str1);
        System.out.println(str3.reverse());

        List<String> data=Arrays.asList(str1.split(" "));
        data.stream().map(p->reverseEachWord(p)).forEach(System.out::println);

        System.out.println("Size of "+data.size());

        for(int i=data.size();i>0;i--)
        {
            System.out.println(data.get(i-1));
        }

    }

    public static String reverseEachWord(String p) {
        StringBuffer str3=new StringBuffer(p);
        return str3.reverse().toString();
    }


}

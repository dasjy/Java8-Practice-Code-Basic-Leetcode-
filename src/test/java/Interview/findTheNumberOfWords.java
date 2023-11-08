package Interview;

import java.util.List;

public class findTheNumberOfWords {
    public static void main(String[] args)
    {
        String name="jyoti ranjan das ";
         int count=1;
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)==' ')
            {
                count ++;
            }
        }
        System.out.println(count);

        //new method
        List<String> data= List.of(name.split(" "));
        System.out.println(data.size());


    }
}

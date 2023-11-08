package Interview;

import java.util.Arrays;

public class StringOperation {
    public static void main(String[] args) {
        String str1 = "babul";
        String str2 = "bualb";

        char[] ar = str1.toCharArray();
        char[] ar2 = str2.toCharArray();
        System.out.println(ar+" "+ar2);
        Arrays.sort(ar);
        Arrays.sort(ar2);

        System.out.println(ar+" "+ar2);
        Boolean result = Arrays.equals(ar, ar2);
        System.out.println(result);
    }
}

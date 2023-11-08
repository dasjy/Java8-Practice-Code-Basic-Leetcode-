package Interview;

import java.util.List;

public class StringOperationSplitConcept {
    public static void main(String[] args) {
        String str1 = "babul jyoti ranjan das";
        List<String> data = List.of(str1.split(" ")[3]);

        for (String d : data) {
            System.out.print(d);
        }
    }
}

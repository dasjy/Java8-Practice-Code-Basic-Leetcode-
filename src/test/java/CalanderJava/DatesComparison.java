package CalanderJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DatesComparison {

    public static void main(String[] args) throws ParseException {
        String fromDate = "05/01/2023";
        String endDate = "05/15/2023";
        List<String> dates = Arrays
                .asList("05/12/2023", "05/01/2023", "05/13/2023", "05/14/2023", "05/15/2023", "05/24/2023", "05/27/2023", "06/27/2023", "01/27/2023");

        List<Date> d = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm/dd/yyyy");

        for (String s : dates) {
            d.add(simpleDateFormat.parse(s));
        }
        Date sDate = simpleDateFormat.parse(fromDate);
        Date eDate = simpleDateFormat.parse(endDate);


        System.out.println(dates);
        System.out.println(simpleDateFormat.format(sDate));
        System.out.println(simpleDateFormat.format(eDate));
        System.out.println(d);
        System.out.println("Is empty " + fromDate.isEmpty());

        for (Date k : d) {
            if (!k.before(sDate) && !k.after(eDate) || k.equals(sDate) || k.equals(endDate)) {
                // System.out.println("Valid dates are " + simpleDateFormat.format(k));
            } else {
                System.out.println("Invalid dates are " + simpleDateFormat.format(k));
            }
        }


    }
}

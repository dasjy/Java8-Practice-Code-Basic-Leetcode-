package CalanderJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calander {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date date1 = simpleDateFormat.parse("2022-12-05");
        Date date2 = simpleDateFormat.parse("2022-12-05");

        System.out.println(date1.before(date2));
        System.out.println(date1.equals(date2));
        System.out.println(date1.after(date2));

        // SimpleDateFormat class Object
        SimpleDateFormat dtobj = new SimpleDateFormat("dd/MM/yyyy");
        String d = "15/03/2022";
        // Parsing date in Date datatype
        Date a = dtobj.parse(d);
        // Printing in same format
        System.out.println("Date is " + dtobj.format(a));
        // Changing the format
        SimpleDateFormat fr = new SimpleDateFormat("dd MMM yyyy");
        // Printing in new format
        System.out.println("Date in new format is " + fr.format(a));

    }
}

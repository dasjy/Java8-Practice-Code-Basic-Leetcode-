package CalanderJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Calander3 {
    public static void main(String[] args) throws ParseException {
        String dateString = "May 2023";
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM yyyy");
        try {
            Date date = dateFormat.parse(dateString);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);



            SimpleDateFormat outputFormat = new SimpleDateFormat("MM yyyy");
            String formattedDate = outputFormat.format(calendar.getTime());
            int month = calendar.get(Calendar.MONTH) + 1; // Adding 1 because Calendar.MONTH is zero-based
            int year = calendar.get(Calendar.YEAR);
            System.out.println(formattedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}



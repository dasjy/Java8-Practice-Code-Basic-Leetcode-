package CalanderJava;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calander2 {
    public static void main(String[] args) throws ParseException {
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2022, 1, 15),
                LocalDate.of(2022, 2, 28),
                LocalDate.of(2022, 3, 10),
                LocalDate.of(2022, 4, 5),
                LocalDate.of(2022, 5, 20),
                LocalDate.of(2022, 2, 20),
                LocalDate.of(2022, 2, 1),
                LocalDate.of(2022, 4, 30)
        );

        // Filter dates between start and end date (inclusive)
        LocalDate startDate = LocalDate.of(2022, 2, 1);
        LocalDate endDate = LocalDate.of(2022, 4, 30);
        List<LocalDate> filteredDates = dates.stream()
                .filter(date -> !date.isBefore(startDate) && !date.isAfter(endDate)  || date.equals(startDate) || date.equals(endDate))
                .collect(Collectors.toList());

        // Validate filtered dates
        for (LocalDate date : filteredDates) {
            System.out.println(date);
            // Perform further validation or assertions
        }

    }
}

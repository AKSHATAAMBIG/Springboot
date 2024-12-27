import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class WeekEndDateCalculator {

    /**
     * Method to calculate the week end date (Saturday) given a start date.
     * This method will return the week end date as a String in the format "dd-MMM-yyyy".
     * @param startDate The starting date of the week (LocalDate)
     * @return The week end date (Saturday) as a String
     */
    public static String calculateWeekEndDate(LocalDate startDate) {
        // Determine the numeric day of the week (Monday = 1, ..., Sunday = 7)
        int dayOfWeek = startDate.getDayOfWeek().getValue(); // Monday = 1, ..., Sunday = 7

        // Calculate the number of days to add to reach Saturday (6 = Saturday)
        int daysToSaturday = 6 - dayOfWeek;
        if (daysToSaturday < 0) {
            daysToSaturday += 7; // Wrap to the next Saturday if needed
        }

        // Calculate the end date (Saturday)
        LocalDate weekEndDate = startDate.plusDays(daysToSaturday);

        // Format the end date as a String
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy", Locale.ENGLISH);  // Handle uppercase month
        return weekEndDate.format(formatter);
    }

    public static void main(String[] args) {
        // Example: Parse input start date
        String startDateStr = "01-AUG-2024";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy", Locale.ENGLISH);  // Handle uppercase month
        LocalDate startDate = LocalDate.parse(startDateStr, formatter);

        // Call the method to calculate the week end date and get the result as a String
        String weekEndDateStr = calculateWeekEndDate(startDate);

        // Output the results
        System.out.println("Week starts on: " + startDateStr);
        System.out.println("Week ends on (Saturday): " + weekEndDateStr);
    }
}

package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;

public class QuarterCheck {

    // Method to calculate weekdays between two date strings
    public static int calculateWeekdays(String startDateStr, String endDateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy", Locale.ENGLISH);

        // Parse the start and end dates as LocalDate
        LocalDate startDate = LocalDate.parse(startDateStr.toUpperCase(), formatter);
        LocalDate endDate = LocalDate.parse(endDateStr.toUpperCase(), formatter);

        int totalDays = (int) ChronoUnit.DAYS.between(startDate, endDate) + 1; // Include end date
        int startDayOfWeek = startDate.getDayOfWeek().getValue(); // 1 (Monday) to 7 (Sunday)

        int fullWeeks = totalDays / 7;
        int weekdayCount = fullWeeks * 5; // Each full week has 5 weekdays

        int remainingDays = totalDays % 7;
        for (int i = 0; i < remainingDays; i++) {
            int currentDayOfWeek = (startDayOfWeek + i - 1) % 7 + 1; // Wrap around to 1-7
            if (currentDayOfWeek <= 5) { // 1 (Monday) to 5 (Friday) are weekdays
                weekdayCount++;
            }
        }

        return weekdayCount;
    }

    // Method to check which quarters a date range spans and divide the range across quarters
    public static Map<String, String[]> getQuartersForDateRange(String startDateToCheckStr, String endDateToCheckStr, Map<String, String[]> quarterDateRanges) {
        Map<String, String[]> quartersFound = new HashMap<>();

        // Define the date format for parsing
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy", Locale.ENGLISH);

        try {
            // Parse the input date strings to LocalDate
            LocalDate startDateToCheck = LocalDate.parse(startDateToCheckStr.toUpperCase(), formatter);
            LocalDate endDateToCheck = LocalDate.parse(endDateToCheckStr.toUpperCase(), formatter);

            for (String quarter : quarterDateRanges.keySet()) {
                String[] quarterDates = quarterDateRanges.get(quarter);
                LocalDate quarterStartDate = LocalDate.parse(quarterDates[0], formatter);
                LocalDate quarterEndDate = LocalDate.parse(quarterDates[1], formatter);

                // Check if the date range overlaps with the quarter
                if (startDateToCheck.isBefore(quarterEndDate) && endDateToCheck.isAfter(quarterStartDate)) {
                    // Get the actual overlap dates
                    LocalDate overlapStartDate = startDateToCheck.isBefore(quarterStartDate) ? quarterStartDate : startDateToCheck;
                    LocalDate overlapEndDate = endDateToCheck.isAfter(quarterEndDate) ? quarterEndDate : endDateToCheck;

                    // Format the overlapping dates to String
                    String formattedOverlapStartDate = overlapStartDate.format(formatter).toUpperCase();
                    String formattedOverlapEndDate = overlapEndDate.format(formatter).toUpperCase();

                    // Store the formatted overlapping period for the current quarter
                    quartersFound.put(quarter, new String[]{formattedOverlapStartDate, formattedOverlapEndDate});
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Handle parsing errors if needed
        }

        return quartersFound; // Map containing quarters and their corresponding date ranges in String format
    }

    // Method to load quarter date ranges from a properties file
    public static Map<String, String[]> loadQuarterDateRanges(String propertiesFilePath) throws IOException {
        // Load properties file
        Properties properties = new Properties();
        FileInputStream input = new FileInputStream(propertiesFilePath);
        properties.load(input);

        // Date format to parse from properties
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy", Locale.ENGLISH);

        // Create a map to store quarter date ranges
        Map<String, String[]> quarterDateRanges = new HashMap<>();
        for (int i = 1; i <= 4; i++) {
            String key = "quarter" + i;
            String dateRange = properties.getProperty(key);
            String[] dates = dateRange.split(",");

            // Make sure to handle trimming and convert to uppercase
            String formattedStartDate = dates[0].trim().toUpperCase();
            String formattedEndDate = dates[1].trim().toUpperCase();

            // Store the start and end dates for the quarter as String
            quarterDateRanges.put(key, new String[]{formattedStartDate, formattedEndDate});
        }

        input.close(); // Close the file input stream
        return quarterDateRanges;
    }

    public static void main(String[] args) {
        try {
            // Load quarter date ranges from properties
            Map<String, String[]> quarterDateRanges = loadQuarterDateRanges("C:\\Users\\akshatan\\Desktop\\pyspark_loan_default\\Practice\\src\\main\\java\\org\\example\\quarter.properties");

            // Example: Check for a specific date range
            String startDateToCheck = "01-Jan-2024"; // Start of the date range
            String endDateToCheck = "18-Oct-2024"; // End of the date range

            // Get which quarters the date range spans
            Map<String, String[]> quartersResult = getQuartersForDateRange(startDateToCheck, endDateToCheck, quarterDateRanges);

            int totalWeekdays = 0;

            // Output the result
            if (!quartersResult.isEmpty()) {
                for (String quarter : quartersResult.keySet()) {
                    String[] dates = quartersResult.get(quarter);
                    System.out.println("For " + quarter + ": Date range is " + dates[0] + " to " + dates[1]);

                    String qStartDate = dates[0];
                    String qEndDate = dates[1];

                    int weekdays = calculateWeekdays(qStartDate, qEndDate);
                    System.out.println("For " + quarter + ": Overlapping date range is " + qStartDate + " to " + qEndDate);
                    System.out.println("Weekdays in " + quarter + ": " + weekdays);

                    totalWeekdays += weekdays;
                }
                System.out.println("Total weekdays in the date range: " + totalWeekdays);
            } else {
                System.out.println("The date range does not overlap with any quarters.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

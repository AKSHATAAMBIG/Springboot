package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class CheckDate {

    public static void getCurrentDate(){
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formattedDate = date.format(formatter).toUpperCase();
        int weekOfYear = date.get(ChronoField.ALIGNED_WEEK_OF_YEAR);
        System.out.println("Week row of the current date: " + weekOfYear);

        // Print the formatted date
        System.out.println("Current date: " + formattedDate);
        System.exit(0);


    }

    public static String getYear(){
        LocalDate currentDate = LocalDate.now();
        String currentMonth = currentDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH).toUpperCase(); // e.g., "AUG"
        String currentYear = currentDate.format(DateTimeFormatter.ofPattern("yyyy")); // e.g., "2024"

        return currentMonth+"-"+currentYear;

    }

    public static void main(String[] args) {

        //getCurrentDate();
        getYear();
    }
}

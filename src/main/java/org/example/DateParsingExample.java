package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class DateParsingExample {
    public static void main(String[] args) {
        // Input date string with an uppercase month abbreviation
        String inputDate = "01-DEC-2024"; // Uppercase month abbreviation

        // Define the formatter to match the pattern with hyphen separators
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-uuuu", Locale.ENGLISH);

        try {
            // Parse the input string to LocalDate
            LocalDate parsedDate = LocalDate.parse(inputDate, formatter);

            // Output the result
            System.out.println("Parsed Date: " + parsedDate); // Output: 2024-12-01
        } catch (DateTimeParseException e) {
            System.err.println("Error parsing date: " + e.getMessage());
        }
    }
}

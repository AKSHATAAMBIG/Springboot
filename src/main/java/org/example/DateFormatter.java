package org.example;

public class DateFormatter {

    public static void main(String[] args) {
        String startDate = "1 SEP-2024"; // Input date string with a hyphen
        String endDate = "18 OCT-2024"; // Another input date string

        // Call the method for both start and end dates
        String formattedStartDate = formatDate(startDate);
        String formattedEndDate = formatDate(endDate);

        // Output the formatted dates
        System.out.println("Converted Start Date: " + formattedStartDate); // Output: 01-Sep-2024
        System.out.println("Converted End Date: " + formattedEndDate); // Output: 18-Oct-2024
    }

    // Method to format the date
    public static String formatDate(String date) {
        // Remove the hyphen and replace it with a space
        String modifiedDate = date.replace("-", " "); // Result: "1 SEP 2024"

        // Split the modified date
        String[] parts = modifiedDate.split(" "); // Split by space

        // Format the date
        if (parts.length == 3) {
            // Format the day to ensure it has two digits
            String day = String.format("%02d", Integer.parseInt(parts[0])); // Day formatted to 2 digits

            // Convert the month to title case
            String month = parts[1].substring(0, 1).toUpperCase() + parts[1].substring(1).toLowerCase(); // Month in title case

            return String.format("%s-%s-%s", day, month, parts[2]); // Format: "01-Sep-2024"
        } else {
            return "Input date format is incorrect."; // Handle incorrect format
        }
    }
}

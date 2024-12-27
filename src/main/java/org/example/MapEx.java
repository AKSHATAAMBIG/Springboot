package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class MapEx {

    // Map to store PTS ID, week count, start date, and end date
    private Map<String, Integer> ptsWeekCountMap = new HashMap<>();
    private Map<String, LocalDate> ptsStartDateMap = new HashMap<>();  // Store start dates for each PTS ID
    private Map<String, LocalDate> ptsEndDateMap = new HashMap<>();    // Store end dates for each PTS ID
    private Set<String> previousWeekPtsIds = new HashSet<>();          // Track previous week's PTS IDs

    // Accepts PTS IDs as a single string, split by commas
    public void onNewWeek(String ptsIdsForWeek, LocalDate currentWeekDate) {
        // Split the PTS IDs and ensure we only keep unique IDs using a Set
        Set<String> currentWeekPtsIds = new HashSet<>(Arrays.asList(ptsIdsForWeek.split(",")));
        Set<String> newPtsIds = new HashSet<>(currentWeekPtsIds);  // Copy of current week PTS IDs

        // Iterate through current week PTS IDs
        for (String ptsId : currentWeekPtsIds) {
            ptsId = ptsId.trim(); // Remove any extra spaces
            if (previousWeekPtsIds.contains(ptsId)) {
                // If the PTS ID was present in the previous week, increase the week count and update the end date
                int newCount = ptsWeekCountMap.get(ptsId) + 1;
                ptsWeekCountMap.put(ptsId, newCount);  // Increment the week count
                ptsEndDateMap.put(ptsId, currentWeekDate);  // Update end date
            } else {
                // If new PTS ID, start week count from 1, set start and end date
                ptsWeekCountMap.put(ptsId, 1);  // Start week count from 1
                ptsStartDateMap.put(ptsId, currentWeekDate);  // Set start date
                ptsEndDateMap.put(ptsId, currentWeekDate);    // Set end date
            }
        }
        // Update previous week PTS IDs to current
        previousWeekPtsIds = newPtsIds;

        // Display the current state of PTS counts, start dates, and end dates directly after updating previousWeekPtsIds
        for (String ptsId : ptsWeekCountMap.keySet()) {
            System.out.println("PTS ID: " + ptsId
                    + ", Week Count (x5): " + (ptsWeekCountMap.get(ptsId) * 5)  // Multiply week count by 5 for display
                    + ", Start Date: " + ptsStartDateMap.get(ptsId)
                    + ", End Date: " + ptsEndDateMap.get(ptsId));
        }
    }

    public static void main(String[] args) {
        MapEx tracker = new MapEx();

        // Using LocalDate directly without separate methods
        LocalDate startDate = LocalDate.of(LocalDate.now().getYear(), 1, 1); // January 1 of the current year
        LocalDate endDate = LocalDate.now();  // Today's date
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);

        // Calculate total number of days between start date and end date
        int totalDays = (int) ChronoUnit.DAYS.between(startDate, endDate) + 1; // Include end date
        System.out.println("Total number of days from " + startDate + " to " + endDate + ": " + totalDays + " days");

        // Week 1: Jan 1st, 2024
        tracker.onNewWeek("PTS123, PTS124, PTS125, PTS126", LocalDate.of(2024, 1, 1));
        System.out.println();

        // Week 2: Jan 8th, 2024
        tracker.onNewWeek("PTS123, PTS124, PTS125, PTS789", LocalDate.of(2024, 1, 8));
        System.out.println();

        // Week 3: Jan 15th, 2024
        tracker.onNewWeek("PTS123, PTS789, PTS101, PTS102", LocalDate.of(2024, 1, 15));
        System.out.println();
    }
}

package org.example;


import java.util.*;

public class WeekDaysCount {

        // Map to store PTS ID and week count
        private Map<String, Integer> ptsWeekCountMap = new HashMap<>();
        private Set<String> previousWeekPtsIds = new HashSet<>();  // Store PTS IDs from the previous week

        // This method is triggered when a new week starts with a list of PTS IDs
        public void onNewWeek(List<String> ptsIdsForWeek) {
            Set<String> currentWeekPtsIds = new HashSet<>(ptsIdsForWeek);
            Set<String> newPtsIds = new HashSet<>(currentWeekPtsIds);  // Copy of current week PTS IDs

            // Iterate through current week PTS IDs
            for (String ptsId : currentWeekPtsIds) {
                if (previousWeekPtsIds.contains(ptsId)) {
                    // If the PTS ID was present in the previous week, increase the week count
                    int newCount = ptsWeekCountMap.get(ptsId) + 1;
                    ptsWeekCountMap.put(ptsId, newCount * 5);  // Multiply by 5
                } else {
                    // If new PTS ID, start week count from 1
                    ptsWeekCountMap.put(ptsId, 1 * 5);  // Multiply by 5 from the start
                }
            }

            // Remove old PTS IDs that are no longer present this week
            for (String oldPtsId : previousWeekPtsIds) {
                if (!currentWeekPtsIds.contains(oldPtsId)) {
                    // Optional: if you want to handle stopping the count for old PTS IDs
                    System.out.println("PTS ID " + oldPtsId + " no longer present. Stopping its count.");
                }
            }

            // Update previous week PTS IDs to current
            previousWeekPtsIds = newPtsIds;
        }

        // Method to display the current state of week counts
        public void printPtsWeekCounts() {
            for (Map.Entry<String, Integer> entry : ptsWeekCountMap.entrySet()) {
                System.out.println("PTS ID: " + entry.getKey() + ", Week Count: " + entry.getValue());
            }
        }

        public static void main(String[] args) {
            WeekDaysCount tracker = new WeekDaysCount();

            // Week 1 PTS IDs
            tracker.onNewWeek(Arrays.asList("PTS123", "PTS124", "PTS125", "PTS126"));
            tracker.printPtsWeekCounts();

            // Week 2 with some same and one new PTS ID
            tracker.onNewWeek(Arrays.asList("PTS123", "PTS124", "PTS125", "PTS789"));
            tracker.printPtsWeekCounts();

            // Week 3 with further changes in PTS IDs
            tracker.onNewWeek(Arrays.asList("PTS123", "PTS789", "PTS101", "PTS102"));
            tracker.printPtsWeekCounts();
        }
    }


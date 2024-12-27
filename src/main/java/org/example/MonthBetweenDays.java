package org.example;

import java.time.LocalDate;
public class MonthBetweenDays {

        public static int countWeekdaysFromAugustToToday() {
            LocalDate startDate = LocalDate.of(LocalDate.now().getYear(), 1, 1); // August 1 of the current year
            System.out.println(startDate);
            LocalDate endDate = LocalDate.now(); // Today's date
            System.out.println(endDate);

            // Total number of days from startDate to endDate
            int totalDays = (int) java.time.temporal.ChronoUnit.DAYS.between(startDate, endDate) + 1; // Include end date

            //54

            // day of the week for the start date = 4
            int startDayOfWeek = startDate.getDayOfWeek().getValue(); // 1 (Monday) to 7 (Sunday)

            // Calculate complete weeks
            int fullWeeks = totalDays / 7;
            int weekdayCount = fullWeeks * 5; // Each full week has 5 weekdays

            // Calculate remaining days
            int remainingDays = totalDays % 7;

          //4 + 0 -1 % 7 +1 = 4(if 1 to 5 then its weekdays) other than this weekends
            for (int i = 0; i < remainingDays; i++) {
                int currentDayOfWeek = (startDayOfWeek + i - 1) % 7 + 1; // Wrap around to 1-7
                if (currentDayOfWeek <= 5) { // 1 (Monday) to 5 (Friday) are weekdays
                    weekdayCount++;
                }
            }

            return weekdayCount;
        }

        public static void main(String[] args) {
            int weekdays = countWeekdaysFromAugustToToday();
            System.out.println("Number of weekdays from August 1 to today: " + weekdays);
        }
    }

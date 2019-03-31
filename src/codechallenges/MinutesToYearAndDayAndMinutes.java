package codechallenges;

public class MinutesToYearAndDayAndMinutes {

    public static String INVALID_TEXT = "Invalid Value";

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println(INVALID_TEXT);
        } else if (minutes >= 0) {
            long day = minutes / (60 * 24);
            long year = day / 365;
            day = day % 365;
            long remainingMinutes = minutes % (60 * 24);

            System.out.println(minutes + " min = " + year + " y and " + day + " d " + remainingMinutes + "minutes");

        }
    }

    public static void main(String[] args) {
        printYearsAndDays(1440);
    }
}

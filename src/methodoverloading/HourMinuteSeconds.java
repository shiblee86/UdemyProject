package methodoverloading;

public class HourMinuteSeconds {

    private static String getDurationString(long minute, long seconds) {

        if (minute < 0) {
            System.out.println(minute);
            return String.valueOf(-1);
        } else if (minute >= 0 && (seconds < 0 || seconds > 59)) {
            System.out.println("Invalid seconds entered " + seconds);
            return String.valueOf(-1);
        } else if (minute >= 0 && (seconds >= 0 && seconds <= 59)) {
            long hour = ((minute / 60) + (seconds / 3600));
            minute = minute % 60;
            //seconds = (seconds % 3600) % 60;
            return String.valueOf(hour) + "HH " + String.valueOf(minute) + "MM " + String.valueOf(seconds) + "SS";
        } else {
            System.out.println("You did something incorrectly!");
            return String.valueOf(-1);
        }
    }

    private static String getDurationString(long seconds) {

        if (seconds < 0) {
            System.out.println(seconds);
            return String.valueOf(-1);
        }else if (seconds >= 0){
            long minute =  (long) seconds / 60;
            seconds = seconds % 60;
        return getDurationString(minute, seconds);
        }else{
            System.out.println("You did something wrong");
            return String.valueOf(-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(65L, 45L));
        System.out.println(getDurationString(3660L));

    }
}
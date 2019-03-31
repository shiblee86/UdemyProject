package codechallenges;

public class MinutesToYearsAndDays {

    public static String INVALID_TEXT = "Invalid Text";

    public static String printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println(INVALID_TEXT);
            return String.valueOf(-1);
        }else if(minutes >= 0){
            long day = minutes / (60 * 24);
            long year = day / 365;
            day = day % 365;
            long remainingMinutes = minutes % (60 * 24);

            String output = (minutes + " min = " + year + " y and " + day + " d " + remainingMinutes + "minutes");
            return output;
        }else{
            return String.valueOf(-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(printYearsAndDays(525600L));
    }
}

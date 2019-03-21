package codechallenges;

public class TestSpeedConverter {

    public static void main(String[] args) {

        SpeedConverter.toMilesPerHour(70);

        long miles = SpeedConverter.toMilesPerHour(70);

        System.out.println(miles);
        //SpeedConverter.printConversion(70);
    }
}

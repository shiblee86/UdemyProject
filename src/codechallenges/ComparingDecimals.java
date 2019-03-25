package codechallenges;

public class ComparingDecimals {

    public static boolean areEqualByThreeDecimalPlaces(double i, double j) {

        i *= 1000;
        j *= 1000;

        int a = (int) i;
        int b = (int) j;

        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.1751, 3.1757));
    }
}

package methodoverloading;

public class FeetAndInchToCentimeter {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0) {
            System.out.println("Entered feet is " + feet);
            return -1;
        } else if (feet >= 0 && (inches < 0 || inches >= 12)) {
            System.out.println("Entered inches are " + inches);
            return -1;
        } else if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            // return (double) ((feet * 12) + inches )* 2.54;
            inches = inches + (12 * feet);
            double centimeter = inches * 2.54;
            return centimeter;
        } else {
            System.out.println("You did something wrong");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            return -1;
        } else if (inches >= 0) {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(100));
    }
}

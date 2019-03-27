package methodoverloading;

public class FeetAndInchesToCenti {

    public static double getCenti(double feet, double inches) {

        if (feet < 0) {
            System.out.println("Enter feet is outside of the range " + feet);
            return -1;
        } else if (feet >= 0 && (inches < 0 && inches >= 12)) {
            System.out.println("Enter inches is outside of the range " + inches);
            return -1;
        } else if (feet >= 0 && (inches > 0 && inches < 12)) {
            double centi = ((feet * 12) + inches) * 2.54;
            System.out.println(feet + " feet and " + inches + "inches equals " + centi + " cm");
            return centi;
        } else {
            System.out.println("You did something wrong");
            return -1;
        }
    }

    public static double getCenti(double inches) {

        if (inches < 0) {
            System.out.println("Entered inches in outside of the range " + inches);
            return -1;
        } else if (inches > 0) {
            double feet = (int) inches / 12;
            System.out.println(feet + " feet equals " + feet);
            double remainderInches = inches % 12;
            System.out.println(feet + " feet " + inches + " inches");
            return getCenti(feet, remainderInches);
        } else {
            System.out.println("Invalid feet or inches");
            return -1;
        }
    }

    public static void main(String[] args) {
        getCenti(100);
    }


}

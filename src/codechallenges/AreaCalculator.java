package codechallenges;

public class AreaCalculator {

    public static double area(double radius) {

        if (radius < 0) {
            return -1;
        } else if (radius >= 0) {
            return (Math.pow(radius, 2)) * Math.PI;
        }
        return -1;
    }

    public static double area(double x, double y) {

        if (x < 0 || y < 0) {
            return -1;
        } else if (x >= 0 && y >= 0) {
            return x * y;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(-1));
        System.out.println(area(5.0d, 4.0d));
    }
}

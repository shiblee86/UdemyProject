package codechallenges;

public class SumOddNumbers {

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0) {
            return -1;
        } else if (end < start) {
            return -1;
        } else if (start > 0 && end > 0 && end >= start) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(8, 1000));
    }
}

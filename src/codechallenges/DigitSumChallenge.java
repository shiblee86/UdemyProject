package codechallenges;

public class DigitSumChallenge {

    static int sumDigits(int number){

        if(number < 10){
            return -1;
        }

        int sum = 0;
        //extract the least significant digit
        //125 -> 125/10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5

        while(number > 0){
            //extract the least significant digit
            int digit = number % 10;
            sum += digit;
            //drop least significant digit
            number /= 10;
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(sumDigits(325));
    }
}

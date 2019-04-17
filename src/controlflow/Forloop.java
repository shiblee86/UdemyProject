package controlflow;

public class Forloop {

    static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static void main(String[] args) {
        //System.out.println(calculateInterest(10000, 2));

        //for(init; termination; increment;)

        /*
        for (int i = 2; i < 9; i++) {
            System.out.println("Interest of " + i + "% on 10000 is " + String.format("%.2f", calculateInterest(10000, i)));
        }

        for (int i = 8; i >= 2; i--) {
            System.out.println("Interest of " + i + "% on 10000 is " + String.format("%.2f", calculateInterest(10000, i)));
        }
        */


        System.out.println("isPrime " + isPrime(17));
        //Running the loop till we find the first three prime numbers;
        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i) == true) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 3){
                    System.out.println("Exiting the loop");
                    break;
                }
            }
        }
        int stop = 0;
        for(int i = 100; i > 0; i+= 10){
            stop++;
            System.out.println("i is : " + i);
            if(stop == 5){
                break;
            }
        }
    }
}



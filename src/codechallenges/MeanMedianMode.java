package codechallenges;

import java.text.DecimalFormat;
import java.util.stream.IntStream;

import static java.lang.System.*;

public class MeanMedianMode {

    public static void main(String[] args) {

        int [] listOfnumbers = new int[3];

        out.println("The numbers in the array are ");
        for(int i = 0; i<listOfnumbers.length; i++) {
            listOfnumbers[i] = i + 1;
            out.println(listOfnumbers[i]);
        }
        out.println();
        int sum = 0;
        for(int i : listOfnumbers){
            sum += i;
        }
        out.println(sum);

        out.println();
        int sum1 = IntStream.of(listOfnumbers).sum();
        out.println(sum1);

        double b = 1000.00;
        b += 5000.00;

        out.println("The value of b is " + b);

        out.println("plusTenNumbers array");
        int [] bookingNumbers = new int[6];
        double [] bookingValues = new double [6];
        int j = 20191234;
        for(int i = 0; i < bookingNumbers.length; i++){
            bookingNumbers[i] = j;
            j+=1;
            //System.out.println(bookingNumbers[i]);
            bookingValues[i] = b;
            b+=5000;
            //System.out.println(bookingValues[i]);
            DecimalFormat df = new DecimalFormat("#.##");
            out.println("Booking number " + df.format(bookingNumbers[i]) + "'s value is $" + df.format(bookingValues[i]));
        }
    }

}

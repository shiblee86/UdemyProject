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

        //Finding the average of the array:
        int sum = 0;
        for(int i : listOfnumbers){
            sum += i;
        }
        out.println(sum);

        out.println();
        int sum1 = IntStream.of(listOfnumbers).sum();
        out.println(sum1);

        DecimalFormat df = new DecimalFormat();
        //df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);

        double b = 1000d;
        b += 5000;
        out.println("The value of b is " + df.format(b));
               out.println();

        int j = 20191234;

        int [] bookingNumbers = new int[6];
        double [] bookingValues = new double [6];

        for(int i = 0; i < bookingNumbers.length; i++){
            bookingNumbers[i] = j;
            j+=1;
            //System.out.println(bookingNumbers[i]);
            bookingValues[i] = b;
            b+=5000;
            //System.out.println(bookingValues[i]);
            out.println("Booking number " + df.format(bookingNumbers[i]) + "'s value is $" + df.format(bookingValues[i]));
        }
    }

}

package codechallenges;

public class MeanMedianMode {

    public static void main(String[] args) {

        int [] listOfnumbers = new int[5];
        int sum;

        for(int i = 0; i<listOfnumbers.length; i++) {
            listOfnumbers[i] = i + 1;
            System.out.println("The numbers in the array are ");
            System.out.println(listOfnumbers[i]);
            sum = listOfnumbers[i];
            System.out.println("The average of listOfNumbers is ");
            System.out.println(sum/listOfnumbers.length);
        }
    }
}

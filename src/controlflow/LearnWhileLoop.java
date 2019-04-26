package controlflow;

public class LearnWhileLoop {

    public static void main(String[] args) {

        int count = 0;
        while (count != 5) {
            System.out.println("Count Value is " + count);
            count++;
        }
        count = 1;
        //while(true) creates an infinite loop until we include a condition to break the loop.
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("The count is " + count);
            count++;
        }
        System.out.println("Do While Loop");
        int newCount = 3;
        do {
            System.out.println("Count value was " + newCount);
            newCount++;
            if (newCount > 100) {
                break;
            }
        } while (newCount != 6);
        /*With do while loop, the code inside the block is executed first and then the condition
        inside the while statement is valued.
        For example, let's set the value of count to 7. So, Java will first set the value of newCount to 7 and print.
        Once the print is complete, Java will then go inside while loop to check the condition. Java finds
        the condition to be false since 7 is not equal to 6. Hence, it will not go back inside the do statement.
         */

        int number = 4;
        int finishNumber = 20;
        while (number <= finishNumber) {
            number++;
            System.out.println("First number counter: " + number);

            /*With continue, what is happening is, we are telling java,
            if the number is not even, continue back to the while condition.
             Do not go to the end of the loop (sout).
             So, for example, for the first loop, when number = 4,
             Java first evaluates the statement inside while.
             Since 5 is less than the finishNumber,
             Java increments number to take the value of 5.
             Java then goes inside the if statement and evaluates.
             Since 5 is not an even, java executes continue and goes back
             to the code inside while.
             When the number is 5,
             Java increments number to 6
             java evaluates the while statement,
             Java then evaluates the if statement.
             Since 6 is even, java executes the print statement and we have 6
             as a printout.
             */

            //if(!isEvenNumber(number) -- It is another way of writing the line below
            if (isEvenNumber(number) == false) {
                continue;
            }
            System.out.println("Even number is " + number);
            number++;
            System.out.println(number);
        }
        int counter = 0;
        int evenNumber = 4;
        int evenFinishNumber = 20;

        while (evenNumber <= evenFinishNumber) {
            evenNumber++;
            if (isEvenNumber(evenNumber) == false) {
                continue;
            }
            counter++;
            System.out.println("Even numbers are " + evenNumber);
            if (counter >= 5) {
                System.out.println("Total even numbers found: " + counter);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 != 0) {
            return false;
        } else {
            return true;
        }
    }
}


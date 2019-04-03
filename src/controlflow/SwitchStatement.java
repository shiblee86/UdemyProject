package controlflow;

public class SwitchStatement {

    public static void main(String[] args) {

        /*
        int value = 2;
        if(value == 1){
            System.out.println("Value was 1");
        }else if(value == 2){
            System.out.println("Value was 2");
        }else{
            System.out.println("Was not 1 or 2");
        }

         */

        //switch is used to test the variable with different values
        //switch can be used with the four primitive data types (older version)
        //
        int switchValue = 3;
        switch (switchValue) {

            case 1:
                System.out.println("The value was 1");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("The value was 2");
                break;
            case 5:
                System.out.println("Actually it was " + switchValue);
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        String value = "ONe";

        switch (value.toLowerCase()) {
            case "one":
                System.out.println("print 1");
                break;
            case "two":
                System.out.println("print 2");
                break;
            case "three":
                System.out.println("print 3");
                break;
            case "four":
            case "five":
            case "six":
                break;
            default:
                System.out.println("print else");
        }

        char one = 'A';
        switch (one) {
            case 'A':
                System.out.println("print A");
                break;
            case 'B':
                System.out.println("print B");
                break;
            case 'C':
                System.out.println("print C");
                break;
            case 'D':
                System.out.println("print D");
                break;
            case 'E':
                System.out.println("print E");
                break;
            default:
                System.out.println("print else");
        }
    }
}

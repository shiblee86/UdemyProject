package codechallenges;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){

        if(year <= 0 || year > 9999){
            return false;
        }else if(year % 4 != 0){
            return false;
        }else if(year % 4 == 0 && year % 100 != 0){
            return true;
        }else if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            return true;
        }else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {

        int day;

        if ((year < 1 || year > 9999) && (month < 1 || month > 12)) {
            return -1;
        } else if ((year >= 1 && year <= 9999) && (isLeapYear(year) == true) && (month >= 1 && month <= 12)) {

            switch (month) {
                case 2:
                    day = 29;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    day = 30;
                    break;
                default:
                    day = 31;
            }
            return day;
        } else if ((year >= 1 && year <= 9999) && (isLeapYear(year) == false) && (month >= 1 && month <= 12)) {
            switch (month) {
                case 2:
                    day = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    day = 30;
                    break;
                default:
                    day = 31;
            }
            return day;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(4, 2018));
        System.out.println(isLeapYear(2018));
    }
}



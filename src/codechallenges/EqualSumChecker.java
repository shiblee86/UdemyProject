package codechallenges;

public class EqualSumChecker {

    public static boolean hasEqualSum(int i, int j, int k){

        if(i + j == k){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(2,1,2));
    }
}

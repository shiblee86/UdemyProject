package codechallenges;

public class CatPlaying {

    public static boolean isCatPlaying(boolean summer, int temperature){

        if(summer == true && (temperature >= 25 && temperature <= 45)){
            return true;
        }else if(summer == false && (temperature >= 25 && temperature <= 35)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(isCatPlaying(false, 34));
    }
}

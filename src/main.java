import java.util.Scanner;
import  java.util.Random;
public class main {

    //get random value
    static int computerChoice() {
        Random rand = new Random();
        int minRange = 1, maxRange= 4;
        int randomChoice = rand.nextInt(maxRange - minRange) + minRange;
        return randomChoice;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int computerSelection = computerChoice();
        System.out.println(computerSelection);


        //points holders
        int userPoints = 0;
        int computerPoints = 0;

    }
}

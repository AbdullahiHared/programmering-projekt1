import java.util.Scanner;
import java.util.Random;

public class main {

    //get random value
    static int computerChoice() {
        Random rand = new Random();
        int minRange = 1, maxRange = 4;
        int randomChoice = rand.nextInt(maxRange - minRange) + minRange;
        return randomChoice;
    }

    //compare choice
    static void compareChoices(int botChoice, int personChoice) {

        //points holders
        int userPoints = 0;
        int computerPoints = 0;

        //make sure the choices are between 0 and 4 excluding 0 and 4

        while(userPoints <= 5 || computerPoints <= 5) {
            if (personChoice <= 3 && personChoice > 0) {
                if (botChoice == personChoice) {
                    System.out.println("It's a tie. No points added.");
                } else if (personChoice == 1 && botChoice == 3) {
                    System.out.println("Rock beats paper");
                    userPoints += 1;
                } else if (personChoice == 1 && botChoice == 2) {
                    computerPoints += 1;
                    System.out.println("Paper beats rock");
                } else if (personChoice == 2 && botChoice == 1) {
                    userPoints += 1;
                    System.out.println("Paper beats rock");
                } else if (personChoice == 2 && botChoice == 3) {
                    computerPoints += 1;
                    System.out.println("Scissor beats paper");
                } else if (personChoice == 3 && botChoice == 1) {
                    userPoints += 1;
                    System.out.println("Rock beats paper");
                } else if (personChoice == 1 && botChoice == 3) {

                } else {
                    System.out.println("Please make sure you have entered the right  values");
                }
        }

        }

        int playersPoints [] = {userPoints, computerPoints};


    }


    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //The game begins here
        System.out.println("Enter your choice");
        int userChoice = sc.nextInt();

        int computerSelection = computerChoice();
        System.out.println(computerSelection);
        int result = compareChoices(computerSelection, userChoice);
        System.out.println(result);

    }
}

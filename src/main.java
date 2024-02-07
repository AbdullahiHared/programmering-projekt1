import java.util.Scanner;
import java.util.Random;

public class main {

    // Get random value
    static int computerChoice() {
        Random rand = new Random();
        return rand.nextInt(3) + 1; // 1 for Rock, 2 for Paper, 3 for Scissors
    }

    // Compare choices
    static void compareChoices(int botChoice, int personChoice) {
        int userPoints = 0;
        int computerPoints = 0;

        while (userPoints <= 5 && computerPoints <= 5) {
            if (botChoice == personChoice) {
                System.out.println("It's a tie. No points added.");
            } else if ((personChoice == 1 && botChoice == 3) ||
                    (personChoice == 2 && botChoice == 1) ||
                    (personChoice == 3 && botChoice == 2)) {
                System.out.println("You win this round!");
                userPoints++;
            } else {
                System.out.println("Computer wins this round!");
                computerPoints++;
            }

            // Print current scores
            System.out.println("Your points: " + userPoints);
            System.out.println("Computer points: " + computerPoints);

            // Get new choices
            personChoice = getUserChoice();
            botChoice = computerChoice();
        }

        displayResult(userPoints, computerPoints);
    }

    // Get user choice
    static int getUserChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice (1 for Rock, 2 for Paper, 3 for Scissors): ");
        return sc.nextInt();
    }

    static void displayResult(int userPoints, int computerPoints) {
        if(userPoints == computerPoints) {
            System.out.println("The game ends in a draw");
        } else if(userPoints > computerPoints) {
            System.out.println("Congratulations! You have won the game");
        } else {
            System.out.println("Sorry, Computer wins the game");
        }
    }

    // Main method
    public static void main(String[] args) {
        int userChoice = getUserChoice();
        int computerChoice = computerChoice();
        System.out.println("Computer chose: " + computerChoice);
        compareChoices(computerChoice, userChoice);
    }
}

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        int roundsWon = 0;
        char playAgain;

        do {
            int number = random.nextInt(100) + 1;
            int maxAttempts = 5;
            boolean guessedCorrectly = false;

            System.out.println("\n===== Number Game =====");
            System.out.println("Guess the number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts.");

            for (int attempt = 1; attempt <= maxAttempts; attempt++) {

                System.out.print("Attempt " + attempt + ": ");
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("Correct! You guessed the number.");
                    guessedCorrectly = true;
                    roundsWon++;
                    score += (maxAttempts - attempt + 1) * 10;
                    break;
                } else if (guess < number) {
                    System.out.println("Too Low!");
                } else {
                    System.out.println("Too High!");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("You lost! The number was: " + number);
            }

            System.out.println("Current Score: " + score);
            System.out.println("Rounds Won: " + roundsWon);

            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("\n===== Game Over =====");
        System.out.println("Final Score: " + score);
        System.out.println("Rounds Won: " + roundsWon);

        sc.close();
    }
}
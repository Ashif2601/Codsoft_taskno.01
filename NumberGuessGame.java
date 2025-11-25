import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        System.out.println("Welcome to the Game!!!");

        while (playAgain) {
            int num = random.nextInt(100) + 1;
            int attempts = 5;
            boolean win = false;
            System.out.println("I have a number between 1 and 100.");
            System.out.println("You have " + attempts + " attempts.");

            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts--;

                if (guess == num) {
                    System.out.println("Congratulations! You guess it.");
                    System.out.println("Attempts remaining " + attempts);
                    win = true;
                    break;
                } else if (guess > num) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }
                System.out.println("Attempts remaining: " + attempts);
            }

            if (!win) {
                System.out.println("You Lost! the correct answer was: " + num);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            sc.nextLine();
            playAgain = sc.nextLine().equalsIgnoreCase("yes");
        }
        System.out.println("Thanks for playing! Goodbye.");
        sc.close();
    }
}

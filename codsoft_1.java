import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            int maxAttempts = 5;
            boolean guessed = false;

            System.out.println("Guess the number between " + lowerBound + " and " + upperBound + "!");

            while (attempts < maxAttempts && !guessed) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    guessed = true;
                    System.out.println("Eureka! You guessed the correct number in " + attempts + " attempts.");
                } else if (guess < randomNumber) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }

                if (attempts == maxAttempts && !guessed) {
                    System.out.println("Sorry, you've used all your attempts! The correct number was " + randomNumber + ".");
                }
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String res = sc.next();
            playAgain = res.equalsIgnoreCase("yes");
        }
        System.out.println("Thanks for playing!");
    }
}

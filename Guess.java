
import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(10) + 1;
        int numberOfTries = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Guess a number between 1 and 10: ");
            int guess = scanner.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("You found the number in " + numberOfTries + " tries.");
                break;
            }
        }
    }
}
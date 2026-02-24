import java.util.Scanner;
import java.util.Random;

public class guess_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;  // Number between 1–100
        int guess = 0;

        System.out.println("Guess the Number Game!");
        System.out.println("I'm thinking of a number between 1 and 100");

        while(guess != number) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if(guess == number) {
                System.out.println("🎉 Correct! You guessed the number.");
            }
            else if(guess > number) {
                System.out.println("Too high! Try again.");
            }
            else {
                System.out.println("Too low! Try again.");
            }
        }

        sc.close();
    }
}
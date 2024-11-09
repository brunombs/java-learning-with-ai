import java.util.Scanner;
import java.util.Random;

public static void main(String[] args) {
    int number = new Random().nextInt(10) + 1;
    Scanner input = new Scanner(System.in);
    int guess;

    do {
        System.out.print("Enter a number between 1 and 10: ");
        guess = input.nextInt();
        System.out.println("You guessed: " + guess);
        if (guess == number) {
            System.out.println("Congratulations! You guessed it!");
        }
    } while (guess != number);
}
import java.util.Random;
import java.util.Scanner;

public class HighOrLow {
    public static void main(String[] args) {

        int guessNumber = 0;

        Random generator = new Random();
        int randomNumber = generator.nextInt(10) + 1;
        Scanner input = new Scanner(System.in);
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Please guess a number between 1 and 10: ");
            if (input.hasNextInt()) {
                guessNumber = input.nextInt();
                input.nextLine();
                if (guessNumber >= 1 && guessNumber <= 10) {
                    done = true;
                } else {
                    System.out.println(guessNumber + " is not between 1 and 10. Try again.");
                }
            } else {
                trash = input.nextLine();
                System.out.println(trash + " is not a number. Try again.");
            }
        } while (!done);

        System.out.println("The number was " + randomNumber + ".");
        if (guessNumber > randomNumber) {
            System.out.println("Your guess was too high.");
        } else if (guessNumber < randomNumber) {
            System.out.println("Your guess was too low.");
        } else {
            System.out.println("You got it, dude!");
        }
    }
}
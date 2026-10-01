import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter a temperature in Celsius: ");
            if (input.hasNextDouble()) {
                celsius = input.nextDouble();
                input.nextLine();
                done = true;
            } else {
                trash = input.nextLine();
                System.out.println(trash + " is not a number. Try again.");
            }
        } while (!done);

        fahrenheit = (celsius * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);









    }
}



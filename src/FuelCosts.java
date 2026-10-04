import java.util.Scanner;

public class FuelCosts {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double gallonsInTank = 0;
        double milesPerGallon = 0;
        double pricePerGallon = 0;
        double totalCost100miles = 0;
        double maxDistance = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.print("How many gallons does your gas tank hold?: ");
            if (input.hasNextDouble()) {
                gallonsInTank = input.nextDouble();
                input.nextLine();
                done = true;
            } else {
                trash = input.nextLine();
                System.out.println(trash + " Please only enter a number. Try again.");
            }
        } while (!done);

        done = false;
        do {
            System.out.print("What is your vehicle's miles per gallon?: ");
            if (input.hasNextDouble()) {
                milesPerGallon = input.nextDouble();
                input.nextLine();
                done = true;
            } else {
                trash = input.nextLine();
                System.out.println(trash + " is not a number. Try again.");
            }
        } while (!done);

        done = false;
        do {
            System.out.print("What is the current price per gallon of gas?: ");
            if (input.hasNextDouble()) {
                pricePerGallon = input.nextDouble();
                input.nextLine();
                done = true;
            } else {
                trash = input.nextLine();
                System.out.println(trash + " is not a number. Try again.");
            }
        } while (!done);

        totalCost100miles = (100 / milesPerGallon) * pricePerGallon;
        maxDistance = gallonsInTank * milesPerGallon;
        System.out.println("The total cost to drive 100 miles is: " + totalCost100miles);
        System.out.println("The total distance in miles that can be driven on a full tank is: " + maxDistance);
    }



}

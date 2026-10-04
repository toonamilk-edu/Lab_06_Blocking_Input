import java.util.Scanner;

public class RectangleInfo {
public static void main(String[] args) {
    double length = 0;
    double height = 0;
    double area = 0;
    double perimeter = 0;
    double diagonal = 0;
    String trash = "";
    boolean done = false;
    Scanner input = new Scanner(System.in);
    do {
        System.out.print("Enter the length of the rectangle: ");
        if (input.hasNextDouble()) {
            length = input.nextDouble();
            input.nextLine();
            done = true;
        } else {
            trash = input.nextLine();
            System.out.println(trash + " is not a number. Try again.");
        }
    } while (!done);

    done = false;
    do {
        System.out.print("Enter the height of the rectangle: ");
        if (input.hasNextDouble()) {
            height = input.nextDouble();
            input.nextLine();
            done = true;
        } else {
            trash = input.nextLine();
            System.out.println(trash + " is not a number. Try again.");
        }
    } while (!done);
area = length * height;
perimeter = 2 * (length + height);
diagonal = Math.sqrt((length * length) + (height * height));

    System.out.println("The area of the rectangle is: " + area);
    System.out.println("The perimeter of the rectangle is: " + perimeter);
    System.out.println("The diagonal of the rectangle is: " + diagonal);
















}


}

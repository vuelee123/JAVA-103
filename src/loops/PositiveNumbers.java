package loops;

import java.util.Scanner;
public class PositiveNumbers {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number");
            int number = Integer.valueOf(scanner.nextLine());
            System.out.println("Number is " + number);

            if (number < 0) {
                System.out.println("Number must be a positive number");
            }
            if (number == 0) {
                break;
            }
        }
    }
}

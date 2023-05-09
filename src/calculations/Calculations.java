package calculations;

import java.util.Scanner;
public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter another number ");
        double num2 = scanner.nextDouble();

        double add = num1 + num2;
        double sub = num1 - num2;
        double multiply = num1 * num2;
        double divide = num1 / num2;
        double mod = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + add);
        System.out.println(num1 + " - " + num2 + " = " + sub);
        System.out.println(num1 + " * " + num2 + " = " + multiply);
        System.out.println(num1 + " / " + num2 + " = " + divide);
        System.out.println(num1 + " % " + num2 + " = " + mod);

    }
}

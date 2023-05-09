package loops;

import java.util.Scanner;
public class Multiplication {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        int i = 0;
        while (i <= 10) {
            int increase = i++;
            int multiply = increase * num;
            System.out.println(num + " x " + increase + " = " + multiply);

        }
    }
}

package loops;

import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String response = "";
        while (!response.equals("yes")) {
            System.out.print("Do you want to take a break? ");
            response = scanner.nextLine().toLowerCase();
        }
        System.out.println("Great, take a break!");
    }
}
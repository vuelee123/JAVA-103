package scanner;

import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there! How are you doing today?");
        scanner.nextLine();
        System.out.println("Wow - Intersting. Tell me more about yourself!");
        scanner.nextLine();
        System.out.println("Nice Chatting with you! Goodybe!");

    }
}
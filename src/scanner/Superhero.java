package scanner;

import java.util.Scanner;

public class Superhero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lets write a story about a superhero. ");
        System.out.println("Who is the hero of our story ");
        String name = scanner.nextLine();
        System.out.println("What is their superpower?");
        String powers = scanner.nextLine();
        System.out.println("Here is the story:. ");
        System.out.println("There once was a superhero named " + name + " who had the power of "+ powers + ".");
        System.out.println("As they grew older, " + name +  " saw that the world needed them. ");
        System.out.println("There once was a superhero named " + name + ", who had the power of " + powers + ".");
    }
}

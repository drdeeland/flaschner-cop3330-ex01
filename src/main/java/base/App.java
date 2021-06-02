package base;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = input.nextLine();

        String greeting = "Hello, " + name + ", nice to meet you!";

        System.out.print(greeting);
    }
}
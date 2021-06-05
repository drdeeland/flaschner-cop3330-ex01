/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dillon Flaschner
 */

package base;

import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String name = myApp.ReadName();
        String greeting = myApp.GenerateGreeting(name);
        myApp.PrintGreeting(greeting);
    }

    public String ReadName() {
        System.out.print("What is your name? ");
        return input.nextLine();
    }

    public String GenerateGreeting(String name) {
        return "Hello, " + name + ", nice to meet you!";
    }

    public void PrintGreeting(String greeting) {
        System.out.print(greeting);
    }
}
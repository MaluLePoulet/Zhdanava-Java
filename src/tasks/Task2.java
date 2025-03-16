package tasks;

import interfaces.Executable;

import java.util.Scanner;

public class Task2 implements Executable {

    @Override
    public void executeTask() {
        System.out.println("Enter a name.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        final String NAME = "John";

        if (input.equalsIgnoreCase(NAME)) {
            System.out.println("Hello, John.");
        } else {
            System.out.println("There is no such name.");
        }
        scanner.close();
    }
}

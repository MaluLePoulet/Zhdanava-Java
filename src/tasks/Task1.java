package tasks;

import interfaces.Executable;
import utils.Validator;

import java.util.Scanner;

public class Task1 implements Executable {

    @Override
    public void executeTask() {
        System.out.println("Enter a number.");
        Scanner scanner = new Scanner(System.in);
        double input = Validator.checkValidity(scanner);
        final int NUMBER = 7;

        while (input <= NUMBER) {
            System.out.println("Cool number! Enter a number greater than " + NUMBER + " and see what happens!");
            input = Validator.checkValidity(scanner);
        }
        System.out.println("Hello");
        scanner.close();
    }
}
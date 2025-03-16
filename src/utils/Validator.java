package utils;

import java.util.Scanner;

public class Validator {

    public static int checkOptionsValidity(Scanner scanner) {
        int option;
        while (true) {
            try {
                option = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid entry. Try again.");
                scanner.nextLine();
            }
        }
        return option;
    }

    public static double checkValidity(Scanner scanner) {
        double input;
        while (true) {
            try {
                input = scanner.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Invalid entry. Try again.");
                scanner.nextLine();
            }
        }
        return input;
    }
}
import interfaces.Executable;
import tasks.Task4;
import utils.Validator;
import tasks.Task1;
import tasks.Task2;
import tasks.Task3;

import java.util.Scanner;

public class Menu {

    public static void menu() {
        System.out.println("Welcome to my test technical task!" +
                           "\nEnter the number of the task you want to check:" +
                           "\n1. 'Hello' if number is greater than 7;" +
                           "\n2. Only Johns are welcome here;" +
                           "\n3. Print array elements that are multiples of 3;" +
                           "\n4. Check bracket sequence;" +
                           "\n5. Exit.");
        chooseOption();
    }

    private static void chooseOption() {
        Scanner scanner = new Scanner(System.in);
        int option = Validator.checkOptionsValidity(scanner);
        switch (option) {
            case 1:
                Executable task1 = new Task1();
                task1.executeTask();
                break;
            case 2:
                Executable task2 = new Task2();
                task2.executeTask();
                break;
            case 3:
                Executable task3 = new Task3();
                task3.executeTask();
                break;
            case 4:
                Executable task4 = new Task4();
                task4.executeTask();
                break;
            case 5:
                System.out.println("You've exited the program.");
                break;
            default:
                System.out.println("Choose option 1, 2, 3 or 4.");
        }
        scanner.close();
    }
}
package tasks;

import interfaces.Executable;
import utils.Validator;

import java.util.*;

public class Task3 implements Executable {
    @Override
    public void executeTask() {
        System.out.println("Enter the size of the array");
        Scanner scanner = new Scanner(System.in);
        int arraySize = Validator.checkOptionsValidity(scanner);

        if (arraySize < 1) {
            System.out.println("Array size must be at least 1.");
        } else {

            int[] array = new int[arraySize];
            ArrayList<Integer> result = new ArrayList<>();

            Random random = new Random();

            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(30) + 1;
                if (array[i] % 3 == 0) {
                    result.add(array[i]);
                }
            }
            result.sort(Comparator.naturalOrder());
            System.out.println(result);
        }
        scanner.close();
    }
}
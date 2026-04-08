package week4.task01;

import java.util.Scanner;

public class ArrayMerger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. diziyi gir (virgülle): ");
        String input1 = scanner.nextLine();

        System.out.print("2. diziyi gir (virgülle): ");
        String input2 = scanner.nextLine();

        int[] array1 = parseInput(input1);
        int[] array2 = parseInput(input2);

        int[] merged = mergeArrays(array1, array2);

        printArray(merged);

        scanner.close();
    }

    public static int[] parseInput(String input) {

        String[] parts = input.split(",");
        int[] array = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            array[i] = Integer.parseInt(parts[i].trim());
        }

        return array;
    }

    public static int[] mergeArrays(int[] a, int[] b) {

        int[] temp = new int[a.length + b.length];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            temp[index++] = a[i];
        }

        for (int i = 0; i < b.length; i++) {

            boolean exists = false;

            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                temp[index++] = b[i];
            }
        }

        int[] result = new int[index];

        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void printArray(int[] array) {

        System.out.print("Birleştirilmiş Dizi: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

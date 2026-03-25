package week1.task4;

import java.util.Scanner;

public class WaterState {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Su sıcaklığını girin: ");
        int sicaklik = scanner.nextInt();

        if (sicaklik < 0) {
            System.out.println("Su katı haldedir.");
        }
        else if (sicaklik <= 100) {
            System.out.println("Su sıvı haldedir.");
        }
        else {
            System.out.println("Su gaz halindedir.");
        }
    }
}

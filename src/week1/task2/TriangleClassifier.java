package week1.task2;

import java.util.Scanner;

public class TriangleClassifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. kenarı gir:");
        int a = scanner.nextInt();

        System.out.println("2. kenarı gir:");
        int b = scanner.nextInt();

        System.out.println("3. kenarı gir:");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {

            if (a == b && b == c) {
                System.out.println("Eşkenar üçgen");
            }

            else if (a == b || a == c || b == c) {
                System.out.println("İkizkenar üçgen");
            }

            else {
                System.out.println("Çeşitkenar üçgen");
            }

        } else {
            System.out.println("Geçersiz üçgen");
        }


    }
}

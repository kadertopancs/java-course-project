package src.task4;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Ay giriniz: ");
        int ay = sc.nextInt();

        System.out.print("Gün giriniz: ");
        int gun = sc.nextInt();

        if ((ay == 3 && gun >= 20) || (ay == 4) || (ay == 5) || (ay == 6 && gun <= 20)) {
            System.out.println("İlkbahar");
        } else if ((ay == 6 && gun >= 21) || (ay == 7) || (ay == 8) || (ay == 9 && gun <= 22)) {
            System.out.println("Yaz");
        } else if ((ay == 9 && gun >= 23) || (ay == 10) || (ay == 11) || (ay == 12 && gun <= 20)) {
            System.out.println("Sonbahar");
        } else {
            System.out.println("Kış");
        }
    }
}

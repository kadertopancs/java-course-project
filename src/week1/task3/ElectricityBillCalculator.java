package week1.task3;

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Eski sayaç okumasını gir:");
        int eski = scanner.nextInt();

        System.out.println("Yeni sayaç okumasını gir:");
        int yeni = scanner.nextInt();

        int tuketim = yeni - eski;

        double birimFiyat = 0;

        if (tuketim <= 100) {
            birimFiyat = 1.1;
        }
        else if (tuketim <= 200) {
            birimFiyat = 1.3;
        }
        else if (tuketim <= 300) {
            birimFiyat = 1.5;
        }
        else if (tuketim <= 400) {
            birimFiyat = 1.7;
        }
        else if (tuketim <= 500) {
            birimFiyat = 1.9;
        }
        else {
            birimFiyat = 2.3;
        }

        double fatura = tuketim * birimFiyat;

        System.out.println("Tüketim: " + tuketim + " kWh");
        System.out.println("Birim fiyat: " + birimFiyat);
        System.out.println("Toplam fatura: " + fatura + " TL");
    }
}

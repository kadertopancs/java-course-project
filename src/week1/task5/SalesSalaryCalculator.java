package week1.task5;

import java.util.Scanner;

public class SalesSalaryCalculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Sabit maaşı girin: ");
        float sabit_maas = scanner.nextFloat();

        System.out.print("Satış kazancını girin: ");
        float satis_kazanci = scanner.nextFloat();

        System.out.print("Performans seviyesini girin: ");
        float performans_seviyesi = scanner.nextFloat();

        float prim_orani;

        if (satis_kazanci > performans_seviyesi) {
            prim_orani = 0.10f;
        } else {
            prim_orani = 0.05f;
        }

        float prim = satis_kazanci * prim_orani;

        float toplam_maas = sabit_maas + prim;

        System.out.println("Prim: " + prim);
        System.out.println("Toplam maaş: " + toplam_maas);
    }
}

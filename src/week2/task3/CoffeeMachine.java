package src.task3;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Hangi kahveyi istersiniz? (Türk Kahvesi / Filtre Kahve / Espresso): ");  //Kahve seçimi
        String kahve = sc.nextLine().trim().toUpperCase();

        if (kahve.equalsIgnoreCase("Türk Kahvesi")) {
            System.out.println("Türk Kahveniz Hazırlanıyor...");
        }
        else if (kahve.equalsIgnoreCase("Filtre Kahve")) {
            System.out.println("Filtre Kahveniz Hazırlanıyor...");
        }
        else if (kahve.equalsIgnoreCase("Espresso")) {
            System.out.println("Espresso'nuz Hazırlanıyor...");
        }
        else {
            System.out.println("Yanlış Seçim Yaptınız. :( ");

        }

        System.out.print("Süt Eklememizi İster Misiniz? (Evet / Hayır): "); //Süt
        String sut = sc.nextLine().trim().toUpperCase();

        if (sut.equalsIgnoreCase("evet")) {
            System.out.println("Süt Ekleniyor...");
        } else {
            System.out.println("Süt Eklenmiyor.");
        }

        System.out.print("Şeker İster Misiniz? (Evet / Hayır): ");//şeker
        String seker = sc.nextLine().trim().toUpperCase();

        int kacSeker = 0;

        if (seker.equalsIgnoreCase("evet")) {
            System.out.print("Kaç Şeker İstersiniz?: ");
            kacSeker = sc.nextInt();
            sc.nextLine();
            System.out.println(kacSeker + " Şeker Ekleniyor...");
        } else {
            System.out.println("Şeker Eklenmiyor.");
        }

        System.out.print("Kahvenizi Hangi Boyutta İstersiniz? (Büyük / Orta / Küçük): ");  //Boy seçimi
        String boyut = sc.nextLine().trim().toUpperCase();

        System.out.println(kahve + ", " + boyut + " BOY HAZIRLANIYOR...");

        System.out.println("SİPARİŞİNİZ HAZIR! AFİYET OLSUN.. :) ");

    }
}

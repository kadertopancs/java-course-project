package week4.task03;

import java.util.Scanner;

public class InternetBillingSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean devam = true;

        while (devam) {

            System.out.print("Aylık sabit ücret: ");
            float aylikSabitUcret = scanner.nextFloat();

            System.out.print("Kategori (1-2-3): ");
            int kategori = scanner.nextInt();

            System.out.print("Fazla kullanım (GB): ");
            int fazlaKullanim = scanner.nextInt();

            float fatura = calculateBill(aylikSabitUcret, kategori, fazlaKullanim);

            System.out.println("Toplam Fatura: " + fatura);

            devam = shouldContinue(scanner);
        }

        scanner.close();
    }

    public static float calculateBill(float aylikSabitUcret, int kategori, int fazlaKullanim) {

        float ekUcretBirimi = 0;

        switch (kategori) {
            case 1:
                ekUcretBirimi = 0.10f;
                break;
            case 2:
                ekUcretBirimi = 0.20f;
                break;
            case 3:
                ekUcretBirimi = 0.30f;
                break;
            default:
                System.out.println("Geçersiz kategori!");
                return aylikSabitUcret;
        }

        float ekstraUcret = fazlaKullanim * ekUcretBirimi;

        return aylikSabitUcret + ekstraUcret;
    }

    public static boolean shouldContinue(Scanner scanner) {

        System.out.print("Devam etmek istiyor musunuz? (E/H): ");
        String cevap = scanner.next();

        return cevap.equalsIgnoreCase("E");
    }
}


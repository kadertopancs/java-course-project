package src.task1;

import java.util.Scanner;

public class UserLoginSystem {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Kullanıcı adı belirleyin: "); // Kullanıcı ad-şifre belirleme
        String kullaniciAdi = sc.nextLine();

        String sifre;
        String sifreTekrar;

        while (true) {

            System.out.print("Şifre belirleyin: ");
            sifre = sc.nextLine();

            System.out.print("Şifreyi tekrar girin: ");
            sifreTekrar = sc.nextLine();

            if (sifre.equals(sifreTekrar)) {
                break;
            } else {
                System.out.println("Şifreler uyuşmuyor, tekrar deneyin.");
            }
        }


        int hak = 3;  // Giriş

        while (hak > 0) {

            System.out.print("Kullanıcı adını gir: ");
            String girisAd = sc.nextLine();

            System.out.print("Şifreyi gir: ");
            String girisSifre = sc.nextLine();

            if (girisAd.equals(kullaniciAdi) && girisSifre.equals(sifre)) {

                System.out.println("Başarılı giriş! " + kullaniciAdi + " olarak sisteme hoş geldiniz. :)");
                break;

            } else {

                hak--; //her yanlış girişte hak sayısı azalıyor
                System.out.println("Yanlış giriş. Kalan hak: " + hak);
            }

            if (hak == 0) {
                System.out.println("Üzgünüz, 3 kez yanlış giriş yaptınız. :(");

            }
        }
    }
}
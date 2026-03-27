package src.task2;

public class CompressionAlgorithm {
    public static void main(String[] args) {

        String metin = "javalandinizz";
        String sonuc = "";

        int sayac = 1;

        for (int i = 1; i < metin.length(); i++) {

            if (metin.charAt(i) == metin.charAt(i - 1)) {
                sayac++;
            }
            else {
                sonuc += metin.charAt(i - 1);
                sonuc += sayac;
                sayac = 1;
            }
        }
        sonuc += metin.charAt(metin.length() - 1); // son karakter için
        sonuc += sayac;

        System.out.println("Sonuç: " + sonuc);
    }
}

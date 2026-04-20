package week5.task01;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> books = new ArrayList<>();

        while (true) {

            System.out.println("\n1. Kitaplari Listele");
            System.out.println("2. Kitap Ekle");
            System.out.println("3. Kitap Sil");
            System.out.println("4. Cikis");
            System.out.print("Seciminizi yapin (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    if (books.isEmpty()) {
                        System.out.println("Kutuphane bos.");
                    } else {
                        System.out.println("Kitap Listesi:");
                        for (String book : books) {
                            System.out.println("- " + book);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Kitap adi girin: ");
                    String newBook = scanner.nextLine();
                    books.add(newBook);
                    System.out.println("Kitap eklendi.");
                    break;

                case 3:
                    System.out.print("Silinecek kitap adi: ");
                    String removeBook = scanner.nextLine();

                    if (books.remove(removeBook)) {
                        System.out.println("Kitap silindi.");
                    } else {
                        System.out.println("Kitap bulunamadi.");
                    }
                    break;

                case 4:
                    System.out.println("Program sonlandi.");
                    return;

                default:
                    System.out.println("Gecersiz secim.");
            }
        }
    }
}



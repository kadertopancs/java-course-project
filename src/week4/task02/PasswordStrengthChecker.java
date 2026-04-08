package week4.task02;

import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Şifre girin: ");
        String password = scanner.nextLine();

        if (isStrongPassword(password)) {
            System.out.println("Şifre güçlü.");
        } else {
            System.out.println("Şifre zayıf.");
        }

        scanner.close();
    }

    public static boolean isStrongPassword(String password) {

        if (password.length() < 8) {
            return false;
        }

        boolean containsUpper = false;
        boolean containsLower = false;
        boolean containsDigit = false;
        boolean containsSpecial = false;

        for (char c : password.toCharArray()) {

            if (Character.isUpperCase(c)) {
                containsUpper = true;
            }
            else if (Character.isLowerCase(c)) {
                containsLower = true;
            }
            else if (Character.isDigit(c)) {
                containsDigit = true;
            }
            else {
                containsSpecial = true;
            }
        }

        return containsUpper && containsLower && containsDigit && containsSpecial;
    }
}


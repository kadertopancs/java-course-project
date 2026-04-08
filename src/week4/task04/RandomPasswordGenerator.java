package week4.task04;

import java.util.Random;

public class RandomPasswordGenerator {

        private static final int MIN_LENGTH = 8;
        private static final int MAX_LENGTH = 10;
        private static final int ASCII_START = 33;
        private static final int ASCII_END = 126;

        public static void main(String[] args) {
            String password = generatePassword();
            System.out.println("Generated Password: " + password);
        }

        public static String generatePassword() {

            Random random = new Random();

            int length = random.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;  //8-10 arası uznlk üretir

            StringBuilder password = new StringBuilder();

            for (int i = 0; i < length; i++) {

                int ascii = random.nextInt(ASCII_END - ASCII_START + 1) + ASCII_START;

                char character = (char) ascii;

                password.append(character);
            }

            return password.toString();
        }
    }



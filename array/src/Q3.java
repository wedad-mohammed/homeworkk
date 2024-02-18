public class Q3 {
    public class CaesarCipher {
        private static final int ALPHABET_SIZE = 24; // Greek alphabet size

        public static String encrypt(String text, int shift) {
            StringBuilder result = new StringBuilder();
            for (char ch : text.toCharArray()) {
                if (Character.isLetter(ch)) {
                    char base = Character.isUpperCase(ch) ? 'Α' : 'α'; // Greek alphabet base
                    ch = (char) (base + (ch - base + shift) % ALPHABET_SIZE);
                }
                result.append(ch);
            }
            return result.toString();
        }

        public static String decrypt(String text, int shift) {
            return encrypt(text, ALPHABET_SIZE - shift);
        }

        public static void main(String[] args) {
            String message = "Γειά σου κόσμε!"; // Greek: Hello world!
            int shift = 3;
            String encrypted = encrypt(message, shift);
            System.out.println("Encrypted: " + encrypted);
            System.out.println("Decrypted: " + decrypt(encrypted, shift));
        }
    }
}

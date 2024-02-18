public class Q9 {
    public class PseudorandomGenerator {

        private static int cur;

        public static void main(String[] args) {
            int a = 1; // Choose the value of 'a'
            int b = 0; // Choose the value of 'b'
            int n = 1000; // Choose the value of 'n'
            cur = 92; // Choose the seed value

            // Generate and print the next five pseudorandom numbers
            for (int i = 0; i < 5; i++) {
                cur = (a * cur + b) % n;
                System.out.println("Pseudorandom number " + (i + 1) + ": " + cur);
            }
        }
    }
}

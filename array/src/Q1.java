public class Q1 {
    public class PseudorandomGenerator {
        private static final int a = 12;
        private static final int b = 5;
        private static final int n = 100;

        public static void main(String[] args) {
            int cur = 92; // Seed value
            System.out.println("Next five pseudorandom numbers:");
            for (int i = 0; i < 5; i++) {
                cur = getNextPseudorandom(cur);
                System.out.println(cur);
            }
        }

        private static int getNextPseudorandom(int cur) {
            return (a * cur + b) % n;
        }
    }
}

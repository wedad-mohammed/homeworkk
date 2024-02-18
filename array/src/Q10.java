public class Q10 {

    import java.util.*;

    public class ProbabilityCalculator {
        public static void main(String[] args) {
            Random r = new Random();
            int[] A = new int[100];

            // Generate the array A containing 100 integers
            for (int i = 0; i < A.length; i++) {
                A[i] = r.nextInt(10);
            }

            // Count the occurrences of each number in A
            Map<Integer, Integer> countMap = new HashMap<>();
            for (int num : A) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }

            // Find the mode (number with the highest frequency)
            int mode = -1, maxCount = 0;
            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() > maxCount) {
                    mode = entry.getKey();
                    maxCount = entry.getValue();
                }
            }

            // Calculate the probability
            double probability = Math.pow(0.1, 100) * binomialCoefficient(100, maxCount);

            System.out.println("The number that x will equal with probability at least 0.99 is: " + mode);
            System.out.println("Probability that x = mode: " + probability);
        }

        // Function to calculate binomial coefficient (n choose k)
        private static double binomialCoefficient(int n, int k) {
            double result = 1;
            for (int i = 1; i <= k; i++) {
                result *= (double) (n - i + 1) / i;
            }
            return result;
        }
    }
}

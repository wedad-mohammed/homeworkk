public class Q11 {

    import java.util.Random;

    public class ShuffleArray {
        public static void shuffle(int[] A) {
            Random rand = new Random();

            // Start from the last element and swap with a random element before it
            for (int i = A.length - 1; i > 0; i--) {
                int j = rand.nextInt(i + 1); // Generate a random index between 0 and i
                swap(A, i, j); // Swap A[i] with A[j]
            }
        }

        // Helper method to swap two elements in an array
        private static void swap(int[] A, int i, int j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }

        public static void main(String[] args) {
            // Example usage
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println("Original array: ");
            printArray(arr);

            shuffle(arr);
            System.out.println("Shuffled array: ");
            printArray(arr);
        }

        // Helper method to print the contents of an array
        private static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

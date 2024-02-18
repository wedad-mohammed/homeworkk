public class Q4 {

    import java.util.Arrays;

    public class ArrayEqualityTest {
        public static void main(String[] args) {
            // One-dimensional arrays
            int[] A1 = {1, 2, 3};
            int[] B1 = {1, 2, 3};

            // Shallow equality
            boolean shallowEquality1D = (A1 == B1);
            System.out.println("Shallow equality (1D): " + shallowEquality1D);

            // Deep equality
            boolean deepEquality1D = Arrays.equals(A1, B1);
            System.out.println("Deep equality (1D): " + deepEquality1D);

            // Two-dimensional arrays
            int[][] A2 = {{1, 2}, {3, 4}};
            int[][] B2 = {{1, 2}, {3, 4}};

            // Shallow equality
            boolean shallowEquality2D = (A2 == B2);
            System.out.println("Shallow equality (2D): " + shallowEquality2D);

            // Deep equality
            boolean deepEquality2D = Arrays.deepEquals(A2, B2);
            System.out.println("Deep equality (2D): " + deepEquality2D);
        }
    }
}

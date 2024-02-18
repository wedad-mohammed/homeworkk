public class Q13 {
    public class ArrayAddition {
        public static int[][][] addArrays(int[][][] arr1, int[][][] arr2) {
            // Check if the arrays have the same dimensions
            if (arr1.length != arr2.length || arr1[0].length != arr2[0].length || arr1[0][0].length != arr2[0][0].length) {
                throw new IllegalArgumentException("Arrays must have the same dimensions");
            }

            int[][][] result = new int[arr1.length][arr1[0].length][arr1[0][0].length];

            // Add corresponding elements from both arrays
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[0].length; j++) {
                    for (int k = 0; k < arr1[0][0].length; k++) {
                        result[i][j][k] = arr1[i][j][k] + arr2[i][j][k];
                    }
                }
            }
            return result;
        }

        public static void main(String[] args) {
            // Example usage
            int[][][] array1 = { { {1, 2}, {3, 4} }, { {5, 6}, {7, 8} } };
            int[][][] array2 = { { {9, 10}, {11, 12} }, { {13, 14}, {15, 16} } };

            int[][][] result = addArrays(array1, array2);

            // Print the result
            for (int[][] matrix : result) {
                for (int[] row : matrix) {
                    for (int value : row) {
                        System.out.print(value + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
    }
}

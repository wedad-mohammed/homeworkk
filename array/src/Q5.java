public class Q5 {
    import java.util.Arrays;

    public class ArrayCopyExample {
        public static void main(String[] args) {
            int[] original = {1, 2, 3, 4, 5};

            // Example 1: Using a for loop
            int[] backup1 = new int[original.length];
            for (int i = 0; i < original.length; i++) {
                backup1[i] = original[i];
            }

            // Example 2: Using Arrays.copyOf()
            int[] backup2 = Arrays.copyOf(original, original.length);

            // Example 3: Using System.arraycopy()
            int[] backup3 = new int[original.length];
            System.arraycopy(original, 0, backup3, 0, original.length);

            // Print the backups
            System.out.println("Backup 1: " + Arrays.toString(backup1));
            System.out.println("Backup 2: " + Arrays.toString(backup2));
            System.out.println("Backup 3: " + Arrays.toString(backup3));
        }
    }
}

public class Q2 {
    import java.util.*;

    public class RandomArrayRemoval {

        public static void main(String[] args) {
            Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            removeAllRandomly(array);
            System.out.println("Array after removal: " + Arrays.toString(array));
        }

        public static <T> void removeAllRandomly(T[] array) {
            List<T> list = new ArrayList<>(Arrays.asList(array));
            Random random = new Random();
            while (!list.isEmpty()) {
                int indexToRemove = random.nextInt(list.size());
                list.remove(indexToRemove);
            }
        }
    }
}

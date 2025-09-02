public class Task8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int maxValue = Integer.MIN_VALUE;
        int nextValue = Integer.MIN_VALUE;

        for (int j : array) {
            if (j > maxValue) {
                maxValue = j;
            }
        }

        for (int j : array) {
            if (j > nextValue && j != maxValue) {
                nextValue = j;
            }
        }

        System.out.println(nextValue);
    }
}

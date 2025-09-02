public class Task6 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        double sum = 0.0;

        for (int j : array) {
            if (j < minValue) {
                minValue = j;
            } else if (j > maxValue) {
                maxValue = j;
            }
            sum += j;
        }

        double average = (sum - minValue - maxValue) / (array.length - 2);
        System.out.println(average);
    }
}

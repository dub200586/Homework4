import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        int[][] arrayOfArrays = new int[10][10];
        Random rand = new Random();
        int[] maxRowValue = new int[arrayOfArrays.length];

        for (int i = 0; i < 10; i++) {
            int maxValue = Integer.MIN_VALUE;
            for (int j = 0; j < 10; j++) {
                arrayOfArrays[i][j] = rand.nextInt(-10,10);

                if (arrayOfArrays[i][j] > maxValue) {
                    maxValue = arrayOfArrays[i][j];
                }

            }
            maxRowValue[i] = maxValue;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(maxRowValue[i] + " ");
        }
    }
}

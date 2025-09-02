public class Task7 {
    public static void main(String[] args) {
        int[] array = {-1, 2, -3, 4, -5, 6, -7, 8, -9, 10};
        int iterator = 0;

        for (int value : array) {
            if (value < 0) {
                iterator++;
            }
        }

        int[] positiveArray = new int[array.length - iterator];
        int[] negativeArray = new int[iterator];

        for (int i = 0, j = 0, k = 0; i < array.length; i++, j++, k++) {
            if (array[i] >= 0) {
                positiveArray[j] = array[i];
                k--;

            }else {
                negativeArray[k] = array[i];
                j--;
            }
        }

        System.out.println("Положительный массив:");

        for (int j : positiveArray) {
            System.out.println(j);
        }

        System.out.println();

        System.out.println("Отрицательный массив:");
        for (int j : negativeArray) {
            System.out.println(j);
        }
    }
}

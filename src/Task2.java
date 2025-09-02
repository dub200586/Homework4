public class Task2 {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 2, 0, 3, 0, 0};
        int newArrayLenth = 0;

        for (int j : array) {
            if (j != 0) {
                newArrayLenth++;
            }
        }

        int[] newArray = new int[newArrayLenth];

        for (int j : array) {
            if (j != 0) {
                newArray[newArrayLenth - 1] = j;
                System.out.println(newArray[newArrayLenth - 1]);
            }
        }
    }
}

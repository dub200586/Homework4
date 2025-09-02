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

        if (newArrayLenth != 0 && newArrayLenth != array.length) {
            for (int j : array) {
                if (j != 0) {
                    newArray[newArrayLenth - 1] = j;
                    System.out.println(newArray[newArrayLenth - 1]);
                }
            }
        }else {
            for (int i : array) {
                newArray = array.clone();
                System.out.println(i);
            }
        }
    }
}

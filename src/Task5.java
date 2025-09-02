public class Task5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int value = 2;
        int index = 0;
        int[] newArray = new int[array.length - 1];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }

        for (int i = 0, j = 0; i < array.length && j < newArray.length; i++, j++) {
            if (i == index) {
                i++;
            }

            newArray[j] = array[i];
            System.out.println(newArray[j]);
        }
    }
}

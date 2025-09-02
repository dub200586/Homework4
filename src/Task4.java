public class Task4 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int firstInt = array[0];

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                array[i] = firstInt;
                System.out.println(firstInt);
            }else {
                array[i] = array[i + 1];
                System.out.println(array[i]);
            }
        }
    }
}

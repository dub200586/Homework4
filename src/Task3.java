public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        String flag = "";

        for (int i = 0; i < array.length/2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                flag = "не ";
                break;
            }
        }

        System.out.println("Массив " + flag + "является палиндромом");
    }
}

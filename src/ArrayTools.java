import java.util.Arrays;
import java.util.Random;

public class ArrayTools {

    private static int[] fillArray() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    private static void printArray(int[] arr) {
        int j = 0;
        for (int i = 0; i < 2*arr.length; i++ ) {
            if (i < arr.length) {
                System.out.print(arr[i] + " ");
            } else {
                j++;
                System.out.print(arr[arr.length-j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = fillArray();
        System.out.println(Arrays.toString(array));
        printArray(array);
    }
}

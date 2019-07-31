import java.util.Arrays;
import java.util.Random;

public class ArrayTools {

    private static void fillArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
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
        int[] arr = new int[10];
        fillArray(arr);
        System.out.println(Arrays.toString(arr));
        printArray(arr);
    }
}

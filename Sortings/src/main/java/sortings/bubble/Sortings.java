package sortings.bubble;

/**
 * Created by User on 5/24/2017.
 */
public class Sortings {

    private int[] arr;

    public static void bubbleSorting(int[] arr) {
        int end = arr.length - 1;
        while (!isSorted(arr)) {
            for (int i = 0; i < end; i++) {
                swap(arr, i);
                int newEnd = end - 1;
            }
        }

    }

    public static void sillySorting(int[] arr) {

        while (!isSorted(arr)) {
            for (int i = 0; i < arr.length - 1; i++) {
                swap(arr, i);
            }
        }

    }

    private static void swap(int[] arr, int i) {
        if (arr[i] > arr[i + 1]) {
            int temp;
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }

        return true;
    }
}

package sortings.bubble;

import java.util.Arrays;

/**
 * Created by User on 5/24/2017.
 */
public class SosrtingTests {
    public static void main(String[] args) {

        int[] arr = {2, 2, 45, 0, 87, 3, 15};

        System.out.println("before sorting");
        (Arrays.stream(arr)).forEach(i -> System.out.print("[" + i + "]"));

        Sortings.bubbleSorting(arr);

        System.out.println();
        System.out.println("SosrtingTests sorting");
        (Arrays.stream(arr)).forEach(i -> System.out.print("[" + i + "]"));


        /*System.out.println("sillySorting");
        Sortings.sillySorting(arr);
        (Arrays.stream(arr)).forEach(i -> System.out.print("[" + i + "]"));*/

    }
}

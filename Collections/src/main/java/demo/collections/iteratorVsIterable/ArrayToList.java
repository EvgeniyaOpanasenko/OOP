package demo.collections.iteratorVsIterable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by User on 5/3/2017.
 */
public class ArrayToList {
    public static void main(String[] args) {
        String array[] = new String[] {"Array 1", "Array 2", "Array 3"};

        List<String> arrayAsList = Arrays.asList(array);

        System.out.println("Iterator #1");

        Iterator<String> iterator = arrayAsList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

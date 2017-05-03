package demo.collections.iteratorVsIterable;

/**
 * Created by User on 5/3/2017.
 */
public class IterableVsIterator {
    public static void main(String[] args) {
        String[] technologies = {"Java", "JEE", "XML"};
        MyIterable<String> entity = new MyIterable<>(technologies);

        for (String i:entity) {
            System.out.println(i);
        }
    }
}

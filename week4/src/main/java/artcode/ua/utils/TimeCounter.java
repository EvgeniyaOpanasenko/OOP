package artcode.ua.utils;

/**
 * Created by User on 5/11/2017.
 */
public class TimeCounter {

    public static String countActionTime(ITimeAction method ){

        long start = System.nanoTime();
        method.action();
        long end = System.nanoTime();

        return "nanos" + (end - start);
    }


}

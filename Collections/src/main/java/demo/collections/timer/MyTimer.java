package demo.collections.timer;

import java.util.TimerTask;

/**
 * Created by User on 5/22/2017.
 */
public class MyTimer {
    //private static long startTime;
    //private static long endTime;
    private long startTime;
    private long endTime;


    public String countTime(ITimerMethod method) {
        startTime = System.nanoTime();
        method.action();
        endTime = System.nanoTime();
        return "nano time" + (endTime - startTime);
    }
}

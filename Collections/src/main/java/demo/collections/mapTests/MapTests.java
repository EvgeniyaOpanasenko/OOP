package demo.collections.mapTests;

import java.util.*;

/**
 * Created by User on 5/23/2017.
 */
public class MapTests {
    public static void main(String[] args) {
        Map map = new Hashtable();

        map.put(15, "15");
        map.put(2, "anna");
        map.put(3, "three");
        map.put(1, "duplicated");
        map.put(1, "kate");
        // no null
       // map.put(null, "ivan");

        System.out.println("hashMap");
        System.out.println(map);

        Map hashMap = new HashMap();

        hashMap.put(15, "15");
        hashMap.put(2, "anna");
        hashMap.put(3, "three");
        hashMap.put(1, "duplicated");
        hashMap.put(1, "kate");
        hashMap.put(null, null);
        hashMap.put(63, null);

        System.out.println("hashMap");
        System.out.println(hashMap);


        SortedMap treeMap = new TreeMap();

        treeMap.put(15, "15");
        treeMap.put(2, "anna");
        treeMap.put(3, "three");
        treeMap.put(1, "duplicated");
        treeMap.put(1, "kate");
        treeMap.put(56, null);

        System.out.println("treeMap");
        System.out.println(treeMap);

    }
}

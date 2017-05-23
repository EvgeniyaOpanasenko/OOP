package demo.collections.setTests;

import demo.collections.timer.ITimerMethod;
import demo.collections.timer.MyTimer;

import java.util.*;

/**
 * Created by User on 5/22/2017.
 */
public class Run {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Eva");
        set.add("Olga");
        set.add("Eva");
        set.add("Olga");
        set.add("Arina");
        set.add("Larisa");
        set.add("Kterinsa");
        set.add("Pavel");
        set.add("Igor");

        System.out.println("TreeSet");
        System.out.println(set);

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Eva");
        hashSet.add("Olga");
        hashSet.add("Eva");
        hashSet.add("Olga");
        hashSet.add("Arina");
        hashSet.add("Larisa");
        hashSet.add("Kterinsa");
        hashSet.add("Pavel");
        hashSet.add("Igor");

        System.out.println("HashSet");
        System.out.println(hashSet);

        List<String> list = new ArrayList<>();
        list.add("Eva");
        list.add("Olga");
        list.add("Olga");
        list.add("Olga");
        list.add("kate");
        list.add("Pavel");
        list.add("Igor");
        list.add("Olga");
        list.add("Alina");

        System.out.println("ArrayList");
        System.out.println(list);

        Set arrayInSetTest = new TreeSet(list);
        System.out.println("arrayInSetTest");
        System.out.println(arrayInSetTest);

        Set linkedHasgSet = new LinkedHashSet();


    }

    class ListAction implements ITimerMethod{
        private List list;
        private Object o;

        public ListAction(List list) {
            this.list = list;
        }

        @Override
        public void action() {
            list.add(o);
        }
    }

}

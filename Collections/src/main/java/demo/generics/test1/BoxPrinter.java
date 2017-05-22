package demo.generics.test1;

import java.util.List;

/**
 * Created by User on 5/22/2017.
 */
public class BoxPrinter {
    private Object val;

    public BoxPrinter(Object val) {
        this.val = val;
    }

    public Object getVal() {
        return val;
    }

    @Override
    public String toString() {
        return "BoxPrinter{" +
                "val=" + val +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        BoxPrinter value  = new BoxPrinter(new Integer(10));

        System.out.println(value);

        Integer intValue1 = (Integer) value.getVal();

        System.out.println(intValue1);

        BoxPrinter value2 = new BoxPrinter("hello world");

        Integer intValue2 = (Integer) value2.getVal();

        System.out.println(intValue2);


    }
}

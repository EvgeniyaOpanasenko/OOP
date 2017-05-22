package demo.generics.genericTest;

/**
 * Created by User on 5/22/2017.
 */
public class BoxPrinter<T> {
    private T val;

    public T getVal() {
        return val;
    }

    @Override
    public String toString() {
        return "BoxPrinter{" +
                "val=" + val +
                '}';
    }

    public void setVal(T val) {
        this.val = val;
    }

    public BoxPrinter(T val) {
        this.val = val;
    }
}

class Test {

    public static void main(String[] args) {
        BoxPrinter<Integer> value1 = new BoxPrinter<>(23);

        System.out.println(value1);

        Integer intValue1 = value1.getVal();

        BoxPrinter<String> stringValue = new BoxPrinter<>("Hello string value");

        System.out.println(stringValue);

        Integer intValur2 = Integer.valueOf(stringValue.getVal());

    }


}

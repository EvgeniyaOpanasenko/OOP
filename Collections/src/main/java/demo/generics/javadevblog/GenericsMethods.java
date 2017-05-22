package demo.generics.javadevblog;

/**
 * Created by User on 5/22/2017.
 */
public class GenericsMethods {

    public static <T> boolean isEquals(GenericType<T> g1, GenericType<T> g2) {
        return g1.getT().equals(g2.getT());
    }

    public static void main(String[] args) {
        GenericType<String> g1 = new GenericType<>("G1");
        GenericType<String> g2 = new GenericType<>("G2");

        System.out.println(GenericsMethods.isEquals(g1, g2));

        System.out.println(GenericsMethods.<String>isEquals(g1, g2));
    }
}



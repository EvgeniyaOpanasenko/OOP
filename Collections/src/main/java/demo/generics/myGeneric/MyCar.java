package demo.generics.myGeneric;

/**
 * Created by User on 5/22/2017.
 */
public class MyCar {
   private String type;

    public MyCar(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "MyCar{" +
                "type='" + type + '\'' +
                '}';
    }
}

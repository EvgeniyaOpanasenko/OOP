package demo.generics.javadevblog;

/**
 * Created by User on 5/22/2017.
 */
public class GenericType<T> {
    private T t;

    public GenericType(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "GenericType{" +
                "t=" + t +
                '}';
    }
}

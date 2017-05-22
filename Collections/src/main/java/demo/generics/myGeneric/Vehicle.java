package demo.generics.myGeneric;

/**
 * Created by User on 5/22/2017.
 */
public class Vehicle {
    private String title;
    private String holder;

    public Vehicle(String title, String holder) {
        this.title = title;
        this.holder = holder;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "title='" + title + '\'' +
                ", holder='" + holder + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }
}

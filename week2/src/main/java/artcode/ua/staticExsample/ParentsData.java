package artcode.ua.staticExsample;

/**
 * Created by User on 5/2/2017.
 */
public class ParentsData {

    private String mother;
    private String father;

    public ParentsData(String mother, String father) {
        this.mother = mother;
        this.father = father;
    }

    @Override
    public String toString() {
        return "ParentsData{" +
                "mother='" + mother + '\'' +
                ", father='" + father + '\'' +
                '}';
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }
}

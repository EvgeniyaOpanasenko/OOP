package demo.collections.comparatorvsComparable;

import java.util.Comparator;

/**
 * Created by User on 5/3/2017.
 */
public class Country implements Comparable<Country> {

    private String name;
    private long population;
    private String colour;


    public Country(String name, long population, String colour) {
        this.name = name;
        this.population = population;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", colour='" + colour + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public int compareTo(Country o) {
        long comparePopulation = o.getPopulation();
        //ascending order => по возростанию
        return (int) (this.population - comparePopulation);

        //descending order => по убыванию
        //return (int) (comparePopulation - this.population);
    }

    public static Comparator<Country> CountryNameComparator = new Comparator<Country>() {
        @Override
        public int compare(Country o1, Country o2) {

            String countryName1 = o1.getName().toUpperCase();
            String countryName2 = o2.getName().toUpperCase();
            return countryName1.compareTo(countryName2);
        }
    };
}

package demo.collections.comparatorvsComparable;

import java.util.Arrays;

/**
 * Created by User on 5/3/2017.
 */
public class Run {
    public static void main(String[] args) {
        Country country1 = new Country("Ukraine", 10550, "yellow");
        Country country2 = new Country("Russia", 101, "blue");
        Country country3 = new Country("Urof", 1099, "red");
        Country country4 = new Country("psjjd", 10550, "white");

        Country[] countries = new Country[4];

        countries[0]=country1;
        countries[1]=country2;
        countries[2]=country3;
        countries[3]=country4;

        Arrays.sort(countries);

        System.out.println("Sort using comparable");
        int i =0;
        for (Country tem: countries) {
            System.out.println("Country " + ++i + ": " + tem.getName()+
             " population : " + tem.getPopulation());
        }

        Arrays.sort(countries, Country.CountryNameComparator);

        System.out.println("Sort using comparator");
        int k =0;
        for (Country c: countries) {
            System.out.println("Country " + ++k + " : " + c.getName() + " "+ "population : " +
                    c.getPopulation() + " " + "colour : " + c.getColour());
        }

    }
}

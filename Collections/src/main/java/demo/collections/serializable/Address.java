package demo.collections.serializable;

import java.io.Serializable;

/**
 * going to write into file
 */
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;

    private String street;
    private String country;

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

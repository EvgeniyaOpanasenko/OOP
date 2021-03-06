package demo.collections.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by User on 5/4/2017.
 */
public class WriteObject {
    public static void main(String[] args) {

        WriteObject obj = new WriteObject();

        Address address = new Address();
        address.setStreet("wall street");
        address.setCountry("united state");

        obj.serializeAddress(address);

    }

    private void serializeAddress(Address address) {
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;
        try {

            fout = new FileOutputStream("Collections/src/main/resources/address.ser");
            oos = new ObjectOutputStream(fout);
            oos.writeObject(address);

            System.out.println("Done");

        } catch (Exception ex) {

            ex.printStackTrace();

        } finally {

            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public void serializeAddressJDK7(Address address) {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("c:\\temp\\address2.ser"))) {

            oos.writeObject(address);
            System.out.println("Done");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
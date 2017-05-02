package artcode.ua.encapsulationtest;

/**
 * Created by User on 4/30/2017.
 */
public class VkSystem {

    private String password;
    private String accessKey;
    private String additionalInfo;
    private int count;

    private String connectToServer(){
        return null;
    }

    public boolean login(String name, String password) {
        printHello();
        return true;
    }

    private void printHello() {
        System.out.println("Hello u are in out system");
    }
}

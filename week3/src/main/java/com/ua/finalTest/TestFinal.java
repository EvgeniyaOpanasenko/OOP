package com.ua.finalTest;

/**
 * Created by User on 5/8/2017.
 */
public class TestFinal {

    public static void main(String[] args) {
        Key key = new Key("123", 4);


       //side eefect
        //shareKey(key);
       /* key = new Key("456");
        System.out.println(openDoor(key));*/
        System.out.println(openDoor(key));
    }


    public static boolean openDoor(Key key) {

        //final Key trueKey = new Key("456");
        return key.getValue().equals("123");
    }
}

class Key {

    private final String value;
    private final int count;

    public Key(String value, int count) {
        this.value = value;
        this.count = count;
    }

    public String getValue() {
        return value;
    }

    // you cannot chane final => so setter gives compilation mistake
   /* public void setValue(String value) {
        this.value = value;
    }*/
}

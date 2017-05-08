package com.ua.finalTest;

/**
 * Created by User on 5/8/2017.
 */
public class IPhone {

    private final String version;
    private final String id;
    private final String description;
    private final Ram ram;
    private final ScreenIphone screen;


    public IPhone(String version, String id, String description, Ram ram, ScreenIphone screen) {
        this.version = version;
        this.id = id;
        this.description = description;
        this.ram = ram;
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "version='" + version + '\'' +
                ", id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", ram=" + ram +
                ", screen=" + screen +
                '}';
    }

    public String getVersion() {
        return version;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Ram getRam() {
        return ram;
    }

    public ScreenIphone getScreen() {
        return screen;
    }

    public final void playGame(){
        System.out.println("Original plays");
    }
}

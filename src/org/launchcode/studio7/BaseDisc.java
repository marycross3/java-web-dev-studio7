package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {
    private String name;
    private int storageCapacity;
    private int currentCapacity;
    private ArrayList<String> contents;

    public String StringBuilder(){
        return name +
                "\nStorage Capacity: " + storageCapacity +
                "\nCurrent Capacity: " + currentCapacity +
                "\nContents: " + contents ;
    };
    @Override
    public String toString() {

        return StringBuilder();
    }

    public BaseDisc(){
        this.name = "Blank Disc";
        this.storageCapacity = 1000;
        this.currentCapacity = 1000;
        this.contents = null;

    }
    public BaseDisc(String name, int storageCapacity, int currentCapacity, ArrayList<String> contents) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.currentCapacity = currentCapacity;
        this.contents = contents;
    }

    public String getName() {
        return name;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public void setContents(ArrayList<String> contents) {
        this.contents = contents;
    }
}

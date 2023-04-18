package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc{
    String director;
    public DVD(String name, int storageCapacity, int currentCapacity, ArrayList<String> contents, String director) {
        super(name, storageCapacity, currentCapacity, contents);
        this.director = director;

    }
    @Override
    public String spinDisc() {
        return "A DVD spins at a rate of 570 - 1600 rpm.\n";
    }

    @Override
    public String readDisc() {
        return "Now playing " + getName();

    }

    @Override
    public String writeData(String data, int size) {
        if (size > getStorageCapacity() || size + getCurrentCapacity() > getStorageCapacity()) {
            return "Not enough space available.";
        } else {
            setCurrentCapacity(getCurrentCapacity()+ size);
            return data+ " added to "+ getName()
                    +"\nStorage Capacity remaining: "+ getCurrentCapacity();
        }
    }

    @Override
    public String toString() {
        return StringBuilder() + "\nDirector: "+ director;
    }
// TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}

package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.Collections;

public class CD extends BaseDisc implements OpticalDisc{
    String artist;


    public CD(String name, int storageCapacity, int currentCapacity, ArrayList<String> contents,String artist) {
        super(name, storageCapacity, currentCapacity, contents);
        this.artist = artist;

    }

    @Override
    public String spinDisc() {
        return "A CD spins at a rate of 200 - 500 rpm.";
    }

    @Override
    public String readDisc() {
        return "Now playing "+ getContents();
    }

    @Override
    public String writeData(String data, int size) {
        if (size > getStorageCapacity() || size + getCurrentCapacity() > getStorageCapacity()) {
           return "Not enough space available.";
        } else {
            setCurrentCapacity(getCurrentCapacity() + size);
            Collections.addAll(getContents(),data);
            return data+ " added to "+ getName()
                    +"\nStorage Capacity remaining: "+ (getStorageCapacity()- getCurrentCapacity());
        }
    }

    @Override
    public String toString() {
        return StringBuilder() + "\nArtist: " +artist;
    }
// TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}

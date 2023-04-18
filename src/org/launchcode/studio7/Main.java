package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args){
        ArrayList<String> songList = new ArrayList<>();
        Collections.addAll(songList,"Blew", "About a girl", "Paper cuts");
        // TODO: Declare and initialize a CD and a DVD object.
        CD Bleach = new CD("Bleach",2000, 500, songList, "Nirvana");

        System.out.println(Bleach.toString());;
        System.out.println(Bleach.spinDisc());
        System.out.println(Bleach.writeData("New Track", 200));
        System.out.println(Bleach.getContents());
        System.out.println(Bleach.readDisc());


        // TODO: Call each CD and DVD method to verify that they work as expected.
        ArrayList<String> sceneList = new ArrayList<>();
        Collections.addAll(sceneList, "when they meet", "first date", "fall in love", "ally goes to college",
                "they fall back in love", "die together in love");
        System.out.println("\n-----------------------------------\n");
        DVD Notebook = new DVD("The Notebook", 100_000, 80_000, sceneList, "Nick Cassavetes");
        System.out.println(Notebook.toString());
        System.out.println(Notebook.spinDisc());
        System.out.println(Notebook.readDisc());

    }
}

package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){


        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD();
        DVD dvd = new DVD();


        // TODO: Call each CD and DVD method to verify that they work as expected.

        System.out.println("DVD loaded: " + dvd.getIsLoaded());
        System.out.println("CD loaded: " + cd.getIsLoaded());


        cd.load();
        dvd.load();

        System.out.println(cd.getMetaData());
        System.out.println(dvd.getMetaData());

        System.out.println("CD loaded: " + cd.getIsLoaded());
        System.out.println("DVD loaded: " + dvd.getIsLoaded());

        System.out.println(cd.spinDisk());
        System.out.println(dvd.spinDisk());

        cd.playMedia();
        dvd.playMedia();

    }
}

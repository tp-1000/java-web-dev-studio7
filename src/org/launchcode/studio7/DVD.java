package org.launchcode.studio7;

public class DVD extends Opticaldisk implements Playablemedia {

    @Override
    public void playMedia() {
        System.out.println("DVD playing");
    }

    @Override
    public void stopMedia() {
        System.out.println("DVD stopped");
    }

    @Override
    public void write() {
        System.out.println("DVD data written");
    }

    @Override
    public Object read() {
        System.out.println("DVD was read");
        return"Data";
    };

    @Override
    public boolean getIsLoaded() {
        return isLoaded;
    }

    @Override
    public String spinDisk() {
        return "A DVD spins at a rate of 570 - 1600 rpm.";
    }

    @Override
    public void load() {
        System.out.println("DVD data loaded");
        isLoaded = true;
    }
 }

package org.launchcode.studio7;

public class CD extends Opticaldisk implements Playablemedia{

    public void playMedia() {
        System.out.println("CD playing");
    }

    public void stopMedia() {
        System.out.println("CD stopped");
    }

    public void write() {
        System.out.println("CD data written");
    };

    public Object read() {
        System.out.println("CD was read");
        return "Data";
    };

    @Override
    public String spinDisk() {
        return "A CD spins at a rate of 200 - 500 rpm.";
    };

    @Override
    public void load() {
        System.out.println("CD data loaded");
        isLoaded = true;
    }

    
    public boolean getIsLoaded() {
        return isLoaded;
    }

}

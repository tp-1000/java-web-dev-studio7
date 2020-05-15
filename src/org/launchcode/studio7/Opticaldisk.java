package org.launchcode.studio7;

public abstract class Opticaldisk {
    protected boolean isLoaded = false;

    public abstract void playMedia();

    public abstract void stopMedia();

    public abstract void write();

    public abstract Object read();

    public String getMetaData() {
            if(!isLoaded) {
                throw new IllegalArgumentException("Data needs to be loaded before accessing it");
            }
            return "Name, capacity, contents";
        };

    public abstract boolean getIsLoaded();
}

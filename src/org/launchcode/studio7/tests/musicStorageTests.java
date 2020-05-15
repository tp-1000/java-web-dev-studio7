package org.launchcode.studio7.tests;

import org.junit.Test;
import org.launchcode.studio7.CD;
import org.launchcode.studio7.DVD;

import static org.junit.Assert.*;

public class musicStorageTests {

    @Test
    public void cdDisplaysMetaDataIfLoaded() {
        CD cd = new CD();
        cd.load();

        String metadata = cd.getMetaData();

        assertEquals(metadata, "Name, capacity, contents, disk type");
    }

    @Test (expected = IllegalArgumentException.class)
    public void cdDisplaysErrorInsteadOfMetaDataIfNotLoaded() {
        CD cd = new CD();

        String metadata = cd.getMetaData();

        fail("Cannot request loaded data if no data is loaded");
    }

    @Test
    public void cdLoads() {
        CD cd = new CD();


        cd.load();

        assertTrue(cd.getIsLoaded());
    }

      @Test
    public void cdSpinDiskIsDifferentForCDAndDVD() {
        CD cd = new CD();
        DVD dvd = new DVD();

        boolean isDifferentValue = !cd.spinDisk().equals(dvd.spinDisk());

        assertTrue(isDifferentValue);
    }


}

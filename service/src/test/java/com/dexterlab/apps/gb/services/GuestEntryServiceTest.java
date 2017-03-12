package com.dexterlab.apps.gb.services;

import com.dexterlab.apps.gb.GuestEntry;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * author : innsh
 * created on 05-02-2017
 */
public class GuestEntryServiceTest {
    @Test
    public void addGuestEntry() throws Exception {
        GuestEntryService service = new GuestEntryService();
        service.addGuestEntry(new GuestEntry());
        Assert.assertEquals(1, service.getGuestEntries().size());
    }
}
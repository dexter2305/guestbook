/**
 * Copyright © - Software AG, Darmstadt, Germany and/or Software AG USA Inc., Reston, VA, USA, and/or its subsidiaries and/or its affiliates and/or their licensors.
 * Use, reproduction, transfer, publication or disclosure is prohibited except as specifically provided for in your License Agreement with Software AG.
 */
package com.dexterlab.apps.gb.services;

import com.dexterlab.apps.gb.GuestEntry;
import com.dexterlab.apps.gb.dao.GuestEntryDAO;

import java.util.Collection;

/**
 * author : innsh
 * created on 05-02-2017
 */
public class GuestEntryService {

    private GuestEntryDAO guestEntryDAO = new GuestEntryDAO();

    public void addGuestEntry(GuestEntry entry){
        guestEntryDAO.addEntry(entry);
    }

    public Collection<GuestEntry> getGuestEntries(){
        return guestEntryDAO.getEntries();
    }
}

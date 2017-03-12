/**
 * Copyright © - Software AG, Darmstadt, Germany and/or Software AG USA Inc., Reston, VA, USA, and/or its subsidiaries and/or its affiliates and/or their licensors.
 * Use, reproduction, transfer, publication or disclosure is prohibited except as specifically provided for in your License Agreement with Software AG.
 */
package com.dexterlab.apps.gb.dao;

import com.dexterlab.apps.gb.GuestEntry;

import java.util.Collection;
import java.util.LinkedList;

/**
 * author : innsh
 * created on 05-02-2017
 */
public class GuestEntryDAO {

    private Collection<GuestEntry> entries = new LinkedList<>();

    public void addEntry(GuestEntry entry) {
        entries.add(entry);
    }

    public Collection<GuestEntry> getEntries() {
        return entries;
    }
}

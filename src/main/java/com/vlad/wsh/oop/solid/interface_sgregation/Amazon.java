package com.vlad.wsh.oop.solid.interface_sgregation;

import java.util.List;

/**
 * larger interfaces should be split into smaller ones. By doing so,
 * we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.
 */
public class Amazon implements CloudeStorageProvider, CDNProvider, CloudHostingProvider {
    @Override
    public void getCDNAddress() {

    }

    @Override
    public void createServer(String region) {

    }

    @Override
    public List<String> listServer(String region) {
        return null;
    }

    @Override
    public String storeFile(String name) {
        return null;
    }

    @Override
    public void getFile(String name) {

    }
}

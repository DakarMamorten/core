package com.vlad.wsh.oop.solid.interface_sgregation;

public interface CloudeStorageProvider {
    String storeFile(String name);

    void getFile(String name);
}

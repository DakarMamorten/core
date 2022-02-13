package com.vlad.oop.solid.interface_sgregation;

public interface CloudStorageProvider {
    String storeFile(String name);

    void getFile(String name);
}

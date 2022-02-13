package com.vlad.oop.solid.interface_sgregation;

import java.util.List;

public interface CloudHostingProvider {
    void createServer(String region);

    List<String> listServer(String region);
}

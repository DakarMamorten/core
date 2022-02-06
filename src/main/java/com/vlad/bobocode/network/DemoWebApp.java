package com.vlad.bobocode.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;

public class DemoWebApp {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8899)) {
            while (true) {
                try (var cleint = serverSocket.accept()) {
                    var reader = new BufferedReader(new InputStreamReader(cleint.getInputStream()));
                    var line = reader.readLine();
                    System.out.println(cleint.getInetAddress().getHostAddress() + " - " + line);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

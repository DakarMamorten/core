package com.vlad.bobocode.network;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author Sergey Manko
 */
public class DemoWebClient {
    public static void main(String[] args) {
        try (var serverSocket = new Socket(InetAddress.getLocalHost().getHostAddress(), 8899)) {
            var writer = new BufferedWriter(new OutputStreamWriter(serverSocket.getOutputStream()));
            var massage = "Hello \n";
            writer.write(massage);
            writer.flush();

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

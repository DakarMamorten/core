package com.vlad.bobocode.network;

import lombok.SneakyThrows;

import java.io.*;
import java.net.Socket;

public class MorningClient {
    @SneakyThrows
    public static void main(String[] args) {
        Socket clientSocket = new Socket("93.175.204.87", 8080);
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        printWriter.println("GET /morning?name=Vlad HTTP/1.1");
        printWriter.println("Host: 93.175.204.87");
        printWriter.println();
        printWriter.flush();
        InputStream inputStream = clientSocket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        bufferedReader.lines().forEach(System.out::println);
    }
}

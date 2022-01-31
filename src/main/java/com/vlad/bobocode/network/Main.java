package com.vlad.bobocode.network;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;


public class Main {
    public static void main(String[] args) {
        try(var serverSocket = new Socket(InetAddress.getLocalHost().getHostAddress(),8899)){
            var writer = new BufferedWriter(new OutputStreamWriter(serverSocket.getOutputStream()));
            var massage = "Hello \n";
            writer.write(massage);
            writer.flush();

        }catch (IOException exception){
            exception.getMessage();
        }




    //Print hello from another thread in 4 different ways
    //1. By creating Thread
    //2. By creating and passing logic to Executor
    //2. By creating action and passing it to common Fork/Join pool
    //2. By creating logic to CompletableFuture
//        Runnable printLogic = () -> System.out.println("Hello from " + Thread.currentThread().getName());
//        //1
//        new Thread(printLogic).start();
//        //2
//        new Executor() {
//            @Override
//            public void execute(Runnable command) {
//                command.run();
//            }
//        }.execute(printLogic);
//        //3
//        ForkJoinPool.commonPool().execute(printLogic);
//        //4


}
}

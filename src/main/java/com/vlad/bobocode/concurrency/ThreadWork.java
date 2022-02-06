package com.vlad.bobocode.concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;

/**
 * Execute some logic from another thread in 4 different ways
 */
public class ThreadWork {
    public static void main(String[] args) {
        executeByThread();
        executeByExecutor();
        executeByCompletableFuture();
        executeByForkJoin();
    }

    /**
     * We create object Thread and call method start()
     */
    private static void executeByThread() {
        new Thread(someLogic()).start();
    }

    /**
     * We create object Executor and call method execute() inside we call run()
     */
    private static void executeByExecutor() {
        new Executor() {
            @Override
            public void execute(Runnable command) {
                command.run();
            }
        }.execute(someLogic());
    }

    /**
     * We create object ForkJoinPool and call methods commandPool() and execute()
     */
    private static void executeByForkJoin() {
        ForkJoinPool.commonPool().execute(someLogic());
    }

    /**
     * We create object CompletableFuture and call methods supplyAsync() and thenAccept()
     */
    private static void executeByCompletableFuture() {
        CompletableFuture
                .supplyAsync(ThreadWork::someLogic)
                .thenAccept(s -> System.out.println("Hello from: " + Thread.currentThread().getName()));
    }

    private static Runnable someLogic() {
        return () -> System.out.println("Hello from: " + Thread.currentThread().getName());
    }
}

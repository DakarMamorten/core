package com.vlad.wsh.oop.solid.liskov_sub;

public class Engine {
    public void on() {
        System.out.println("Power on");
    }

    public void powerOn(int i) {
        if (i < 500) {
            System.out.println("power is low");
        } else if (i > 1000) {
            System.out.println("power is midl");
        } else {
            System.out.println("power is higth");
        }
    }
}

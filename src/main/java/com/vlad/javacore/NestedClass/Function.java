package com.vlad.javacore.NestedClass;

public abstract class Function {
    public abstract int function(int n);

    public int calculate(int begin, int end) {
        return function(end) - function(begin);
    }
}

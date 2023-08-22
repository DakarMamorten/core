package com.vlad.javacore.NestedClass;

public class MathFunction {
    private class Square extends Function {
        @Override
        public int function(int n) {
            return n * n;
        }
    }

    private class Cube extends Function {
        @Override
        public int function(int n) {
            return n * n * n;
        }
    }

    public Function getSquare() {
        return new Square();
    }

    public Function getCube() {
        return new Cube();
    }
}

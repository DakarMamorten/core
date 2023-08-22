package com.vlad.javacore.NestedClass;

public class Main {
    public static void main(String[] args) {
        Letter l = new Letter("Alexander");
        Letter.Address addr = l.new Address(1);

        Letter.Address2 addr2 = l.new Address2(1);
        System.out.println(addr2.getLetterSender());


        MathFunction mf = new MathFunction();
        System.out.println(calculate(mf.getSquare(), 1, 4));
        System.out.println(calculate(mf.getCube(), 1, 4));
    }
    public static int calculate(Function fun, int begin, int end) {
        return fun.calculate(begin, end);
    }
}

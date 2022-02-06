package com.vlad.epam.generic;

public class ContainerTest {
    public static void main(String[] args) {
        IntegerContainer integerContainer = new IntegerContainer();
        integerContainer.addElement(10);
        integerContainer.addElement(11);
        integerContainer.addElement(21);

        Container<Integer> container = new Container<>();
        container.addElement(23);

        Container<Double> doubleContainer = new Container<>();
        doubleContainer.addElement(23.45);

        Container<Float> floatContainer = new Container<>(5);
        floatContainer.addElement(10.8f);

        Container<Short> shortContainer = new Container<>();
        shortContainer.addElement(Short.valueOf("22"));

        //test key-value container

        KeyValueContainer<Integer, String> keyValueContainer = new KeyValueContainer<>();
        keyValueContainer.add(153, "January");
        keyValueContainer.add(2, "February");
        String value = keyValueContainer.delete(2);
        /*keyValueContainer.add(2, "February");*/
        System.out.println(value);

        MyContainer<Integer> myContainer = new MyContainer<>();
        myContainer.add(2);
        myContainer.add(4);
        myContainer.add(5);

        myContainer.add(11, 10);
//        myContainer.remove(0);
        myContainer.print();


    }
}

package com.vlad.education;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Employee, Long> map = new HashMap<>();
        List<String> stringList = new ArrayList<>();
        stringList.add("Vlad");

        Employee employee = new Employee(new Address("123","321","333"),"Vlad",stringList, LocalDate.now() );



        employee.getCodes().add("Vasya");

        System.out.println(employee);
//
//        Employee employee = new Employee("Vlad");
//
//        map.put(employee, 5L);
//        map.put(new Employee("Sergii"), 15L);
//
////        employee.setName("Vasya");
//        calculateSalary(map);
//        System.out.println(map.get(new Employee("Vlad")));
//        System.out.println(map);

//        String s = "test";
//        s.toUpperCase();
//        System.out.println(s);
////        System.out.println(sUpper);
//
//        LocalDate date = LocalDate.now();
//        LocalDate localDate = date.minusDays(10);
//        System.out.println(localDate);
    }

//    private static void calculateSalary(Map<Employee, Long> map) {
//        map.keySet().forEach(e -> e.setName("GGG"));
//    }
}

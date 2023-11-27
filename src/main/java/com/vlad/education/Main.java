package com.vlad.education;

public class Main {
    public static void main(String[] args) {


//        People worker = new Worker("Vlad ", LocalDate.of(1996, 4, 25), true);
//        People juniorWorker = new JuniorWorker("Kirill", LocalDate.of(1996, 4, 25));
//        List<People> workersList = new ArrayList<>();
//        workersList.add(worker);
//        workersList.add(juniorWorker);


//        Map<Address, Long> map = new HashMap<>();
//        Address address = new Address("1-Str", "sd", "fg");
//        for (int i = 0; i < 5_000; i++) {
//            map.put(new Address(UUID.randomUUID().toString(),UUID.randomUUID().toString(),UUID.randomUUID().toString()),3L);
//        }
//        map.put(address,3L);
//        long start = System.nanoTime();
//        map.get(address);
//        long end = System.nanoTime();
//        System.out.println(end-start);


//        //equals & hashcode
//        Set<Address> addresses = new HashSet<>();
//        Address address = new Address("1-Str", "sd", "fg");
//        addresses.add(address);
//        Address address1 = new Address("1-Str", "sd123", "fg");
//        addresses.add(address1);
//        System.out.println(addresses);
//        addresses.forEach(a-> System.out.println(a.hashCode()));
//        System.out.println(addresses.contains(address1));
//
//        Map<Address,Long> map = new HashMap<>();
//        map.put(address,5L);
//        map.put(address1,10L);
//        System.out.println(map);

//        String str1 = "Vlad";
//        String str2 = new String("Vlad");
//
//        System.out.println(str1 == str2);
//        String intern = str2.intern();
//        System.out.println(str1 == intern);


//        Map<Employee, Long> map = new HashMap<>();
//        List<String> stringList = new ArrayList<>();
//        stringList.add("Vlad");
//
//        Employee employee = new Employee(new Address("123","321","333"),"Vlad",stringList, LocalDate.now() );
//
//
//
//        employee.getCodes().add("Vasya");
//
//        System.out.println(employee);
//
//        Employee employee =Employee.of();
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

package com.vlad.education.functionProgramming;

import com.vlad.education.Address;
import com.vlad.education.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExamples {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyByTwo = x -> x * 2;

        int result = multiplyByTwo.apply(5);
        System.out.println("Результат: " + result);

        Function<String, Long> stringLongFunction = s -> Long.valueOf(s.length());
        List<Employee> employeeList = List.of(
                Employee.of(new Address("Street1", "10", "5"), "Ihor", List.of("8", "6", "12", "8", "10", "6"), LocalDate.now()),
                Employee.of(new Address("Street2", "11", "3"), "Bohdan", List.of("8", "6", "10"), LocalDate.now()),
                Employee.of(new Address("Street3", "12", "2"), "Artur", List.of("12", "12", "12"), LocalDate.now())
        );
        Function<List<Employee>, List<EmployeeDTO>> convertEmployeeToDTO = e -> {
            List<EmployeeDTO> listEmployeeDTO = new ArrayList<>();
            for (Employee employee : e) {
                EmployeeDTO employeeDTO = new EmployeeDTO();
                employeeDTO.setName(employee.getName());
                employeeDTO.setAddress(employee.getAddress().getFullAddress());
                double salary = 0.0;
//                for (int i = 0; i < employee.getCodes().size(); i++) {
//                    salary+=Double.valueOf(employee.getCodes().get(i))*27;
//                }
                for (String code : employee.getCodes()) {
                    salary += Double.valueOf(code) * 27;
                }
                employeeDTO.setSalary(salary);

                listEmployeeDTO.add(employeeDTO);
            }
            return listEmployeeDTO;
        };

        BiFunction<Integer, List<Employee>, List<EmployeeDTO>> convertEmployeeToDTO2 = (s,e) -> {
            List<EmployeeDTO> listEmployeeDTO = new ArrayList<>();
            for (Employee employee : e) {
                EmployeeDTO employeeDTO = new EmployeeDTO();
                employeeDTO.setName(employee.getName());
                employeeDTO.setAddress(employee.getAddress().getFullAddress());
                double salary = 0.0;
                for (String code : employee.getCodes()) {
                    salary += Double.valueOf(code) * s;
                }
                employeeDTO.setSalary(salary);

                listEmployeeDTO.add(employeeDTO);
            }
            return listEmployeeDTO;
        };
        printSalary(employeeList,convertEmployeeToDTO);
        printSalary(27,employeeList,convertEmployeeToDTO2);
    }

    private static void printSalary(List<Employee> employeeList, Function<List<Employee>, List<EmployeeDTO>> function) {
        System.out.println(function.apply(employeeList));
    }

    private static void printSalary(Integer percent,List<Employee> employeeList, BiFunction<Integer,List<Employee>, List<EmployeeDTO>> function) {
        System.out.println(function.apply(percent,employeeList));
    }

}

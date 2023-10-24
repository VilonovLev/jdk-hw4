package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        EmployeesList<Employee> employeesList = new EmployeesList<>(new Stack<>());
        employeesList.add(new Employee(89999889,"Viktor",3));
        employeesList.add(new Employee(89999889,"Dmitry",23));
        System.out.println(employeesList);

        int[] numbers = employeesList.findNumbersByName("Dmitry");
        System.out.println(Arrays.toString(numbers));

        Employee employee = employeesList.findByExp(20).get(0);

        System.out.println(employeesList.findByExp(2));

        System.out.println(employeesList.findByUUID(employee.getID()));
        Set<String> strs = new HashSet<>(Arrays.asList("aaaa","bbb","aa","bbbb","bbb"));

        strs = strs.stream().filter( x -> !x.contains("aaa")).collect(Collectors.toSet());
        System.out.println(strs);

    }
}
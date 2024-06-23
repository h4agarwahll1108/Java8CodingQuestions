package com.harshit1108.ObjectJava8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeListMain {

    public static void main(String[] args) {
        List<Employee> empList = List.of(
                new Employee(1L, "Max", 2500.00, 20, true, 'M'),
                new Employee(2L, "Dolly", 7500.00, 23, true, 'F'),
                new Employee(3L, "Alice", 3500.00, 16, true, 'F'),
                new Employee(4L, "Bob", 1500.00, 56, true, 'M'),
                new Employee(5L, "Eve", 6500.00, 76, true, 'M'),
                new Employee(6L, "Max", 8500.00, 2, true, 'M')
        );
//        System.out.println(empList);
//        [Employee{id=1, name='Harshit', salary=2500.0, age=26, flag=true, gender=M},
//        Employee{id=2, name='Doly', salary=7500.0, age=23, flag=true, gender=F},
//        Employee{id=3, name='Alice', salary=3500.0, age=16, flag=true, gender=F},
//        Employee{id=4, name='Bob', salary=1500.0, age=56, flag=true, gender=M},
//        Employee{id=5, name='Eve', salary=6500.0, age=76, flag=true, gender=M},
//        Employee{id=6, name='Max', salary=8500.0, age=6, flag=true, gender=M}]

        //Q: Sort employee based on salary
        List<Employee> e = empList.stream()
                .sorted(Comparator.comparing(Employee::getSalary)
                        .reversed())
                .collect(Collectors.toList());
        System.out.println(e);

        //sort employee based on name
        List<Employee> e1 = empList.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        System.out.println(e1);

        // Q: find employee whose age start with 2
//        List<Employee> e2 = empList.stream()
//        .filter(i->(i.getAge()==2 || i.getAge()>=20 && i.getAge()<30))
//        .collect(Collectors.toList());
        //above will not work if age is 2
        List<Employee> e2 = empList.stream()
                .filter(i->String.valueOf(i.getAge()).startsWith("2"))
                .collect(Collectors.toList());
        System.out.println(e2);

        //Q: count the employee based on their name--Most ASKED
        //forEach is a ternary operation after that intermediate operation we cannot perform
        //empList.stream().forEach(s->{ String r = s.getName(); System.out.println(r);}); //print name
        Map<String, Long> e3 = empList.stream().map(i->i.getName())
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(e3);



    }
}

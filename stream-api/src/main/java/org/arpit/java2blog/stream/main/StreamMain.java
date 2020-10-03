package org.arpit.java2blog.stream.main;

import org.arpit.java2blog.stream.model.Employee;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        List<Employee> employees = getListOfEmployee();

        employeeAgeGreaterThan30(employees);

        employeeCountAgeGraterThan25(employees);

        employeeNameisJohn(employees);

        employeeMaxAge(employees);

        employeeSortByAge(employees);

        employeeJoinName(employees);
    }

    /**
     * @desc Given a list of employees, you need to find all the employees whose age is greater than 30 and print the employee
     * @param employees
     */
    private static void employeeAgeGreaterThan30(List<Employee> employees) {
        List<String> empEta = employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .map(employee -> employee.getName())
                .collect(Collectors.toList());
        System.out.println("I dipendenti con più di 30 anni sono: " + empEta);
    }

    /**
     * @desc Given the list of employees, find the count of employees with age greater than 25
     * @param employees
     */
    private static void employeeCountAgeGraterThan25(List<Employee> employees){

        long ageCount = employees.stream()
                .filter(employee -> employee.getAge() > 25)
                .count();
        System.out.println("I dipendenti con più di 25 anni sono: " + ageCount);
    }

    /**
     * @desc Given the list of employees, find the employee whose name is John
     * @param employees
     */
    private static void employeeNameisJohn(List<Employee> employees) {

        employees.stream()
                .filter(employee -> employee.getName().equals("John"))
                .forEach(employee -> System.out.println("I dipendenti con nome John sono: " +employee));

    }

    /**
     * @desc Given a list of employees, You need to find highest age of employee
     * @param employees
     */
    private static void employeeMaxAge(List<Employee> employees) {

        Optional<Employee> max = employees.stream()
                .max(Comparator.comparing(Employee::getAge));

        System.out.println("L\'età più alta è di: " + max.get());

    }

    /**
     * @desc Given a list of employees, you need sort employee list by age
     * @param employees
     */
    private static void employeeSortByAge(List<Employee> employees) {
        List<Employee> employeeList = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toList());

        System.out.println("Lista ordinata per età decrescente: "+employeeList);
    }

    /**
     * @desc Given the list of Employees, you need to join the all employee names with ","
     * @param employees
     */
    private static void employeeJoinName(List<Employee> employees) {
        String joinName = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(","));
        System.out.println("Nomi separati da virgola: "+joinName);
    }

    private static List<Employee> getListOfEmployee() {

        List<Employee> employeeList = new ArrayList<>();

        Employee e1 = new Employee("Mohan", 24, Arrays.asList("Newyork", "Bangalore"));
        Employee e2 = new Employee("John", 27, Arrays.asList("Paris", "London"));
        Employee e3 = new Employee("Vaibhav", 32, Arrays.asList("Pune", "Seattle"));
        Employee e4 = new Employee("Amit", 22, Arrays.asList("Chennai", "Hyderabad"));

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);


        return employeeList;
    }
}

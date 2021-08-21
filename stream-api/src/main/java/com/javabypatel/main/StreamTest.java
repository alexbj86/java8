package com.javabypatel.main;

import com.javabypatel.model.Address;
import com.javabypatel.model.MobileNumber;
import com.javabypatel.model.Student;
import com.javabypatel.model.TempStudent;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        Student student1 = new Student("Jayesh", 20, new Address("1234"), Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));
        Student student2 = new Student("Khyati", 20, new Address("1235"), Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));
        Student student3 = new Student("Jason", 20, new Address("1236"), Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

        List<Student> students = Arrays.asList(student1, student2, student3);

        /*****************************************************
         Get student with exact match name "jayesh"
         *****************************************************/
        students.stream().filter(student -> student.getName().equalsIgnoreCase("jayesh")).findFirst().ifPresent(System.out::println);
        System.out.println("-----------------------------------------------------");

        /*****************************************************
         Get student with matching address "1235"
         *****************************************************/

        students.stream().filter(student -> student.getAddress().getZipcode().equals("1235")).findFirst().ifPresent(System.out::println);
        System.out.println("-----------------------------------------------------");

        /*****************************************************
         Get all student having mobile numbers 3333.
         *****************************************************/
        students.stream()
                .filter(student -> student.getMobileNumbers().stream().anyMatch(mobileNumber -> Objects.equals(mobileNumber.getNumber(), "3333")))
                .collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("-----------------------------------------------------");

        /*****************************************************
         Get all student having mobile number 1233 and 1234
         *****************************************************/
        students.stream()
                .filter(student -> student.getMobileNumbers().stream().allMatch(mobileNumber -> Objects.equals(mobileNumber.getNumber(), "1233") || Objects.equals(mobileNumber.getNumber(), "1234")))
                .collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("-----------------------------------------------------");

        /*****************************************************
         Create a List<Student> from the List<TempStudent>
         *****************************************************/
        TempStudent tempStudent = new TempStudent("Alex", 35, new Address("1234"), Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));
        TempStudent tempStudent2 = new TempStudent("Marco", 26, new Address("3210"), Arrays.asList(new MobileNumber("2222"), new MobileNumber("3333")));
        List<TempStudent> tempStudents = Arrays.asList(tempStudent, tempStudent2);
        List<Student> studentList = tempStudents.stream().map(tmpStudent -> new Student(tmpStudent.getName(), tmpStudent.getAge(), tmpStudent.getAddress(), tmpStudent.getMobileNumbers())).collect(Collectors.toList());
        studentList.stream().forEach(System.out::println);
        System.out.println("-----------------------------------------------------");

        /*****************************************************
         Convert List<Student> to List<String> of student name
         *****************************************************/
        List<String> names = students.stream().map(Student::getName).collect(Collectors.toList());
        names.stream().forEach(System.out::println);
        System.out.println("-----------------------------------------------------");

        /*****************************************************
         Convert List<students> to String
         *****************************************************/
        String name = students.stream().map(Student::getName).collect(Collectors.joining(",", "[", "]"));
        System.out.println(name);
        System.out.println("-----------------------------------------------------");

        /*****************************************************
         Change the case of List<String>
         *****************************************************/
        List<String> nameToUpper = students.stream().map(student -> student.getName().toUpperCase()).collect(Collectors.toList());
        nameToUpper.stream().forEach(System.out::println);
        System.out.println("-----------------------------------------------------");

        /*****************************************************
         Sort List<String>
         *****************************************************/
        students.stream().map(Student::getName).sorted().collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("-----------------------------------------------------");
    }
}

package org.arpit.java2blog.stream.model;

import java.util.List;

public class Employee {

    private String name;
    private int age;
    private List<String> city;

    public Employee() {
    }

    public Employee(String name, int age, List<String> city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getCity() {
        return city;
    }

    public void setCity(List<String> city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", eta=" + age +
                ", city=" + city +
                '}';
    }
}

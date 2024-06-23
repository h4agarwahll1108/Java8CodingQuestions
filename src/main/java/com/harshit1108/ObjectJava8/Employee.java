package com.harshit1108.ObjectJava8;

public class Employee {

    Long id;
    String name;

    Double salary;

    int age;

    boolean flag;

    char gender;

    public Employee() {
    }

    public Employee(Long id, String name, Double salary, int age, boolean flag, char gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.flag = flag;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public boolean isFlag() {
        return flag;
    }

    public char getGender() {
        return gender;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", flag=" + flag +
                ", gender=" + gender +
                '}';
    }
}

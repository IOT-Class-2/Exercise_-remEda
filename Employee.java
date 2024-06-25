package com.mgundogmus.Day2;

public class Employee {
    private String name;
    protected double salary;
    private int age;

    public Employee(String name, double salary,int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

        public String getName(){
            return this.name;

        }
        protected double getSalary() {
            return this.salary;
        }
        private int getAge(){
        return this.age;

    }
}

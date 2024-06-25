package com.mgundogmus.Day2;

public class Main {
    public static void main(String[] args) {
        Engineer employeeOne = new Engineer("İrem Eda",566666,23);

        Salesperson employeeTwo = new Salesperson("İrem Bodur", 65000,24, .25);

        employeeOne.getAnnualBonus();
        employeeOne.getAnnualBonus();
        employeeTwo.raiseCommission();
        employeeTwo.getCommissionPercentage();

        System.out.println(employeeOne.salary);
        System.out.println(employeeOne.getAnnualBonus());
        System.out.println(employeeTwo.salary);
        System.out.println(employeeTwo.getCommissionPercentage());
    }
}

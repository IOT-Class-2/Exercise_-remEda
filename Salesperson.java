package com.mgundogmus.Day2;

public class Salesperson extends Employee{
    // "extends" Employee, Salesperson classını (sınıfını) Employee sınıfından miras aldığını belirtir.
    // "Employee" sınıfından miras aldığını belirtir. Yani " salesperson" sınıfının tüm özelliklerine ve metotlarına sahip olur.

    private double commissionPercentage;

    public Salesperson(String name,double salary,int age,double commissionPercentage){
        super(name,salary,age); //name,salary ve agei başka sınıftan aldığımız için "super"i kullandık.
        this.commissionPercentage= commissionPercentage;

    }

    public double getCommissionPercentage(){
        return this.commissionPercentage;

    }

    public void raiseCommission(){
        if(this.commissionPercentage<.30){
            this.commissionPercentage=
                    this.commissionPercentage*1.2;
        }
    }
}

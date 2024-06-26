package com.mgundogmus.Day2;

public class Engineer extends Employee { // "public" bu sınıfın her yerden erişilebilir olduğunu belirtir.
    // "extends" Employee, Engineer classını (sınıfını) Employee sınıfından miras aldığını belirtir.
    // "Employee" sınıfından miras aldığını belirtir. Yani " engineer" sınıfının tüm özelliklerine ve metotlarına sahip olur.
     //CONSTRUCTER ASLA RETURN DÖNDÜRMEZZZ.

    public Engineer(String name, double salary, int age){ // Bu sınıfın örneği oluşturulurken çağrılan metodudur.
        super(name,salary,age); //"Employee" sınıfının yapıcı metodunu çağırır. "name", "salary", "age" parametreleini
        // "Employee" sınıfına iletir.


    }
    // Constracture ---> Yapıcı Metot
    public double getAnnualBonus(){ // Engineer in yıllık bonusununu hesaplayan metottur. Ve bu metotu döndürür.
        ,
        return super.salary * .05; // Bu metot Employee sınıfındsn alınan maaş/salary değişkenine erişir.
        //Ne ile erişir? super anahtar kelşmesi ile gelişir.
        // Metotun genel işlevi şse maaşın %5'ini hesaplar ve döndürür.  Bu Engineer'in yıllık bonusunu belirler.
    }

}

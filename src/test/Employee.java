package test;

public class Employee {
    String name;
    int age;
    String department;


    public Employee(String name, int age, String department) { // parameter constructor
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public Employee(){
        this.name ="Empoyee";
        this.age =25 ;
        this.department ="IT";
    }
}

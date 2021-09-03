package com.company;

public class Employee {
    String firstName;
    String lastName;
    double salary;
    int id;
    static int count=0;

    Employee(String firstName,String lastName,double salary)throws ImpossibleNameException,TooSmallSalaryException{
        Validator.checkFio(firstName);
        this.firstName= firstName;
        Validator.checkFio(lastName);
        this.lastName=lastName;
        Validator.checkSalary(salary);
        this.salary=salary;
        id=count++;
    }
    public String toString() {
        return "{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}

package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework {

    public static void main(String[] args) throws IOException {
        System.out.println(createEmployee());
        System.out.println(createEmployee());

    }
    public static Employee createEmployee() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        while (true) {
        System.out.println("Введите имя работника");
        String firstName=reader.readLine();
        System.out.println("Введите фамилию работника");
        String lastName=reader.readLine();
        System.out.println("Введите размер зарплаты");
        String salary1=reader.readLine();
            try {
                double  salary=Double.parseDouble(salary1);
                return new Employee(firstName, lastName, salary);
            }
            catch (ImpossibleNameException exception) {
                System.err.println("ФИО имеет цифры или не англ символы "+exception.input );
                System.out.println("Фаимилия или имя написаны неверно попробуйте еще раз");
//                firstName=reader.readLine();
//                lastName=reader.readLine();
            }
            catch (TooSmallSalaryException exc){
            System.err.println("Введенное число отрицательное " + exc.salary);
            System.out.println("Введите новое значение зарплаты");
//            salary1=reader.readLine();
//            salary=Double.parseDouble(salary1);
        }
            catch (NumberFormatException exception){
                System.out.println(exception.getMessage());
            }

        }}
}

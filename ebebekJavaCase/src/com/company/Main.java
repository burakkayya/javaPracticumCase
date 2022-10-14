package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = "";
        double salary = 0;
        float workHours = 0;
        String hireYear = "";

        System.out.println("Ad Soyad : ");
        name = sc.nextLine();
        System.out.println("Maaş : ");
        salary = sc.nextDouble();
        System.out.println("Çalışma Saati : ");
        workHours = sc.nextFloat();
        System.out.println("Başlangıç Yılı : ");
        hireYear = sc.next();
        System.out.println();

        Employee employee = new Employee(name, salary, workHours, hireYear);
        EmployeeManager employeeManager = new EmployeeManager(employee);

        employeeManager.employeeToString();
        System.out.println();
        System.out.println("Bonus : " + employeeManager.bonus() + " TL");
        System.out.println();
        System.out.println("Vergi : " + employeeManager.tax() + " TL");
        System.out.println();
        System.out.println("Toplam maaş : " + (employee.getSalary() + employeeManager.bonus()) + " TL");
        System.out.println();
        System.out.println("Vergi ve bonuslarla birlikte maaş : " + ((employee.getSalary() + employeeManager.bonus()) - employeeManager.tax()) + " TL");
        System.out.println();
        System.out.println("Maaş artışı : " + employeeManager.raiseSalary() + " TL");
        System.out.println();
    }
}

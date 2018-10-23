package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*
    Exercise 1:
    You're a junior java developer in a company called Mex. Your first assignment is to write a simple program that'll generate emai addresses for nwe employees.
    Email address should be built using following pattern: surname.name@mex.com
    In case of people with the same surname and name, there should be a number added to the name - ie. twain.mark@mex.com and twain.mark1@mex.com

    It must be possible to provide a name and surname of new employee from keyboard in console. Then program should print generated email address.
    There're two approaches to hold information that can be used here:
    - data about employees can be stored in the memory and will be gone once program is closed
    - data about employees can be stored in the text file
    */

    public static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("[1] Add new employee");
        System.out.println("[2] Exit");
        int userChoice = 0;
        try {
            userChoice = reader.nextInt();
        } catch (Exception ex) {
            System.err.println("Invalid choice!");
        }

        while(userChoice == 1) {
            System.out.print("Enter surname: ");
            String surname  = reader.next();

            System.out.print("Enter name: ");
            String name  = reader.next();

            String email = setEmail(name, surname);

            Employee employee = new Employee(name, surname, email);
            System.out.println(employee.getEmail());
            employeeList.add(employee);

            System.out.println("\n");
            System.out.println("Choose an option:");
            System.out.println("[1] Add new employee");
            System.out.println("[2] Exit");

            try {
                userChoice = reader.nextInt();
            } catch (Exception ex) {
                userChoice = 2;
                System.err.println("Invalid choice!");
            }
        }
    }

    public static String setEmail(String name, String surname) {
        int coountSameEmployees = checkIfSameEmployeeExists(name, surname);
        if(coountSameEmployees > 0)
            return surname.toLowerCase() + "." + name.toLowerCase() + coountSameEmployees + "@mex.com";

        return surname.toLowerCase() + "." + name.toLowerCase() + "@mex.com";
    }

    public static int checkIfSameEmployeeExists(String name, String surname) {
        int countEmployees = 0;

        for(Employee empl : employeeList) {
            if (name.equals(empl.getName()) && surname.equals(empl.getSurname())) {
                countEmployees++;
            }
        }

        return countEmployees;
    }
}

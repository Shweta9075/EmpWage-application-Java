package com.bridgelabz;

public class EmpWageUsingMethod {
    int is_Full_Time = 1;    //Instance variables
    int is_Part_Time = 2;

    void empPresent() {
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == is_Full_Time)
            System.out.println("Employee is present.");
        if (empcheck == is_Part_Time)
            System.out.println("Employee is absent.");
        }
        public static void main (String[]args){
            EmpWageUsingMethod emp = new EmpWageUsingMethod();
            emp.empPresent();
        }
    }


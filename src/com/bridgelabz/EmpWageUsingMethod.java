package com.bridgelabz;

public class EmpWageUsingMethod {
   public static final int is_Full_Time = 1;    //Instance variables
    public static final int is_Part_Time = 2;
    int empWagePerHrs = 20;
    int empHrs;
    int empWage;
    int partTimeWage;
    int empcheck =(int) Math.floor(Math.random() * 10) % 2;
    void empPresent() {
        if (empcheck == is_Full_Time)
            System.out.println("Employee is present.");
        if (empcheck == is_Part_Time)
            System.out.println("Employee is absent.");
        }
        void empWadge() {
            if (empcheck == is_Full_Time)
                empHrs = 8;
            empWage = empHrs * empWagePerHrs;
            System.out.println("Daily Employee wage = " + empWage);
        }
        void empPartTime(){
        if(empcheck == is_Full_Time) {
            empHrs = 8;
            empWage = empHrs * empWagePerHrs;
            System.out.println("Daily Employee wage = " + empWage);
        }else if(empcheck == is_Part_Time) {
                empHrs = 4;
                partTimeWage = empHrs * empWagePerHrs;
                System.out.println("Part Time employee wage = " + partTimeWage);
            } else
                empHrs = 0;
                partTimeWage = empHrs * empWagePerHrs;
                System.out.println("Part Time employee wage = " + partTimeWage);
        }
        void totalEmpWage(){
        switch (empcheck){
            case is_Full_Time :
                empHrs = 8;
                break;
            case is_Part_Time:
                empHrs = 4;
                break;
            default:
                empHrs = 0;
        }
        }

        public static void main (String[]args){
        EmpWageUsingMethod emp = new EmpWageUsingMethod();
          emp.empPresent();
          emp.empWadge();
          emp.empPartTime();
          emp.totalEmpWage();
        }
    }


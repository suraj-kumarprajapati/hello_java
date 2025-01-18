package com.generics.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/

/*
    when garbage collection works on key ->
    HashMap -> dominates the garbage collector
    WeakHashMap -> does not dominate the garbage collector

* */



class Employee {
    private int empId;
    private String empName;
    private double empSalary;

    public Employee(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }

    @Override
    public void finalize() {
        System.out.println("Just Before Garbage Collection");
    }
}



public class Map3 {


    public static void main(String[] args) {


        Employee emp1 = new Employee(1, "suraj", 2000000000.00);
        Map<Employee, String> hm = new HashMap<>();
        hm.put(emp1, "suraj");
        System.out.println(hm);

        // later on, store null in emp1
        emp1 = null;

        // now call garbage collector
        System.gc();
        System.out.println(hm);
        System.out.println("last line");



//        Employee emp1 = new Employee(1, "suraj", 2000000000.00);
//        Map<Employee, String> whm = new WeakHashMap<>();
//        whm.put(emp1, "Suraj");
//        System.out.println(whm);
//
//        // later on, store null in emp1
//        emp1 = null;
//
//        // now call garbage collector
//        System.gc();
//        System.out.println(whm);
//        System.out.println("last line");

    }

}

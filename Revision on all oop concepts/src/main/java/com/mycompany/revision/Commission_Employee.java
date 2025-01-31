/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revision;

/**
 *
 * @author youss
 */
public class Commission_Employee extends Employee implements Displayable {
    private double gross_salary;
    private double commissions_rate;

    public double getGross_salary() {
        return gross_salary;
    }

    public void setGross_salary(double gross_salary) {
        this.gross_salary = gross_salary;
    }

    public double getCommissions_rate() {
        return commissions_rate;
    }

    public void setCommissions_rate(double commissions_rate) {
        this.commissions_rate = commissions_rate;
    }

    public Commission_Employee() {
    }

    public Commission_Employee(double gross_salary, double commissions_rate, String name, String address, int ssn, Gender sex) {
        super(name, address, ssn, sex);
        this.gross_salary = gross_salary;
        this.commissions_rate = commissions_rate;
    }

    @Override
    public double earnings(){
    return gross_salary * commissions_rate;
}

    @Override
    public String toString() {
        return "Commission_Employee{" + "gross_salary=" + gross_salary + ", commissions_rate=" + commissions_rate + '}';
    }
    @Override
    public void Displayalldeatails(){
       System.out.println(super.toString());
       System.out.println(toString());
   }
    @Override
    public void Displayearning(){
        System.out.println(toString());
    }
}
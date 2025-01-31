/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revision;

/**
 *
 * @author youss
 */
public class Salaried_Employee extends Employee implements Displayable {
    private double salary;
    private double bonus;
    private double deductions;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public Salaried_Employee() {
    }

    public Salaried_Employee(double salary, double bonus, double deductions, String name, String address, int ssn, Gender sex) {
        super(name, address, ssn, sex);
        this.salary = salary;
        this.bonus = bonus;
        this.deductions = deductions;
    }
    
    @Override
    public double earnings(){
        return (salary + bonus)- deductions;
    }
    
    @Override
    public String toString() {
        return "Salaried_Employee{" + "salary=" + salary + ", bonus=" + bonus + ", deductions=" + deductions + '}';
    } 
    @Override
    public void Displayalldeatails(){
        System.out.println(super.toString());
        System.out.println(toString());
    }
    @Override
    public void Displayearning(){
        System.out.println(earnings());
    }
}
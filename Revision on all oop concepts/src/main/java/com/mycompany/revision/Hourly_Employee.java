/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revision;

/**
 *
 * @author youss
 */
public class Hourly_Employee extends Employee implements Displayable {
    private double hour_rate;
    private int numbers_of_hours;

    public double getHour_rate() {
        return hour_rate;
    }

    public void setHour_rate(double hour_rate) {
        this.hour_rate = hour_rate;
    }

    public int getNumbers_of_hours() {
        return numbers_of_hours;
    }

    public void setNumbers_of_hours(int numbers_of_hours) {
        this.numbers_of_hours = numbers_of_hours;
    }

    public Hourly_Employee() {
    }

    public Hourly_Employee(double hour_rate, int numbers_of_hours, String name, String address, int ssn, Gender sex) {
        super(name, address, ssn, sex);
        this.hour_rate = hour_rate;
        this.numbers_of_hours = numbers_of_hours;
    }

    @Override
    public double earnings(){
        return numbers_of_hours * hour_rate;
    }
    
    @Override
    public String toString() {
        return "Hourly_Employee{" + "hour_rate=" + hour_rate + ", numbers_of_hours=" + numbers_of_hours + '}';
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
    
    



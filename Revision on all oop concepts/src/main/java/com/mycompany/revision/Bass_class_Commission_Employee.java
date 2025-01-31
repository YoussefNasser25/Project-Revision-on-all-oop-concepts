/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revision;

/**
 *
 * @author youss
 */
public class Bass_class_Commission_Employee extends Commission_Employee {
    
    private double base;

    public double getBass() {
        return base;
    }

    public void setBass(double bass) {
        this.base = bass;
    }
    @Override
    public double earnings() {
        return base + super.earnings();
    }

    @Override
    public String toString() {
        return "Bass_class_Commission_Employee{" + "base=" + base + '}';
    }
    
    @Override
    public void Displayalldeatails(){
        super.Displayalldeatails();
        Displayearning();
    }
    @Override
    public void Displayearning(){
        System.out.println(earnings());
    }
}

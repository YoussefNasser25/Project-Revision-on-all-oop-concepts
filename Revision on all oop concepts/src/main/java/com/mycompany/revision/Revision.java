/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.revision;

/**
 *
 * @author youss
 */
public class Revision {

    public static void main(String[] args) {
        Department d1 = new Department(1,"Information System");
        
        Salaried_Employee se = new Salaried_Employee(5000, 2000, 1000, "Youssef","Egypt",1200,Gender.Male);
        d1.add_employee(se);
        
        Hourly_Employee he = new Hourly_Employee(100,6,"Faisal", "Riyadh",1200,Gender.Male);
        d1.add_employee(he);
        
        Commission_Employee ce = new Commission_Employee(1500, 2.5,"Ali", "Cairo",1200, Gender.Male);
        d1.add_employee(ce);
        
        System.out.println(d1.employeecount());
        
        //d1.print_basic_data();
        d1.print_all_details();
    }
}

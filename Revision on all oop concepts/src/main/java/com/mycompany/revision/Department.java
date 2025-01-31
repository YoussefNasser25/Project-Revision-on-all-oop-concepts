/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revision;

import java.util.ArrayList;



/**
 *
 * @author youss
 */
public class Department {
  int dno;
  String dname;
ArrayList <Employee> emplist= new ArrayList <Employee>();

    public Department() {
    }

    public Department(int dno, String dname) {
        this.dno = dno;
        this.dname = dname; 
    }

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
    
    public void add_employee(Employee e){
        emplist.add(e);
    }
    public void remove_employee(int idx){
        emplist.remove(idx);
    }
    public int employeecount(){
        return emplist.size();
    }
    public void print_basic_data(){
        for(int i=0; i <emplist.size();i++){
            System.out.println(emplist.get(i).getSsn() + " " + emplist.get(i).getName()+ " "+ emplist.get(i).getSex());
        }
    }
    public void print_all_details(){
        for(int i=0;i<emplist.size();i++){
            if (emplist.get(i) instanceof Salaried_Employee salaried_Employee)
                salaried_Employee.Displayalldeatails();
            if (emplist.get(i) instanceof Hourly_Employee hourly_Employee)
                hourly_Employee.Displayalldeatails();
            if (emplist.get(i)instanceof Commission_Employee commission_Employee)
                commission_Employee.Displayalldeatails();
        }
    }
}

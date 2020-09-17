package com.imooc.set;

import java.util.ArrayList;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"xiaowang",1000);
        Employee employee2 = new Employee(2,"xiaoH",800);
        Employee employee3 = new Employee(3,"xiaohuang",600);

        ArrayList employee = new ArrayList();
        employee.add(employee1);
        employee.add(employee2);
        employee.add(employee3);

        for(int i=0;i<employee.size();i++){
            System.out.println(((Employee)employee.get(i)).getName()+":"+((Employee)employee.get(i)).getSalary());
        }

    }



}

package com.imooc.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1=new Employee("123","xiaowu",20000);
        Employee employee2=new Employee("456","xiaoli",18000);
        Employee employee3=new Employee("456","laowu",25000);

        List<Employee> employeeList=new ArrayList<Employee>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        System.out.println("排序前");
        for(Employee employee:employeeList){
            System.out.println(employee);
        }
        System.out.println("排序后");
        //按工资进行降序排序
        Collections.sort(employeeList);
        for(Employee employee:employeeList){
            System.out.println(employee);
        }
        System.out.println("排序后");
    }
}

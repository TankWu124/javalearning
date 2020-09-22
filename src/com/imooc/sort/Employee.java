package com.imooc.sort;

public class Employee implements Comparable<Employee>{

    private String number;
    private String name;
    private float salary;

    public Employee(String number, String name, float salary) {
        this.number = number;
        this.name = name;
        this.salary = salary;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "员工[" +
                "编号：'" + number + ',' +
                "姓名：" + name + ',' +
                "工资：" + salary +
                ']';
    }

    @Override
    public int compareTo(Employee o) {
        //按工资进行降序排序
        float salary1=this.getSalary();
        float salary2=o.getSalary();
        int n=new Float(salary2-salary1).intValue();
        return n;
    }
}

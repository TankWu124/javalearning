package com.imooc.sort;

public class Student {

    private int number;
    private int years;
    private String name;

    public Student(int number, int years, String name) {
        this.number = number;
        this.years = years;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number='" + number + '\'' +
                ", years=" + years +
                ", name='" + name + '\'' +
                '}';
    }
}

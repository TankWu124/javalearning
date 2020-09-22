package com.imooc.sort;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        //按年龄降序排序
        int age1=o1.getYears();
        int age2=o2.getYears();
        return age2-age1;
    }
}

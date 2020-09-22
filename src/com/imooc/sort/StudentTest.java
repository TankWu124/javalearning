package com.imooc.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {

        Student student01=new Student(123,23,"liming");
        Student student02=new Student(456,20,"zhangsan");
        Student student03=new Student(789,25,"wangwu");

        List<Student> studentList=new ArrayList<Student>();
        studentList.add(student01);
        studentList.add(student02);
        studentList.add(student03);

        System.out.println("排序前");
        for(Student student:studentList)
        System.out.println(student);

        System.out.println("排序后");
        //按名字名字升序排序
        Collections.sort(studentList, new NameComparator());
        for(Student student:studentList)
            System.out.println(student);

        //按年龄进行降序排序
        System.out.println("排序后");
        Collections.sort(studentList,new AgeComparator());
        for(Student student:studentList)
            System.out.println(student);
    }
}

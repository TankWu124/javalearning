package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTest {

    public static void main(String[] args) {
        Student student1=new Student(1,"zhansan",80);
        Student student2=new Student(2,"lisi",90);
        Student student3=new Student(3,"wangwu",98);

        Set set=new HashSet();
        set.add(student1);
        set.add(student2);
        set.add(student3);

        Iterator it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //添加一个重复对象到Set中
        System.out.println();
        System.out.println("*******");
        Student student4=new Student(1,"zhansan",80);
        set.add(student4);
        it=set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

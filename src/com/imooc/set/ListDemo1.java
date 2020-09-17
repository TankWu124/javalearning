package com.imooc.set;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

    public static void main(String[] args) {
//         //用ArrayList存储变成语言的名称，并输出
//        List list = new ArrayList();
//        list.add("java");
//        list.add("C");
//        list.add("Go");
//        list.add("swift");
//        //输出列表中元素的个数
//        System.out.println("列表中元素的个数为："+list.size());
//
//        //遍历输出所有编程语言
//        System.out.println("***********************************");
//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i)+",");
//        }
//
//        //移除列表中的C++
//        System.out.println();
//        list.remove("Go");
//        System.out.println("***********************************");
//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i)+",");
//        }
//    }
    //用ArrayList存储学科的名称

    List subject = new ArrayList();

    //输出列表中元素的个数
	    subject.add("chinese");
        subject.add("math");
        subject.add("english");
        subject.add("chemistry");
        subject.add("physics");
        subject.add("biology");

    //遍历输出所有列表元素
		for(int i=0;i<subject.size();i++){
        System.out.println(subject.get(i));
    }

}
}

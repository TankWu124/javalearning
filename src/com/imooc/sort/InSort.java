package com.imooc.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InSort {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(4);

        System.out.println("排序前");
        for(int n:list){
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println("排序后");
        Collections.sort(list);
        for(int n:list){
            System.out.print(n+" ");
        }

    }
}


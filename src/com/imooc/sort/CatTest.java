package com.imooc.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatTest {

    public static void main(String[] args) {
        //按名字升序排序
        Cat huahua=new Cat("huahua",5,"英国短毛猫");
        Cat fanfan=new Cat("fanfan",2,"中华田园猫");
        Cat maomao=new Cat("maomao",3,"英国短毛猫");
        List<Cat> catList=new ArrayList<Cat>();
        catList.add(huahua);
        catList.add(fanfan);
        catList.add(maomao);

        System.out.println("排序前：");
        for(Cat cat:catList){
            System.out.println(cat);
        }
        //按名字进行排序
        Collections.sort(catList,new NameComparator());
        System.out.println("排序后：");
        for(Cat cat:catList){
            System.out.println(cat);
        }
    }
}
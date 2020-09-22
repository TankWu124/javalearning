package com.imooc.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsTest {

    public static void main(String[] args) {
        Goods g1=new Goods("s00001","手机",2000);
        Goods g2=new Goods("s00002","冰箱",5000);
        Goods g3=new Goods("s00003","电视机",3000);
        List<Goods> goodList=new ArrayList<Goods>();
        goodList.add(g1);
        goodList.add(g2);
        goodList.add(g3);
        //排序前
        System.out.println("排序前");
        for(Goods goods:goodList){
            System.out.println(goods);
        }
        System.out.println("排序后");
        Collections.sort(goodList);
        for(Goods goods:goodList){
            System.out.println(goods);
        }
    }
}

package com.imooc.set;

import java.util.*;

public class FootballDemo {
    public static void main(String[] args) {
        //定义hashMap的对象并添加数据
        Map<Integer, String> worldcup = new HashMap<Integer, String>();
        System.out.println("请输入三组年份对应的HashMap，并存放在HashMap中");
        Scanner console = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.println("请输入年份的值，年份为：");
            Integer key = Integer.valueOf(console.next());
            System.out.println("请输入年份的值，冠军为：");
            String value = console.next();
            worldcup.put(key, value);
            i++;
        }
        //打印输出value的值（直接使用迭代器）
        System.out.println("******************************");
        System.out.println("使用迭代器输出所有的value");
        Iterator<String> it = worldcup.values().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //打印输出key和value的值
        //通过entrySet方法
        System.out.println("通过entrySet方法得到key - value:");
        Set<Map.Entry<Integer, String>> entryset = worldcup.entrySet();
        for (Map.Entry<Integer, String> entry : entryset) {
            System.out.print(entry.getKey() + "-");
            System.out.println(entry.getValue());
        }

    }
}

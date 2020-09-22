package com.imooc.generic;

public class NumGenneric<T> {
    private T num;
    public T getNum(){
        return num;
    }
    public void setNum(T num){
        this.num=num;
    }
    //测试
    public static void main(String[] args) {
        NumGenneric<Integer> intNum=new NumGenneric<>();
        intNum.setNum(10);
        System.out.println("Integer:"+intNum.getNum());

        NumGenneric<Float> floatNum=new NumGenneric<>();
        floatNum.setNum(20.0f);
        System.out.println("Float:"+floatNum.getNum());
    }
}

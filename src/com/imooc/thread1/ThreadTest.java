package com.imooc.thread1;

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(getName()+"正在运行"+i);
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        MyThread mt1=new MyThread("线程1");
        MyThread mt2=new MyThread("线程2");
       // MyThread mt3=new MyThread("线程3");
        mt1.start();
        System.out.println("****");
        mt2.start();
       // mt3.start();
    }
}

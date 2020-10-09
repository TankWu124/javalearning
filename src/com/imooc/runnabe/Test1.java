package com.imooc.runnabe;

class Cat implements Runnable{

    @Override
    public void run(){
        for(int i=0;i<3;i++) {
            System.out.println(Thread.currentThread().getName() + "A Cat");
        }
        }
}
class Dog implements Runnable{

    @Override
    public void run(){
        for(int i=0;i<3;i++) {
            System.out.println(Thread.currentThread().getName() + "A Dog");
        }
    }
}
public class Test1 {

    public static void main(String[] args) {
        Cat cat=new Cat();
        Dog dog=new Dog();
        Thread t1=new Thread(cat);
        Thread t2=new Thread(dog);
        t1.start();
        t2.start();
        for(int i=0;i<3;i++){
            System.out.println("main thread");
        }
    }
}

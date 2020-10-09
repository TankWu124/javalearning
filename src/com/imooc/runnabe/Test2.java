package com.imooc.runnabe;
/*
待完善
 */
class Letter implements Runnable{

    private char[] letter = new char[26];

    public Letter(){

    }

    public char[] getLetter() {
        return letter;
    }

    public void setLetter(char[] letter) {
        this.letter = letter;
    }

    @Override
    public void run(){
        for(int i=0;i<26;i++){
            System.out.println(letter[i]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Test2 {

    public static void main(String[] args) {
        Letter l1=new Letter();
        l1.setLetter(new char[]{'a','b','c','d'});
        Thread t1=new Thread(l1);
        t1.start();
    }
}

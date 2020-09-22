package com.imooc.generic;

import com.sun.webkit.dom.RangeImpl;

import java.util.ArrayList;
import java.util.List;

public class AnimalPlay {

   public void Paly(List<? extends Animal> animal){
       for(Animal a:animal){
           a.animal();
       }
   }


}

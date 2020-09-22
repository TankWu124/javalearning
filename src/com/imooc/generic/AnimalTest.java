package com.imooc.generic;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {

    public static void main(String[] args) {

        List<Dog> dog=new ArrayList<>();
        List<Cat> cat=new ArrayList<>();

        dog.add(new Dog());
        dog.add(new Dog());
        cat.add(new Cat());
        cat.add(new Cat());

        AnimalPlay animalPlay=new AnimalPlay();
        animalPlay.Paly(dog);
        animalPlay.Paly(cat);

    }
}

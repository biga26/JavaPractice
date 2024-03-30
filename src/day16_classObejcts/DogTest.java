package day16_classObejcts;

import java.sql.SQLOutput;

public class DogTest {


    String breed;
    int age;
    String color;
    String name;

    public void meow(){
        System.out.println(name + " is meowing");
    }
    public void oldAge(int plusTwo){
        meow();
        System.out.println(name + " is now " + plusTwo);
    }


}

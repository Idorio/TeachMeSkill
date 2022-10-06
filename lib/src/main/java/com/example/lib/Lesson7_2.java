package com.example.lib;



public class Lesson7_2 {
    public static void main(String[] args) {
        Parrent parrent = new Parrent();
        Mum mum = new Mum();
        checkType(mum);
        Lesson7_2 lesson7_2 = new Lesson7_2();
        System.out.println(lesson7_2.getName(""));

    }



    String getName(String name){
        if (name.isEmpty()){
            return  "NAME CAN`T BE EMPTY";
        }else {
            return name;
        }
    }
    static void checkType(Object object){
        if (object instanceof Mum){
            ((Mum)object).sleep();
        }else {
            System.out.println("Not parent");
        }
    }
}

class Parrent{
    void walk(){
        System.out.println("parent walk");
    }
}

class Dad extends Parrent {
    void walk() {
        System.out.println("dad walk");
    }
}

class Mum extends Parrent {
    void walk() {
        System.out.println("mum walk");
    }
    void sleep(){
        System.out.println("mum is sleeping");
    }
}


package com.example.lib;




public class Child extends Parent {

    protected int age = 12;

    @Override
    void speack() {
       // System.out.println("I speack loudly");
        //super.speack();
    }

    public static void main(String[] args) {
        Parent child = new Child();
        Parent parent = new Parent();
        child.eye_color = "green";
        System.out.println("eye color of the child: "+child.eye_color);
        System.out.println("eye color of the child: "+parent.eye_color);
        child.speack();
        parent.speack();
    }

   // void proheNamber(int number){

    }

   // void proheNamber(int number, String mobile_operator){

class   Parent{
    protected String eye_color = "blue";

    void speack(){
        System.out.println("I speack quietly");
    }
}

class Uncle{
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        System.out.println(parent.eye_color);
        System.out.println(child.age);
    }
}


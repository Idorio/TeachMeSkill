package com.example.lib;

public class Lesson5_1 {
    public static void main(String[] args) {

        //friend.age = 30;
        //friend.name= "Gleb"

    }

}
class Friend{
    private String name;
    private int age;
    private String birthday;

    public Friend(String name2, int age){
        this.name = name2;
        this.age = age;
    }
    void born(){
        String congratulations = "";
        if (birthday == null ||  birthday.isEmpty()){
            congratulations = "no birthday";
        }else {
            congratulations = name + "has birthday on: " + birthday
                    + " " +"he is " + "";
        }

    }
}

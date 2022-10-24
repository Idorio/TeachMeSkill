package com.example.lib.Lesson12;

import java.util.ArrayList;
import java.util.Locale;
import java.util.function.Consumer;

public class Lesson12_1 {

    static Consumer<String> printUpperCase = str -> {
        System.out.print(str.toUpperCase()+ " ");
    };

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("Sasha"));
        users.add(new User("Masha"));
        users.add(new User("Pasha"));
        users.add(new User("Petia"));
        users.add(new User("Marina"));

        users.stream().map(User::getName).forEach(printUpperCase);

//        for (User user : users){
//            System.out.print(user.getName()+ " ") ;
//        }
        System.out.println(users);

        users.stream().map(User::getName).forEach(
                System.out::print
        );







    }
}

class User{
    private String name;
    User(String name){
        this.name=name;
    }
    public String getName(){
        return name;

    }
    public String toString(){

        return name;
    }
}
package com.example.lib.Lesson12;

import java.util.Optional;

public class Lesson12_3 {
    public static void main(String[] args) {
        Optional<Integer> optInt = Optional.empty();
        if (optInt.isPresent()){
            System.out.println(optInt.get());
        }else {
            System.out.println("no value");
        }


    }
}

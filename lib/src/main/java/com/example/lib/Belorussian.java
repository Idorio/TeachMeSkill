package com.example.lib;

public class Belorussian extends Human {
    public static void main(String[] args) {
        Belorussian belorussian = new Belorussian();
        belorussian.speackLanguage();

    }
    @Override
    void speackLanguage(){
        System.out.println("speack belorussian languege");
    }
}


abstract class Human {
    abstract void speackLanguage();
}

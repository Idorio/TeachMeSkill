package com.example.lib;

public class Lesson7 {
    private String privateVar = "Hello";
    String publicVar = "Hello";
    static String staticVar = "Bay";
    public static void main(String[] args) {
        Lesson7 lesson7 = new Lesson7();
        lesson7.callInnerClass();
        lesson7.callNestedClass();

    }
    void callInnerClass(){
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.innerage + " inner class called");
        innerClass.callOuterClassVariable();
    }
    void callNestedClass(){
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.innerage + " nested class called");
        innerClass.callOuterClassVariable();
    }

    class InnerClass{
        int innerage = 18;
        void callOuterClassVariable(){
            System.out.println(privateVar);
            System.out.println(publicVar);
            System.out.println(staticVar);

        }
    }
}









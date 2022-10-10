package com.example.lib;

public class Lesson8 {
    public static void main(String[] args) {
        try {
            getWrongValue(null);
        } catch (ArithmeticException e){
            System.out.println("arithmetic");
        } catch (NullPointerException e){
            System.out.println("null");
        } catch (IndexOutOfBoundsException e){
            System.out.println("index");
        }finally {
            System.out.println("do if success or exception thrown");
        }


    }

    static void getWrongValue(Integer value){
        System.out.println(value.toString());
    }
}

package com.example.lib.Lesson12;

public class Lesson12_2 {
    public static void main(String[] args) {

//        Operationable operationable = new Operationable() {// до лямды
//            @Override
//            public int calculate(int a, int b) {
//                return a + b;
//            }
//        };
//        Operationable<Integer, String> operationable;
//        operationable = (a, b) -> {
//            return a + b + " String";
//        };
//        String result = operationable.calculate(10,20);
//        System.out.println(result);

        Operationable<Integer> operationable;
        operationable = (a, b) -> System.out.println(a + " " + b);
        operationable.calculate(21,22);

//       boolean result = operationable.calculate(10,20);
//        System.out.println(result);

    }
}
//@FunctionalInterface
//interface Operationable1{
//    int calculate(int a, int b);
//}

//interface Operationable2<T>{
//    boolean calculate (T t, T t1);
//}

//interface Operationable3<T, R>{
//    R calculate (T t, T t1);
//    }


interface Operationable<T>{
    void calculate (T t, T t1);
}
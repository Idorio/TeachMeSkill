package com.example.lib.Lesson13Flow;

public class JoinExample {
    public static void main(String[] args) {
        System.out.println("Main thread is running");

        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("Second thread is running");
            }
        };

        thread.start();

//        try {
//            thread.join();
//        }catch (Exception e){
//            System.out.println("caught exception");
//        }
        System.out.println("Main thread is finished");
    }
}

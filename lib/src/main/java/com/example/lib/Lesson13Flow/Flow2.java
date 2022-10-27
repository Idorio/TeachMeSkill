package com.example.lib.Lesson13Flow;
//Второй способ создания потока
public class Flow2 {

    public static void main(String[] args) {
//        ThreadClass3 threadClass3 = new ThreadClass3(){
//            @Override
//            public void run() {
//                System.out.println("Run in Thread is anonym class");
//            }
//        };
//        threadClass3.start();
//
//    }
//}
//
//class ThreadClass3 extends Thread{
//    @Override
//    public void run() {
//        System.out.println("I`m running in Thread");
//    }
//}
//
//class ThreadClass4 implements Runnable{
//    @Override
//    public void run() {
//        System.out.println("I`m running in Runnable");


// Третий способ создания потока
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("I`m running is thread");
            }
        };
        thread.start();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I`m running is runnable");
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();

    }
}

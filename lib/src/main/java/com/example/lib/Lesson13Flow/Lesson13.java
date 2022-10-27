package com.example.lib.Lesson13Flow;
//Первый способ создания потока
public class Lesson13 {

    public static void main(String[] args) {

        Thread thread1 = new Thread();
        thread1.start();

        ThreadClass1 threadClass1 = new ThreadClass1();
        threadClass1.start();

        ThreadClass2 threadClass2 = new ThreadClass2();

        Thread thread2 = new Thread(threadClass2);
        thread2.start();


    }
}

class ThreadClass1 extends Thread{
    @Override
    public void run() {
        System.out.println("I`m running in Thread");
    }
}

class ThreadClass2 implements Runnable{
    @Override
    public void run() {
        System.out.println("I`m running in Runnable");
    }
}

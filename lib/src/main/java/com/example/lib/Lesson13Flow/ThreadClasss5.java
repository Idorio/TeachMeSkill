package com.example.lib.Lesson13Flow;

public class ThreadClasss5 {
    public static void main(String[] args) {

        ThreadClass5 threadClass5 = new ThreadClass5();

        Thread thread1 = new Thread(threadClass5    );
        thread1.start();

        try {
            thread1.join();
        }catch (Exception e){}

        Thread thread2 = new Thread(threadClass5    );
        thread2.start();

    }
}

class ThreadClass5 extends Thread{
    private int count;
    @Override
    public void run() {
        for (int i = 0; i < 10;i++){
            count++;
            System.out.print(count + " ");
        }
    }
}

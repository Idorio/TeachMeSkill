package com.example.lib;

public class MultiThread {
    public static void main(String[] args) {

        ThreadClass threadClass =new ThreadClass();
        Thread thread= new Thread(threadClass);
        thread.start();
        Thread thread1 = new Thread(threadClass);
        thread1.start();

    }
}

class ThreadClass implements Runnable{
    private int count=0;

    @Override
    public void run() {
        for (int i =0;i <10;i++)   {
            count++;
            System.out.print(count+ " ");
        }
    }
}

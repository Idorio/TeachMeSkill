package com.example.lib.Lesson13Flow;


public class FlowSleep {
    public static void main(String[] args) {

        ThreadClass threadClass = new ThreadClass();
        threadClass.start();
        long start = System.currentTimeMillis();
        System.out.println("called is thread: "
                + Thread.currentThread().getName()+ " " + start);
        }

    }


class ThreadClass extends Thread{

    @Override
    public void run() {
        try {
            sleep(2000);
            long start = System.currentTimeMillis();
            Thread thread = Thread.currentThread();
            System.out.println("I run this code in: "
                    + thread.getName()+ " " + start);

        }catch (Exception e) {

        }


        }
    }

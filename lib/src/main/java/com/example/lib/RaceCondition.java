package com.example.lib;

public class RaceCondition {
    public static void main(String[] args) {

        CommonResource commonResource = new CommonResource();
        for (int i=1;i<6;i++){
            Thread thread = new Thread(new CountThread(commonResource));
            thread.setName("Thread: " + i);
            thread.start();
        }
    }
}

class CommonResource{

    int count = 0;
}

class CountThread implements Runnable {

    final CommonResource commonResource;

    CountThread(CommonResource commonResource) {
        this.commonResource = commonResource;
    }

    @Override
    public void run() {
        synchronized (commonResource){


        commonResource.count = 1;
        for (int i = 1; i < 5; i++) {
            System.out.printf(
                    "%s %d \n",
                    Thread.currentThread().getName(),
                    commonResource.count
            );
            commonResource.count++;
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }

        }
    }
}

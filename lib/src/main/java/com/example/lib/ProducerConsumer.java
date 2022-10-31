package com.example.lib;
// wait notify examlple
public class ProducerConsumer {
    public static void main(String[] args) {

        Store store = new Store();
        Prodecer prodecer =new Prodecer(store);
        Consumer consumer=new Consumer(store);

        new Thread(prodecer).start();
        new Thread(consumer).start();

    }
}

class Prodecer implements Runnable {

    Store store;

    Prodecer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            store.put();
        }
    }
}
    class Consumer implements Runnable {

        Store store;

        Consumer(Store store) {
            this.store = store;
        }

        @Override
        public void run() {
            for (int i = 1; i < 6; i++) {
                store.get();
            }

        }
    }

    class Store {
        private int product = 0;

        synchronized void get(){
            while (product <1){
                try {
                    wait();
                }catch (InterruptedException e){
                    System.out.print("get interrupted");
                }
            }
            product--;
            System.out.println("consumer bought 1 product");
            System.out.println("products available: " + product);
            notify();
        }

        synchronized void put(){
            while (product >= 3){
                try {
                    wait();
                }catch (InterruptedException e){
                    System.out.print("get interrupted");
                }
            }
            product++;
            System.out.println("producer made 1 product");
            System.out.println("products available: " + product);
            notify();
        }
    }








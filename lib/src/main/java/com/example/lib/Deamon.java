package com.example.lib;

public class Deamon {
    public static void main(String[] args) {

        ThreadClassDemon threadClassDemon = new ThreadClassDemon();
        threadClassDemon.setDaemon(true);
        threadClassDemon.start();
    }
}

class ThreadClassDemon extends Thread {
    @Override
    public void run() {
        System.out.println("asdads" + Thread.currentThread().isDaemon());
    }
}


package com.company;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.setPriority(Thread.NORM_PRIORITY);
        t1.start();

        Thread t2 = new MyThread();
        t2.start();

        Thread t3 = new MyThread();
        t3.run();

        Thread t4 = new MyThread();
        t4.run();
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("Hara krishna " + Thread.currentThread().getId());
    }
}
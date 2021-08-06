package com.company;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                System.out.println("Thread Running1");
            }
        };
        t1.start();

        MyThread t2 = new MyThread();
        t2.start();

        Runnable runnable = ()->{
            System.out.println("Thread Running3");
        };
        Thread t3 = new Thread(runnable);
        t3.start();
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread Running2");
    }
}

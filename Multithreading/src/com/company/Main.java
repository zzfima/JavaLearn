package com.company;

public class Main {

    public static void main(String[] args) {
        //1 way
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread Running1");
                }
            }
        };
        t1.start();

        //2 way
        MyThread t2 = new MyThread();
        t2.start();

        //3 way
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++)
                System.out.println("Thread Running3");
        };
        Thread t3 = new Thread(runnable);
        t3.start();

        //4 way
        (new Thread(() -> {
            for (int i = 0; i < 10; i++)
                System.out.println("Thread Running4");
        })).start();
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("Thread Running2");
    }
}

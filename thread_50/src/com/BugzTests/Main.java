package com.BugzTests;

public class Main  implements Runnable {

    @Override
    public void run() {
        System.out.println("i am running");
        System.out.println(Thread.getName());

    }


    public static void main(String[] args) {

        Main r = new Main();

        Thread t = new Thread( r,"new one");
        System.out.println(t.isAlive());
        t.start();
        System.out.println(t.isAlive());
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getState());
        System.out.println(t.getPriority());




    }




}
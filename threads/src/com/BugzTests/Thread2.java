package com.BugzTests;

public class Thread2 extends Thread {

    @Override
    public void run() {
        for(int i =10;i>=0;i--){

            System.out.println("THREAD2###  : "+i);
        }
    }
}

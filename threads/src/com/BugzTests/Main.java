package com.BugzTests;

public class Main extends Thread {

    @Override
    public void run() {


        for(int i =0;i<=10;i++){

            System.out.println("THREAD****:  "+i);
        }
    }





    public static void main(String[] args) {
	// write your code here
        Main t1 = new Main();
        Thread2 t2  = new Thread2();
        t1.start();
        t2.start();

        try {
            t1.join();
            System.out.println("#######################################################################################################");
            t2.join();


        }
        catch (InterruptedException e){}

    }
}

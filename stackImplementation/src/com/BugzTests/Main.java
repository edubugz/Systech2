package com.BugzTests;

import java.io.*;
import java.util.ArrayList;

public class Main {

    ArrayList<String> customStack;

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public  Main()
    {
        customStack = new ArrayList<>();
        this.implementingStack(this);
    }


    public void implementingStack(Main s)
    {


        try{

            System.out.println("what do you want to do with the stack ? \n 1: push \n2: pop \n3: view stack");
            String answer = in.readLine();


            switch(answer)
            {
                case "1":
                    System.out.println("enter the item to push");
                    String itemToPush = in.readLine();
                    customStack.add(itemToPush);
                    System.out.println("success,the stack --> "+customStack);
                    continueWithStack();
                    break;

                case"2":
                    if(customStack.size()>0)
                    {
                        System.out.println(customStack);
                        customStack.remove(customStack.size()-1);

                        System.out.println("success,item removed --> " +customStack);
                        continueWithStack();
                    }
                    else
                    {
                        System.out.println("item not in stack");
                        continueWithStack();

                    }
                    break;

                case"3":
                    if(customStack.size()>0)
                    {
                        System.out.println(customStack);
                        continueWithStack();
                    }
                    else
                    {
                        System.out.println("no items in stack");
                        continueWithStack();
                    }
                    break;

                default:
                    System.out.println("invalid choice");
                    implementingStack(this);


            }


        }

        catch (IOException e){}


    }

    private void continueWithStack() {
        System.out.println("do you wish to continue manipulating stack? \n:[Y] for yes ____ [N] for No");

        try {
            String reply = in.readLine();

            switch (reply) {
                case "y":
                    implementingStack(this);
                    break;

                case "n":
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.exit(0);

                    default:
                        System.out.println("invalid choice");
                        continueWithStack();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
	// write your code here
        Main newStack = new Main();
    //    newStack.implementingStack(newStack);
    }
}

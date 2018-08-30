package com.BugzTests.com.BugzTests.com.BugzTests.calculator;

import java.util.Scanner;

public class CalcLogic {





    Scanner input = new Scanner(System.in);

    //call it after every calculation
    public void repeatCalc() {

        System.out.println("got another problem to solve? : enter n for no and y for yes");

        String reply = input.nextLine();

        switch (reply){

            case "n":
                calculator();
                break;
            case "y":
                input.close();
                System.exit(0);
        }
    }


    //logic

    public void calculator() {
        double result=0;
        String userIn = "";
        System.out.println("Use: \n\"/\" to divide \n\"x\" or \"*\" to multiply \n\"+\" for addition \n\"-\" to substract \n\n>");


        //get user input
        userIn  = input.nextLine();



        for (int i=0; i<userIn.length();i++) {

            //division
            if (userIn.charAt(i)=='/') {

                result = Double.parseDouble(userIn.substring(0, i)) / Double.parseDouble(userIn.substring(i+1,userIn.length()));

            }

            //subtraction
            if  (userIn.charAt(i)=='-') {
                result = Double.parseDouble(userIn.substring(0, i)) + Double.parseDouble(userIn.substring(i,userIn.length()));

            }

            //multiplication
            else if  (userIn.charAt(i)=='*') {
                result = Double.parseDouble(userIn.substring(0, i)) * Double.parseDouble(userIn.substring(i+1,userIn.length()));

            }

            //addition
            else if  (userIn.charAt(i)=='+') {

                result = Double.parseDouble(userIn.substring(0, i)) + Double.parseDouble(userIn.substring(i,userIn.length()));

            }
        }




        System.out.println("Answer is: " + result);
    }
}

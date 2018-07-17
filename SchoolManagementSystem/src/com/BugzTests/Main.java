package com.BugzTests;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println();
        // welcome statement
        System.out.println("\t\t\t\t welcome to MU school management system");
        System.out.println("******************************************************************");

        //a call to executeTheChoice made that runs the choice made by the user against a switch case loop and
        //execute the appropriate set of instructions.
        // the implementation of the method is at the bottom of this file

        executeTheChoiceMade();
    }

    private static void executeTheChoiceMade() throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        // this variable will hold the choice made by the user
        String userInput="";

        // object to hold files to read from
        FileInputStream recordsFile = null;

        //the return value from the method getUserInput will be assigned to userInput
        userInput=getUserInput(b);
        try {
            switch (userInput) {
                case "1":  //case 1 to register a student

                    Student newOne = new Student();
                    newOne.register();
                    promptToContinueExecution(b);
                    break;
                case "2": // case 2 to register a staff

                    Staff newStaff = new Staff();
                    newStaff.register();
                    promptToContinueExecution(b);
                    break;

                case "3": // case 3 to read student file content

                    readFile studentFile = new readFile();
                    recordsFile = new FileInputStream("students.txt");
                    studentFile.readFileContent(recordsFile);
                    promptToContinueExecution(b);
                    break;

                case "4":  // case 4 to read staff file content

                    readFile staffRecordsFile = new readFile();
                    recordsFile = new FileInputStream("staff.txt");
                    staffRecordsFile.readFileContent(recordsFile);
                    promptToContinueExecution(b);
                    break;

                case "q":  //if a user press q, the BufferReader closes, file input closes and the system exits
                    b.close();
//                    recordsFile.close();
                    System.exit(0);

                default:  // if a user don't select any of the given choices, prompt the again
                    System.out.println("please input a number indicated on the menu");
                    getUserInput(b);  //redisplay the menu

            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }



    // method that gets the user input when they are given the menu with the
    //various processes available in the system

    private static String getUserInput(BufferedReader b) throws IOException {
        System.out.println("");
        System.out.println("what task do you want to execute? (please enter the number associated with your " +
                "choice in the below menu) \n");

        // the options 1-5
        System.out.println
                (
                        "1: register a student.\n" +
                                "2: register staff.\n" +
                                "3: view registered students.\n" +
                                "4: view registered staff.\n" +
                                "5: press\"q\" to exit"
                );

        //read the user input
return b.readLine();
    }


    // this method prompts the user if the wish to perform another function in the system
    // or they want to exit the system. it reads the user input and runs it against a
    //switch case.

    public static void promptToContinueExecution(BufferedReader b) throws IOException {
        System.out.println("\ndo you want to perform another task ?");
        System.out.println("please press { Y } for YES and { N } for NO");
        String promptAnswer= b.readLine();

        switch (promptAnswer){
            case "y":
                executeTheChoiceMade();   //if the user wishes to continue execution, call the method getUserInput
                // which displays the selection menu
                break;
            case "n":
                b.close();           //else if the user chooses to exit the system, close the BufferedReader and
                //exit the system
                System.exit(0);

            default:
                System.out.println("please input option YES { Y } or NO { N }"); //if user inputs invalid choice prompt them again

                promptToContinueExecution(b);

        }

    }


}




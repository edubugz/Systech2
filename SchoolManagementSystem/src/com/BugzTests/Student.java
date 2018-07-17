package com.BugzTests;
import java.io.*;


public class Student extends Person implements Register {

    //the two class variables unique to class student
    protected String classLevel;
    protected Guardian guardian;

    // getters and setters for the class student instance variables
    public String getClassForm() {
        return classLevel;
    }

    public void setClassLevel(String classForm) {

        this.classLevel = classForm;
    }


    public Guardian getGuardian() {  //custom datatype Guardian

        return guardian;
    }

    public void setGuardian(Guardian guardian) {

        this.guardian = guardian;
    }

     //this method provided by the Register interface
    // carrries out the writing operation to the student file.
   // It has a FileWriter and BufferedWriter objects

    @Override
    public void register( ) throws IOException
    {
        //initialize the filWriter and the BufferedWriter
        FileWriter fileWriter = null;
        BufferedWriter writer = null;

        //Instantiate a Guardian object to hold the guardian details of the object student
        Guardian studentGuardian = new Guardian();

        //initialize buffered reader to read user input in the next phase of prompting for student details
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        try {

            //open the file to write to using the BufferedWriter
            writer = new BufferedWriter(new FileWriter("students.txt",true));

            //prompt the user for the details of the student and set the instance variables to the values

            System.out.println("enter student name");
            this.setName(b.readLine());

            System.out.println("enter student ID");
            this.setIdNo(b.readLine());

            System.out.println("enter student phone number");
            this.setPhoneNumber(b.readLine());

            System.out.println("enter student classLevel");
            this.setClassLevel(b.readLine());

        // start of guardian details prompting and setting the instance variables

            System.out.println("enter guardian name");
            studentGuardian.setName(b.readLine());


            System.out.println("enter guardian id");
            studentGuardian.setIdNo(b.readLine());



        //relate the guardian details to student guardian details

            this.setGuardian(studentGuardian);

         // write the data to the students_file.txt
            writer.newLine();
            writer.append("####################################################");
            writer.newLine();
            writer.append("student name: "+this.getName());
            writer.newLine();
            writer.append("student ID: "+this.getIdNo());
            writer.newLine();
            writer.append("student phone numnber: " +this.getPhoneNumber());
            writer.newLine();
            writer.append("student class level: "+this.getClassForm());
            writer.newLine();
            writer.append(""+this.getGuardian());
            writer.newLine();

         // print the details to the screen for the user

            System.out.println("\n**************** ");
            System.out.println("name: "+this.getName());
            System.out.println("ID no: "+this.getIdNo());
            System.out.println("Class: "+this.getClassForm());
            System.out.println(this.getGuardian());
            System.out.println("**************** \n");


        }

    catch (IOException e){
        System.out.println(e);  //print the IO errors that occured
    }
    finally {
            try {
                writer.close(); // close the writer after the operation
            }

            catch (NullPointerException e){
                System.out.println(e);
            }
        }


        // on a successful registration
        System.out.println("successful in registering \n");
    }
}

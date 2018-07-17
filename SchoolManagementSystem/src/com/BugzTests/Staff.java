package com.BugzTests;

import java.io.*;

public class Staff extends Person implements Register {
    protected StaffRole role; //custom datatype


    // setters and getters for the class variables
    public StaffRole getRole() {
        return role;
    }

    public void setRole(StaffRole role) {
        this.role = role;
    }


    //this method carrries out the writing operation to the staff file.
    // It has a FileWriter and BufferedWriter objects
    public void register( ) throws IOException
    {
        //initialize Bufferwriter and reader
        BufferedWriter writer = null;
        StaffRole staffRoles = new StaffRole();
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        try {
            //get the file to write to
            writer = new BufferedWriter(new FileWriter("staff.txt",true));

            // prompt for the staff details and set them as the instance variables values
            System.out.println("enter staff name:");
            this.setName(b.readLine());

            System.out.println("enter staff ID:");
            this.setIdNo(b.readLine());

            System.out.println("enter staff phone number:");
            this.setPhoneNumber(b.readLine());


            // start of role details
            System.out.println("enter designation name:");
            staffRoles.setDesignation(b.readLine());


            //relate roles to staff
            this.setRole(staffRoles);

            //write the values to a file
            writer.newLine();
            writer.append("####################################################");
            writer.newLine();
            writer.append("staff name: "+this.getName());
            writer.newLine();
            writer.append("staff ID: "+this.getIdNo());
            writer.newLine();
            writer.append("staff phone number: " +this.getPhoneNumber());
            writer.newLine();
            writer.append(""+this.getRole());
            writer.newLine();

            System.out.println("name: "+this.getName());
            System.out.println("ID no: "+this.getIdNo());
            System.out.println(this.getRole()+"\n");



        }
            // release held system resources
        catch (IOException e){
            System.out.println(e);
        }
        finally {
            writer.close();
        }


        // on a successful registration
        System.out.println("successful in registering");

    }



}

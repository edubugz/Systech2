package com.BugzTests;

public class StaffRole {

    //overide toString method
    @Override
    public String toString() {
        return "StaffRole{" +
                "Designation='" + designation + '\'' +
                '}';
    }

    //getters and setters for the class variables

    protected String designation;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}

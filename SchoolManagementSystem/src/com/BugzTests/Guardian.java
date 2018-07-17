package com.BugzTests;

public class Guardian extends Person {


    // override the toString method to return a string description of the object Guardian
    @Override
    public String toString() {
        return "Guardian Details { " + "name = "+ name +
                ",IdNo= " + IdNo +
                ", phoneNumber=" + phoneNumber ;
    }


}

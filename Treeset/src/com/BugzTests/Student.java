package com.BugzTests;

public class Student implements Comparable  {
    String admission;

    @Override
    public String toString() {
        return "Student{" +
                "admission='" + admission + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }

    String firstName;




    public Student(String admission, String firstName) {
        this.admission = admission;
        this.firstName = firstName;
    }

 public int comparest(Student s){

        return this.firstName.compareTo(s.firstName);
 }


    @Override
    public int compareTo(Object s) {
        int comp= comparest((Student)s);
        return comp;
    }
}



package com.BugzTests;

public class Node {
    String FirstName;
    String LastName;
    String Unit;
    String Course;
    String Gender;
    String Age;
    String Grade;
    Node next;

    @Override
    public String toString() {
        return "First name: "+FirstName +"\n"+"Last name: "+LastName +"\n"+"Unit: "+  Unit +"\n"+"course: "+  Course +
                "\n"+"Gender: "+ Gender +"\n"+"Age: "+Age +"\n"+"Grade: "+Grade+"\n"+"next: "+next.FirstName;
    }

    public Node(String firstName, String lastName, String unit, String course, String gender, String age, String grade)
    {
        FirstName = firstName;
        LastName = lastName;
        Unit = unit;
        Course = course;
        Gender = gender;
        Age = age;
        Grade = grade;

    }
}

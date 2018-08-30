package com.BugzTests;

import java.io.*;


public class Main {
    Node head;
    Node tail;

    @Override
    public String toString() {
        return "Main{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }

    public void add(String firstName, String lastName, String unit, String course, String gender, String age, String grade){

        Node node = new Node(firstName,lastName,unit,course,gender,age,grade);

        if (tail == null || head.FirstName.equals("FirstName")){

            head = node;
            tail = node;
            }

        else {
            tail.next = node;
            tail = node;


        }


    }

    public void printAll(){
        Node node = head;
        while(node.next!=null){
            System.out.println(node);
            System.out.println();
            node = node.next;
        }
    }


    public static void main(String[] args) throws IOException  {

        BufferedReader input = new BufferedReader(new FileReader("student.txt"));
        String line = input.readLine();
        Main newNode = new Main();


        while (line !=null && !line.isEmpty())
        {
            String [] str = line.split(",");
            int i =0;

                newNode.add(str[i],str[i+1],str[i+2],str[1+3],str[i+4],str[i+5],str[i+6]);
                line=input.readLine();

        }

        newNode.printAll();

    }


}

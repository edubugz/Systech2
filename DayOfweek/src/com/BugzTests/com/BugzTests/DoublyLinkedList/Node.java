package com.BugzTests.com.BugzTests.DoublyLinkedList;

public class Node {

    protected int data;

    protected Node next;
    protected Node prev;

    public Node(int d, Node n, Node p)

    {

        data = d;

        next = n;

        prev = p;

    }

    //get data in the nodes
    public int getData()

    {

        return data;

    }


 //set next
    public void setLinkNext(Node n)

    {

        next = n;

    }


    //previous
    public void setLinkPrev(Node p)

    {

        prev = p;

    }


    //get link to next
    public Node getLinkNext()

    {

        return next;

    }


//get link to previus
    public Node getLinkPrev()

    {

        return prev;

    }
}

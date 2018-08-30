package com.BugzTests.com.BugzTests.DoublyLinkedList;

public class DoubleList {

    protected Node head;

    protected Node tail ;

    public static int size;

    public DoubleList()
    {
        head = null;

        tail = null;

        size = 0;
    }


    public boolean isEmpty()

    {

        return head == null;

    }

    public void insertAtTheStart(int num)

    {

        Node newOne= new Node(num, null, null);

        if(head == null)

        {

            head = newOne;

            tail = head;

        }

        else

        {

            head.setLinkPrev(newOne);

            newOne.setLinkNext(head);

            head = newOne;

        }

        size++;

    }

    public void insertAtTheEnd(int num)

    {

        Node newNode = new Node(num, null, null);

        if(head == null)

        {

            head = newNode;

            tail = head;

        }

        else

        {

            newNode.setLinkPrev(tail);

            tail.setLinkNext(newNode);

            tail = newNode;

        }

        size++;

    }


    //to display all data held in the list

    public void display()

    {

        System.out.print("\n List = ");

        // no node
        if (size == 0)

        {

            System.out.print("list is empty\n");

            return;

        }

        // only one node  == head
        if (head.getLinkNext() == null)

        {

            System.out.println(head.getData() );

            return;

        }


        // else there is more than one node in the list
        // print head data first
        System.out.print(head.getData()+ " ***");

        Node begin = head;
        begin = head.getLinkNext();

        // print the linked nodes data
        while (begin.getLinkNext() != null)

        {

            System.out.print(begin.getData()+ " **** ");

            begin = begin.getLinkNext();

        }

        // print last node data
        System.out.print(begin.getData()+ "\n");

    }


    //delete a node in the list

    public void deleteAtSpecificPosition(int pos)

    {
        //want to delete head
        if (pos == 1)

        {

            //if list of size one
            if (size == 1)

            {
                //set head to null
                head = null;

                //set tail to null since head is the tail too
                tail = null;

                //size to zero since it empty now
                size = 0;

                return;

            }

            //at this point it means there are more nodes other than head
            head = head.getLinkNext();

            head.setLinkPrev(null);

            size--;

            return ;

        }

        //at the end of the list
        if (pos == size)

        {

            //set previous of tail as the new tail
            tail = tail.getLinkPrev();

            //next of tail to null-- break link
            tail.setLinkNext(null);

            size-- ;

        }

        //in the middle

        Node ptr = head.getLinkNext();

        for (int i = 2; i <= size; i++)

        {

            //found the position to delete
            if (i == pos)

            {

                Node p = ptr.getLinkPrev();

                Node n = ptr.getLinkNext();


                //link previus and next of the node found thus eliminating it from the list
                p.setLinkNext(n);

                n.setLinkPrev(p);

                size-- ;

                return;

            }

            //not yet found, go to the next
            ptr = ptr.getLinkNext();

        }

    }


}

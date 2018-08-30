package com.BugzTests;

public class Main {

    static int toprint = 1;

    public void floydTriangle(int row)
    {
        for(int i=1;i<=row;i++)
        {

            for(int j=0;j<i;j++)
            {
                System.out.print(toprint);
                toprint++;
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {

       Main triangle = new Main();
       triangle.floydTriangle(5);

        }

    }


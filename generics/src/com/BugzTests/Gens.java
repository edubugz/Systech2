package com.BugzTests;

public class Gens <T extends juice & Maembe,V > {

    private T ob1;
    private  V ob2;

    public Gens(T ob1, V ob2)
    {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }


    public Class getOb1() {
        return  ob1.getClass();
    }


    public Class getOb2() {
        return ob2.getClass();
    }



    public void checkType()
    {
        System.out.println(getOb1());
        System.out.println(getOb2());

    }

    public  <K> void  checkIt( K k){

        System.out.println(k.getClass());
       // System.out.println(l.getClass());




    }


}

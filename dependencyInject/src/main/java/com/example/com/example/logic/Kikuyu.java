package com.example.com.example.logic;

import javax.inject.Named;
import java.io.Serializable;

@Named("kuyu")
public class Kikuyu implements Heloo,Serializable {
    @Override
    public String sayHeloo() {

        String greeting = "uga mani";
        return greeting;
    }
}

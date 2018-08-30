package com.example.com.example.logic;

import javax.inject.Named;
import java.io.Serializable;

@Named("mathai")
public class Maasai implements Heloo,Serializable {

    @Override
    public String sayHeloo() {
        String greeting = "ero";
        return greeting;
    }
}

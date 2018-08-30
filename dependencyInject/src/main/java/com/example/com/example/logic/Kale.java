package com.example.com.example.logic;

import javax.inject.Named;
import java.io.Serializable;

@Named("kale")
public class Kale implements Heloo,Serializable {
    @Override
    public String sayHeloo() {
        String greeting = "chamegei";
        return greeting;
    }
}

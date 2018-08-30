package com.example.com.example.logic;


import javax.inject.Inject;
import javax.inject.Named;

public class Greeting {

    @Inject
    @Named("kale")
    public Heloo kale;

    @Inject
    @Named("kuyu")
    public Heloo kuyu;

    @Inject
    @Named("mathai")
    public Heloo mathai;


}

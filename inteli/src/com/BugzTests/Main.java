package com.BugzTests;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        KeyGenerator keyGenerator = new KeyGenerator();
        String name = "Gurkan CAKIR";

        Random r = new Random();
        System.out.println(keyGenerator.MakeKey(name, 0, r.nextInt(100000)));
    }
}

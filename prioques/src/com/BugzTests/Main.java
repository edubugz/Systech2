package com.BugzTests;

import java.util.PriorityQueue;

public class Main implements Comparable {
    @Override
    public String toString() {
        return "Main{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    String title;
    String author;

    public Main(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {

        PriorityQueue<Main> lib = new PriorityQueue<>();

        Main b1 = new Main("who is this","kike");
        Main b2 = new Main ("what what","shiku");

        lib.add(b1);
        lib.add(b2);

        System.out.println(lib);

        System.out.println(lib.peek());
        lib.poll();
        System.out.println(lib);




    }
}

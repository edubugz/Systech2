package com.edwin.beans;

import java.io.Serializable;

public class student implements Serializable {

    private String name;
    private int id;

    public student()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}

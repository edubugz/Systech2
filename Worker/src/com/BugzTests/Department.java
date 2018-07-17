package com.BugzTests;

public class Department {
    String name;
    String code;
    String HOD;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", HOD='" + HOD + '\'' +
                '}';
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getHOD() {
        return HOD;
    }

    public void setHOD(String HOD) {
        this.HOD = HOD;
    }
}

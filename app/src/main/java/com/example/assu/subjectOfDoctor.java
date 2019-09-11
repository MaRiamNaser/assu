package com.example.assu;

public class subjectOfDoctor  {

    String name;
    String logoName;

    public subjectOfDoctor()
    {}

    public subjectOfDoctor (String name, String logoName) {
        this.name = name;
        this.logoName = logoName;
    }

    public String getName() {
        return name;
    }

    public String getLogoName() {
        return logoName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogoName(String logoName) {
        this.logoName = logoName;
    }
}

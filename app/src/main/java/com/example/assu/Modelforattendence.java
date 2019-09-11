package com.example.assu;


public class Modelforattendence {

    private String nmae;
    private String id;
    private String level;

    public Modelforattendence(String name, String id, String level) {
        this.nmae=name;
        this.id=id;
        this.level=level;
    }

    public void setNmae(String nmae) {
        this.nmae = nmae;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getNmae() {
        return nmae;
    }

    public String getId() {
        return id;
    }

    public String getLevel() {
        return level;
    }
}
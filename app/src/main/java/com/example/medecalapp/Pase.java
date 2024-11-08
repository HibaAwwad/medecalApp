package com.example.medecalapp;

public class Pase {




    private String name;

    public Pase(String name) {
        this.name = name.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

}

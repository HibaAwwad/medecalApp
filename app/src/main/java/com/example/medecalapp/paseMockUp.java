package com.example.medecalapp;

import java.util.ArrayList;
import java.util.List;


public class paseMockUp {

    public List<Pase> pase;
    public paseMockUp(){
        pase = new ArrayList<>();
        pase.add(new Pase("Arm"));
        pase.add(new Pase("Legs"));
        pase.add(new Pase("Abdomen"));
    }

}

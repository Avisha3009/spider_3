package com.example.superheroes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Biography {
    private String fullName;
    private String alterEgos;
    private List<String> aliases = new ArrayList<String>();
    private String placeOfBirth;
    private String firstAppearance;
    private String publisher;
    private String alignment;
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getAlterEgos() {
        return alterEgos;
    }
    public void setAlterEgos(String alterEgos) {
        this.alterEgos = alterEgos;
    }
    public List<String> getAliases() {
        return aliases;
    }
    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }
    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
    public String getFirstAppearance() {
        return firstAppearance;
    }
    public void setFirstAppearance(String firstAppearance) {
        this.firstAppearance = firstAppearance;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getAlignment() {
        return alignment;
    }
    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }
}
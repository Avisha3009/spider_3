package com.example.superheroes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Appearance {
    private String gender;
    private Object race;
    private List<String> height = new ArrayList<String>();
    private List<String> weight = new ArrayList<String>();
    private String eyeColor;
    private String hairColor;
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Object getRace() {
        return race;
    }
    public void setRace(Object race) {
        this.race = race;
    }
    public List<String> getHeight() {
        return height;
    }
    public void setHeight(List<String> height) {
        this.height = height;
    }
    public List<String> getWeight() {
        return weight;
    }
    public void setWeight(List<String> weight) {
        this.weight = weight;
    }
    public String getEyeColor() {
        return eyeColor;
    }
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
    public String getHairColor() {
        return hairColor;
    }
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}
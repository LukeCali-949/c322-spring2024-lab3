package iu.edu.lukemeng.c322spring2024lab3.model;

public class AnimalData {
    public String getName() {
        return name;
    }

    public String getPicture() {
        return picture;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String name;
    private String picture;
    private String location;
}

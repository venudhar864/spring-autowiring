package com.example.service;

public class City {

    private int id;
    private String name;

    // property name must match bean id
    private State state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // required setter for byName autowiring
    public void setState(State state) {
        this.state = state;
    }

    public void showCityDetails() {
        System.out.println("City Id : " + id);
        System.out.println("City Name : " + name);
        System.out.println("State : " + state.getName());
    }
}
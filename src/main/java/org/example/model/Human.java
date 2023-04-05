package org.example.model;

public abstract class Human{
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


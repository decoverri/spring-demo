package com.infinityworks.training.demo.models;

import javax.validation.constraints.NotNull;

public class Person {

    @NotNull
    private String name;
    private int id;

    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    public Person(){
        this("Deco", 34);
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

}

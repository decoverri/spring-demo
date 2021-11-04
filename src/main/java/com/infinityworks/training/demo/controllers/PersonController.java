package com.infinityworks.training.demo.controllers;

import javax.validation.Valid;

import com.infinityworks.training.demo.models.Person;

import org.springframework.boot.context.properties.bind.validation.ValidationErrors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    
    @GetMapping("/person/")
    public Person getPerson(@Valid Person person, ValidationErrors errors){
        return person;
    }

    @GetMapping("/person/{id}")
    public Person getPersonById(@PathVariable int id){
        return new Person("Deco", id);
    }

    @PostMapping("/person")
    public Person createPerson(String name){
        return new Person(name, 3);
    }
    
}

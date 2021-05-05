package com.company.creatures;

import java.io.File;

public class Pet extends Animal {
    String species;
    Double weight;
    public String name;
    File pic;

    public Pet(String species, Double weight, String name) {
        super(species, weight, name);
        this.species = species;
        this.weight = weight;
        this.name = name;
    }
}

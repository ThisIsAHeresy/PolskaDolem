package com.company.creatures;

import java.io.File;

public class FarmAnimal extends Animal implements Edible{
    String species;
    Double weight;
    String name;

    File pic;

    public FarmAnimal(String species, Double weight, String name) {
        super(species, weight, name);
        this.species = species;
        this.weight = weight;
        this.name = name;
    }


    @Override
    public void beEaten() {
        System.out.println("Omnomnomnom.");
    }
}

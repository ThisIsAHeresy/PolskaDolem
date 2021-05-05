package com.company;

import java.io.File;

public class Animal {
    String species;
    Double weight;
    String name;
    File pic;

    void feed() {
        if (this.weight < 0) {
            System.out.println(this.name + " is dead");
        }
        else {
            System.out.println("Thx for food");
            this.weight += 2;
        }
    }

    public String toString(){
        return name;
    }

    void spacer() {
        if (this.weight < 0) {
            System.out.println(this.name + " is dead");
        }
        else {
            System.out.println("Wyprowadziłeś " + this.name + " na spacer.");
            this.weight -= 2;
        }
    }
}

package com.company.creatures;

import com.company.Human;
import com.company.Salable;

import java.io.File;

public abstract class Animal implements Salable, Feedable {
    public String species;
    Double weight;
    public String name;
    File pic;

    public Animal(String species, Double weight, String name) {
        this.species = species;
        this.weight = weight;
        this.name = name;
    }


    public void feed() {
        if (this.weight < 0) {
            System.out.println(this.name + " is dead");
        }
        else {
            System.out.println("Thx for food");
            this.weight += 2;
        }
    }

    @Override
    public void feed(double foodWeight) {
        if (this.weight < 0) {
            System.out.println(this.name + " is dead");
        }
        else {
            System.out.println("Thx for food");
            this.weight += foodWeight;
        }
    }

    public String toString(){
        return name;
    }

    public void spacer() {
        if (this.weight < 0) {
            System.out.println(this.name + " is dead");
        }
        else {
            System.out.println("Wyprowadziłeś " + this.name + " na spacer.");
            this.weight -= 2;
        }
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.pet!=this) {
            System.out.println("Sprzedający nie ma zwierzaka.");
        } else if (buyer.cash < price) {
            System.out.println("Kupujący nie ma hajsa.");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println("Udało się sprzedać zwierzaka.");
        }
    }
}

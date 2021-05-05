package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
	   Animal dog = new Pet("Border collie", 18.5, "Pies");
	   Animal cat = new FarmAnimal("Felis catus", 2.0, "<3");

	   System.out.println(dog.name);
	   System.out.println(dog.species);

	   dog.feed();
	   dog.spacer();
		dog.spacer();
		dog.spacer();
		Car car1 = new Car("OwO", "Avi", 3241);
//		Car car2 = new Car("OwOwO", "Renault");
//		Car car3 = new Car("OwO", "Avi");
		System.out.println(car1);
		Human me = new Human();
		Phone samsung = new Phone("samsung", "woowowow", 1922);
		me.mobilePhone = samsung;
		me.cash = 0.0;
		Human bro = new Human();
		bro.cash = 1000.0;
		samsung.sell(me, bro, 100.0);
		samsung.sell(bro, me, 200.0);

	}
}

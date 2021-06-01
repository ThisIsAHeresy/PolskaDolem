package com.company;

import com.company.cars.Disel;
import com.company.cars.LPG;
import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.devices.Application;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {
	   Animal dog = new Pet("Border collie", 18.5, "Pies");
	   Animal cat = new FarmAnimal("Felis catus", 2.0, "<3");

	   System.out.println(dog.name);
	   System.out.println(dog.species);

	   dog.feed();
	   dog.spacer();
		dog.spacer();
		dog.spacer();
		//Car car1 = new Car("OwO", "Avi", 3241);
//		Car car2 = new Car("OwOwO", "Renault");
//		Car car3 = new Car("OwO", "Avi");
		//System.out.println(car1);
		Human me = new Human(3);
		Phone samsung = new Phone("samsung", "woowowow", 1922, 32.0);
		me.mobilePhone = samsung;
		me.cash = 0.0;
		Human bro = new Human(3);
		bro.cash = 1000.0;
		samsung.sell(me, bro, 100.0);
		samsung.sell(bro, me, 200.0);
		Disel car1 = new Disel("OwO", "Avi", 32321, 100.0, me);
		LPG car2 = new LPG("WWW", "Avi", 222, 200.0, me);
		Human you = new Human(3);
		you.cash = 200.0;
		Phone soniak = new Phone("sony", "Incredible 22", 1922, 32.0);
		soniak.installAnnApp("Proton", "20.1", "https://example.com", 20.11, you);
		soniak.alphaApps();
		soniak.priceApps();
	}
}
